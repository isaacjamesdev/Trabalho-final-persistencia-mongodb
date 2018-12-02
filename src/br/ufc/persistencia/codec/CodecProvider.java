package br.ufc.persistencia.codec;

import java.util.ArrayList;
import java.util.List;

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
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.DBRef;
import com.mongodb.util.JSON;

@SuppressWarnings("deprecation")
public class CodecProvider implements IcodecProvider{
	private static final Gson gson = new Gson();
	private static CodecProvider codecProvider;
	
	public void read(){
		DBObject query = new BasicDBObject("_id", 2);
		DBCursor cursor = collection.find(query);
		
		System.out.println((String)cursor.one().get("projeto"));
		mongoClient.close();
	}
	
	private CodecProvider() {}
	//singleton pattern
 	public static CodecProvider getInstance(){
		 return codecProvider == null ? new CodecProvider() : codecProvider ;
	}
	
	private List<DBRef> dbrefsProjetos(List<Projeto> projetos) {
		List<DBRef> dbrefs = new ArrayList<DBRef>();
		for (Projeto projeto : projetos)
				dbrefs.add(new DBRef("projeto", projeto.get_id()));
		return dbrefs;
	}	
	
	private List<DBRef> dbrefsFuncionario(List<AbstractFuncionario> pessoas) {
		List<DBRef> dbrefs = new ArrayList<DBRef>();
		for (AbstractPessoa pessoa : pessoas)
				dbrefs.add(new DBRef("funcionario", pessoa.get_id()));
		return dbrefs;
	}
	
	private Object dbrefsPesquisador(List<Pesquisador> pesquisadores) {
		List<DBRef> dbrefs = new ArrayList<DBRef>();
		for (Pesquisador pesquisador: pesquisadores)
				dbrefs.add(new DBRef("projeto", pesquisador.get_id()));
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
				.append("departamento", new DBRef("projeto", funcionario.getDepartamento().get_id()));
	}


	@Override
	public BasicDBObject codec(Departamento departamento) {
		return new BasicDBObject("numero", departamento.getNumero())
									.append("nome", departamento.getNome())
									.append("projetos", dbrefsProjetos(departamento.getProjetos()))
									.append("funcionarios", dbrefsFuncionario(departamento.getFuncionarios()));
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
		return codec((AbstractFuncionario)pesquisador).append("projetos", dbrefsProjetos(pesquisador.getProjetos()));
	}

	@Override
	public BasicDBObject codec(Projeto projeto) {
		return new BasicDBObject("_id", projeto.get_id())
								.append("nome", projeto.getNome())
								.append("periodo", projeto.getPeriodoDesenvolvimento())
								.append("departamento", new DBRef("departamento", projeto.getDepartamento().get_id()))
								.append("pesquisadores", dbrefsPesquisador(projeto.getPesquisadores()));
	}
	
	@Override
	public BasicDBObject codec(Secretario secretario) {
		return (BasicDBObject)JSON.parse(gson.toJson(secretario));
	}

}
