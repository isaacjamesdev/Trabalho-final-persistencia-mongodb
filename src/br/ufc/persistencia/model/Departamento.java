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
	
	private List<String> funcionarios;
	private List<String> projetos;

	public Departamento() {
		// TODO Auto-generated constructor stub
	}
	
	public Departamento(int numero, String nome) {
		funcionarios = new ArrayList<>();
		this.numero = numero;
		this.nome = nome;
		projetos = new ArrayList<>();
	}
	
	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
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

	public List<String> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<String> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<String> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<String> projetos) {
		this.projetos = projetos;
	}

	@Override
	public String toString() {
		return "Departamento [numero=" + numero + ", nome=" + nome+"]";
	}
}
