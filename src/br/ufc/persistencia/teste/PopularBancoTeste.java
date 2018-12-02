package br.ufc.persistencia.teste;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import br.ufc.persistencia.codec.CodecProvider;
import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.FuncionarioLimpeza;
import br.ufc.persistencia.model.TipoSexo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
@SuppressWarnings("deprecation")
public class PopularBancoTeste {
	private static final MongoClient mongoClient = new MongoClient();
	private static final DB database = mongoClient.getDB("TextePersistence");

	public static void main(String[] args) {
		popularDepartamento();
	}
	
	public static void popularDepartamento() {
		Departamento rh = new Departamento(2, "RH");
		rh.getFuncionarios().add(new FuncionarioLimpeza("isaac", TipoSexo.MASC,
				Calendar.getInstance(), "rua 10 de agosto", new BigDecimal(9000), new Departamento(1, "RH"), 48));
		
		database.getCollection("departamento")
				.insert(CodecProvider.getInstance()
						.codec(rh));
		
	}
	
	public static void popularProjeto() {
		
	}
	
	public static void popularPesquisador() {
		
	}
	public static void popularRelacionamento() {

	}
	
	public static void popularFuncionarioLimpeza() {
		
	}
}