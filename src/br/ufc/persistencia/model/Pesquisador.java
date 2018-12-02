package br.ufc.persistencia.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
@Entity
public class Pesquisador extends AbstractFuncionario {

	private String areaAtuacao;
	private List<Projeto> projetos = new ArrayList<>();

	public Pesquisador(String nome, TipoSexo sexo, Calendar dataAniversario, String endereco, BigDecimal salario,
			Departamento departamento, String areaAtuacao) {

		super(nome, sexo, dataAniversario, endereco, salario, departamento);
		this.areaAtuacao = areaAtuacao;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}
}
