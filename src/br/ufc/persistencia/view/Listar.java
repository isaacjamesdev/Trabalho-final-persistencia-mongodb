package br.ufc.persistencia.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.ufc.persistencia.dao.impl.DepartamentoJPADAO;
import br.ufc.persistencia.dao.impl.DependenteJPADAO;
import br.ufc.persistencia.dao.impl.FuncionarioLimpezaJPADAO;
import br.ufc.persistencia.dao.impl.PesquisadorJPADAO;
import br.ufc.persistencia.dao.impl.ProjetoJPADAO;
import br.ufc.persistencia.dao.impl.SecretarioJPADAO;
import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.Dependente;
import br.ufc.persistencia.model.FuncionarioLimpeza;
import br.ufc.persistencia.model.Pesquisador;
import br.ufc.persistencia.model.Projeto;
import br.ufc.persistencia.model.Secretario;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class Listar implements IListar {
	private Scanner Scanner = new Scanner(System.in);

	@Override
	public boolean listarDepartamento() {
		try {
			DepartamentoJPADAO jpadao = new DepartamentoJPADAO();
			int id;
			System.out.println("Digite o ID do Departamento");
			id = Scanner.nextInt();
			Departamento dep = jpadao.find(id);
			System.out.println(dep.toString());
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println("Entrada inválida");
			return false;
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
			return false;
		}
	}

	@Override
	public boolean listarFuncionarioLimpeza() {
		try {
			FuncionarioLimpezaJPADAO jpadao = new FuncionarioLimpezaJPADAO();
			int id;
			System.out.println("Digite o ID do Funcionario Limpeza");
			id = Scanner.nextInt();
			FuncionarioLimpeza fl = jpadao.find(id);
			System.out.println(fl.toString());
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println("Entrada inválida");
			return false;
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
			return false;
		}
	}

	@Override
	public boolean listarSecretario() {
		try {
			SecretarioJPADAO jpadao = new SecretarioJPADAO();
			int id;
			System.out.println("Digite o ID do Secretario");
			id = Scanner.nextInt();
			Secretario sec = jpadao.find(id);
			System.out.println(sec.toString());
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println("Entrada inválida");
			return false;
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
			return false;
		}
	}

	@Override
	public boolean listarPesquisador() {
		try {
			PesquisadorJPADAO jpadao = new PesquisadorJPADAO();
			int id;
			System.out.println("Digite o ID do Pesquisador");
			id = Scanner.nextInt();
			Pesquisador pes = jpadao.find(id);
			System.out.println(pes.toString());
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println("Entrada inválida");
			return false;
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
			return false;
		}
	}

	@Override
	public boolean listarProjeto() {
		try {
			ProjetoJPADAO jpadao = new ProjetoJPADAO();
			int id;
			System.out.println("Digite o ID do Projeto");
			id = Scanner.nextInt();
			Projeto proj = jpadao.find(id);
			System.out.println(proj.toString());
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println("Entrada inválida");
			return false;
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
			return false;
		}
	}

	@Override
	public boolean listarDependente() {
		try {
			DependenteJPADAO jpadao = new DependenteJPADAO();
			int id;
			System.out.println("Digite o ID do dependente");
			id = Scanner.nextInt();
			Dependente dependente = jpadao.find(id);
			System.out.println(dependente.toString());
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println("Entrada inválida");
			return false;
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
			return false;
		}
	}
}