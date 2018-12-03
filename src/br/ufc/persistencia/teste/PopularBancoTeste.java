package br.ufc.persistencia.teste;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import br.ufc.persistencia.codec.CodecProvider;
import br.ufc.persistencia.connection.MongoConnection;
import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.FuncionarioLimpeza;
import br.ufc.persistencia.model.Pesquisador;
import br.ufc.persistencia.model.Projeto;
import br.ufc.persistencia.model.TipoSexo;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */

public class PopularBancoTeste {
//	private static final DB database = MongoConnection.getInstance().getDatabase();

	private static final MongoClient mongoClient = new MongoClient();
	private static final DB database = mongoClient.getDB("testePersistence");

	public static void main(String[] args) {
		popularPesquisador();
		popularDepartamento();
//		popularProjeto();
		
//		mongoClient.close();
	}
	
	public static void popularDepartamento() {
		Departamento rh = new Departamento(11, "Moranga");
		
		rh.setFuncionarios(Arrays.asList("Isaac","Diego"));
		rh.setProjetos(Arrays.asList("aps","portifolio"));
		
		database.getCollection("departamentos")
				.insert(CodecProvider.getInstance()
						.codec(rh));
		System.out.println("inserido");
	}
	
	public static void popularProjeto() {
		
		database.getCollection("projetos")
		.insert(CodecProvider.getInstance()
				.codec(new Projeto("aps", 120, 10)));
		
		database.getCollection("projetos")
		.insert(CodecProvider.getInstance()
				.codec(new Projeto("portifolio", 40, 10)));
		
	}
	
	public static void popularPesquisador() {
		Pesquisador isaac = new Pesquisador("Isaac", TipoSexo.MASC, Calendar.getInstance(), "rua 10 de agosto",
				new BigDecimal(9000),10, "Boas Praticas");
		Pesquisador diego = new Pesquisador("Diego", TipoSexo.MASC, Calendar.getInstance(), "rua 10 de agosto",
				new BigDecimal(13000),10, "Empresario");
		
		database.getCollection("pesquisadores")
		.insert(CodecProvider.getInstance()
				.codec(isaac));
		database.getCollection("pesquisadores")
		.insert(CodecProvider.getInstance()
				.codec(diego));		
	}
	public static void popularRelacionamento() {
		
	}
	
	public static void popularFuncionarioLimpeza() {
		
	}
}