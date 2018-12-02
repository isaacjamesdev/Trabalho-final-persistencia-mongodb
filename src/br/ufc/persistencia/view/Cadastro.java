package br.ufc.persistencia.view;

import java.util.Scanner;

import br.ufc.persistencia.control.EntityFactory;
import br.ufc.persistencia.dao.impl.DepartamentoJPADAO;
import br.ufc.persistencia.dao.impl.DependenteJPADAO;
import br.ufc.persistencia.dao.impl.FuncionarioLimpezaJPADAO;
import br.ufc.persistencia.dao.impl.PesquisadorJPADAO;
import br.ufc.persistencia.dao.impl.ProjetoJPADAO;
import br.ufc.persistencia.dao.impl.SecretarioJPADAO;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class Cadastro {
	public void cadastrarDepartamento() {
		try {			
			DepartamentoJPADAO depj = new DepartamentoJPADAO();
			depj.beginTransaction();
			depj.save(EntityFactory.getInstance().cadastrarDepartamento());
			depj.commit();
			depj.close();
		} catch (Exception e) {
			System.out.println("ERRO AO SALVAR");
			System.out.println(e.getMessage());
		}
	}

	
	public void cadastrarPesquisador() {
		PesquisadorJPADAO jpadao = new PesquisadorJPADAO();
		try {
			jpadao.beginTransaction();
			jpadao.save(EntityFactory.getInstance().cadastrarPesquisador());
			jpadao.commit();
			jpadao.close();
		} catch (Exception e) {
			System.out.println("ERRO AO SALVAR");
			e.printStackTrace();
		}
	}

	public void cadastrarSecretario() {
		SecretarioJPADAO jpadao = new SecretarioJPADAO();
		try {
			jpadao.save(EntityFactory.getInstance().cadastrarSecretario());
		} catch (Exception e) {
			System.out.println("ERRO AO SALVAR");
			e.printStackTrace();
		}
	}

	public void cadastrarProjeto() {
		ProjetoJPADAO jpadao = new ProjetoJPADAO();
		try {
			jpadao.save(EntityFactory.getInstance().cadastrarProjeto());
		} catch (Exception e) {
			System.out.println("ERRO AO SALVAR");
			e.printStackTrace();
		}
	}

	/*
	 * Falta setar Funcionario
	 */
	public void cadastrarDependente() {
		DependenteJPADAO dj = new DependenteJPADAO();
		try {
			dj.beginTransaction();
			dj.save(EntityFactory.getInstance().cadastrarDependente());
			dj.commit();
			dj.close();
		} catch (Exception e) {
			System.out.println("ERRO AO SALVAR");	
			e.printStackTrace();
		}
	}

	/*
	 * Falta setar Cargo
	 */
	public void cadastrarFuncionarioLimpeza() {
		FuncionarioLimpezaJPADAO flj = new FuncionarioLimpezaJPADAO();
		try {
			flj.beginTransaction();
			flj.save(EntityFactory.getInstance().cadastrarFuncionarioLimpeza());
			flj.commit();
			flj.close();
		} catch (Exception e) {
			System.out.println("ERRO AO SALVAR");
			e.printStackTrace();
		}

	}
}
