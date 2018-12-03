package br.ufc.persistencia.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class Projeto {
	
	private Integer _id;
	private String nome;
	private int periodoDesenvolvimento;
	private Integer departamento;
	private List<String> pesquisadores = new ArrayList<>();

	public Projeto(String nome, int periodoDesenvolvimento, Integer departamento) {
		this.nome = nome;
		this.periodoDesenvolvimento = periodoDesenvolvimento;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeriodoDesenvolvimento() {
		return periodoDesenvolvimento;
	}

	public void setPeriodoDesenvolvimento(int periodoDesenvolvimento) {
		this.periodoDesenvolvimento = periodoDesenvolvimento;
	}

	public Integer get_id() {
		return _id;
	}

	public Integer getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Integer departamento) {
		this.departamento = departamento;
	}

	public List<String> getPesquisadores() {
		return pesquisadores;
	}

	public void setPesquisadores(List<String> pesquisadores) {
		this.pesquisadores = pesquisadores;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}
}