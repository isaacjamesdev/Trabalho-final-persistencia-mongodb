package br.ufc.persistencia.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class Departamento {
	private int _id;
	private int numero;
	private String nome;
	
	private List<AbstractFuncionario> funcionarios;
	private List<Projeto> projetos;


	public Departamento(int numero, String nome) {
		funcionarios = new ArrayList<>();
		this.numero = numero;
		this.nome = nome;
		projetos = new ArrayList<>();
	}
	
	public int get_id() {
		return _id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<AbstractFuncionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<AbstractFuncionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	@Override
	public String toString() {
		return "Departamento [numero=" + numero + ", nome=" + nome+"]";
	}
}
