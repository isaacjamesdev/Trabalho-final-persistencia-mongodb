package br.ufc.persistencia.view;

import java.util.Scanner;

import br.ufc.persistencia.dao.impl.AssociarJPADAO;
import br.ufc.persistencia.model.Pesquisador;
import br.ufc.persistencia.model.PesquisadorProjeto;
import br.ufc.persistencia.model.Projeto;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class Associar {

	private Scanner scanner;

	public void associar() {
		AssociarJPADAO jpadao = new AssociarJPADAO();
		Projeto proj = new Projeto();
		Pesquisador pes = new Pesquisador();
		int horas;

		System.out.println("Digite o ID do Projeto");
		scanner = new Scanner(System.in);
		int projeto = scanner.nextInt();
		proj.setId(projeto);
		System.out.println("Digite o ID do Pesquisador");
		int Pesquisador = scanner.nextInt();
		pes.setId(Pesquisador);

		System.out.println("Digite as Horas");
		horas = scanner.nextInt();
		
		jpadao.beginTransaction();
		PesquisadorProjeto pp = new PesquisadorProjeto(proj, pes, horas);
		jpadao.save(pp);
		jpadao.commit();
		jpadao.close();
	}

}
