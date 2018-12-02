package br.ufc.persistencia.teste;

import java.util.Scanner;

import br.ufc.persistencia.dao.impl.DepartamentoJPADAO;
import br.ufc.persistencia.dao.impl.FuncionarioLimpezaJPADAO;
import br.ufc.persistencia.dao.impl.PesquisadorJPADAO;
import br.ufc.persistencia.dao.impl.ProjetoJPADAO;
import br.ufc.persistencia.dao.impl.SecretarioJPADAO;
import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.FuncionarioLimpeza;
import br.ufc.persistencia.model.Pesquisador;
import br.ufc.persistencia.model.Projeto;
import br.ufc.persistencia.model.Secretario;

public class RemoverTeste {
	Scanner scanner = new Scanner(System.in);

	public void removerDepartamento() {
		DepartamentoJPADAO jpadao = new DepartamentoJPADAO();
		Departamento dep = new Departamento();
		dep.setId(1);
		jpadao.delete(dep);
	}

	public void removerFuncionarioLimpeza() {
		FuncionarioLimpezaJPADAO jpadao = new FuncionarioLimpezaJPADAO();
		FuncionarioLimpeza fl = new FuncionarioLimpeza();
		fl.setId(1);
		jpadao.delete(fl);
	}

	public void removerPesquisador() {
		PesquisadorJPADAO jpadao = new PesquisadorJPADAO();
		Pesquisador pes = new Pesquisador();
		pes.setId(1);
		jpadao.delete(pes);
	}
	
	public void removerSecretario() {
		SecretarioJPADAO jpadao = new SecretarioJPADAO();
		Secretario sec = new Secretario();
		sec.setId(1);
		jpadao.delete(sec);
	}
	
	public void removerProjeto() {
		ProjetoJPADAO jpadao = new ProjetoJPADAO();
		Projeto proj = new Projeto();
		proj.setId(1);
		jpadao.save(proj);
	}
}
