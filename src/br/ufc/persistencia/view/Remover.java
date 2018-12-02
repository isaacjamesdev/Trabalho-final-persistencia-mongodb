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
public class Remover implements IRemover {
	private static Scanner scanner = new Scanner(System.in);

	@Override
	public int setId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean removerFuncionarioLimpeza() {
		FuncionarioLimpezaJPADAO jpadao = new FuncionarioLimpezaJPADAO();
		System.out.println("Digite o ID do Funcionario Limpeza");
		int aux = scanner.nextInt();
		FuncionarioLimpeza fl = new FuncionarioLimpeza();

		try {
			fl.setId(aux);
			jpadao.delete(fl);
			return true;
		} catch (InputMismatchException e) {
			System.out.println("Digite somente números");
			return false;
		}
	}

	@Override
	public boolean removerSecretario() {
		SecretarioJPADAO jpadao = new SecretarioJPADAO();
		System.out.println("Digite o ID do Secretario");
		int aux = scanner.nextInt();
		Secretario func = new Secretario();

		try {
			func.setId(aux);
			jpadao.delete(func);
			return true;
		} catch (InputMismatchException e) {
			System.out.println("Digite somente números");
			return false;
		}
	}

	@Override
	public boolean removerPesquisador() {
		PesquisadorJPADAO jpadao = new PesquisadorJPADAO();
		System.out.println("Digite o ID do Pesquisador");
		int aux = scanner.nextInt();
		Pesquisador func = new Pesquisador();

		try {
			func.setId(aux);
			jpadao.delete(func);
			return true;
		} catch (InputMismatchException e) {
			System.out.println("Digite somente números");
			return false;
		}
	}

	@Override
	public boolean removerProjeto() {
		try {
			ProjetoJPADAO jpadao = new ProjetoJPADAO();
			System.out.println("Digite o ID do Projeto");
			int aux = scanner.nextInt();
			Projeto proj = new Projeto();
			proj.setId(aux);
			jpadao.delete(proj);
			return true;
		} catch (InputMismatchException e) {
			System.out.println("Digite somente números");
			return false;
		}
	}

	public boolean removerDepartamento() {
		try {
			DepartamentoJPADAO jpadao = new DepartamentoJPADAO();
			System.out.println("Digite o ID do Projeto");
			int aux = scanner.nextInt();
			Departamento dep = new Departamento();
			dep.setId(aux);
			jpadao.delete(dep);
			return true;
		} catch (InputMismatchException e) {
			System.out.println("Digite somente números");
			return false;
		}

	}

	@Override
	public boolean removerDependente() {
		try {
			DependenteJPADAO jpadao = new DependenteJPADAO();
			System.out.println("Digite o ID do dependente");
			int aux = scanner.nextInt();
			Dependente dep = new Dependente();
			dep.setId(aux);
			jpadao.delete(dep);
			return true;
		} catch (InputMismatchException e) {
			System.out.println("Digite somente números");
			return false;
		}
	}

}
