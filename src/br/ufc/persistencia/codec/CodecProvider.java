package br.ufc.persistencia.codec;

import java.util.ArrayList;
import java.util.List;

import br.ufc.persistencia.connection.MongoConnection;
import br.ufc.persistencia.model.AbstractFuncionario;
import br.ufc.persistencia.model.AbstractPessoa;
import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.Dependente;
import br.ufc.persistencia.model.FuncionarioLimpeza;
import br.ufc.persistencia.model.Pesquisador;
import br.ufc.persistencia.model.Projeto;
import br.ufc.persistencia.model.Secretario;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.DBRef;
import com.mongodb.util.JSON;

@SuppressWarnings("deprecation")
public class CodecProvider implements IcodecProvider{
	private static final Gson gson = new Gson();
	private static CodecProvider codecProvider;
	private static final DB database = MongoConnection.getInstance().getDatabase();
	private CodecProvider() {}
	//singleton pattern
 	public static CodecProvider getInstance(){
		 return codecProvider == null ? new CodecProvider() : codecProvider ;
	}
 	
 	//READ
	public String read(String collection, int numero){
		DBCollection dbcollection = database.getCollection(collection);
		DBObject query = new BasicDBObject("numero", numero);
		DBCursor cursor = dbcollection.find(query);
		
		MongoConnection.getInstance().getMongoclient().close();
		return (String)cursor.one().get("_id");
	}
	public String read(String collection, String nome){
		DBCollection dbcollection = database.getCollection(collection);
		DBObject query = new BasicDBObject("nome", nome);
		DBCursor cursor = dbcollection.find(query);
		
		MongoConnection.getInstance().getMongoclient().close();
		return (String)cursor.one().get("_id");
	}
	
	//dbres
	private List<DBRef> dbrefsInteger(String collection,List<Integer> list) {
		List<DBRef> dbrefs = new ArrayList<DBRef>();
		
		for (Integer item : list)
				dbrefs.add(new DBRef(collection, read(collection, item)));
		return dbrefs;
	}	
	
	private List<DBRef> dbrefsString(String collection,List<String> list) {
		List<DBRef> dbrefs = new ArrayList<DBRef>();
		
		for (String item : list)
				dbrefs.add(new DBRef(collection, read(collection, item)));
		return dbrefs;
	}	
	
	
	@Override
	public BasicDBObject codec(AbstractPessoa pessoa) {
		return (BasicDBObject)JSON.parse(gson.toJson(pessoa));
	}
	
	@Override
	public BasicDBObject codec(AbstractFuncionario funcionario) {
		return codec((AbstractPessoa)funcionario)
				.append("endereco", funcionario.getEndereco())
				.append("salario", funcionario.getSalario())
				.append("departamento", new DBRef("projeto", read("projeto", funcionario.getDepartamento())));
	}


	@Override
	public BasicDBObject codec(Departamento departamento) {
		return new BasicDBObject("numero", departamento.getNumero())
									.append("nome", departamento.getNome())
									.append("projetos", dbrefsString("projetos",departamento.getProjetos()))
									.append("funcionarios", dbrefsString("departamentos",departamento.getFuncionarios()));
	}

	@Override
	public BasicDBObject codec(Dependente dependente) {
		return codec(dependente).append("parentesco", dependente.getParentesco());
									
	}

	@Override
	public BasicDBObject codec(FuncionarioLimpeza funLimpeza) {
		return codec((AbstractFuncionario)funLimpeza).append("horas", funLimpeza.getJornadaTrabalho());
	}

	@Override
	public BasicDBObject codec(Pesquisador pesquisador) {
		return codec((AbstractFuncionario)pesquisador).append("projetos", dbrefsString("projetos", pesquisador.getProjetos()));
	}

	@Override
	public BasicDBObject codec(Projeto projeto) {
		return new BasicDBObject("_id", projeto.get_id())
								.append("nome", projeto.getNome())
								.append("periodo", projeto.getPeriodoDesenvolvimento())
								.append("departamento", new DBRef("departamento", projeto.getDepartamento()))
								.append("pesquisadores", dbrefsString("pesquisadores", projeto.getPesquisadores()));
	}
	
	@Override
	public BasicDBObject codec(Secretario secretario) {
		return (BasicDBObject)JSON.parse(gson.toJson(secretario));
	}

}
