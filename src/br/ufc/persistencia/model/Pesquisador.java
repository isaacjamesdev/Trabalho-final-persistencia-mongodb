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
	private List<String> projetos = new ArrayList<>();

	public Pesquisador(String nome, TipoSexo sexo, Calendar dataAniversario, String endereco, BigDecimal salario,
			Integer departamento, String areaAtuacao) {

		super(nome, sexo, dataAniversario, endereco, salario, departamento);
		this.areaAtuacao = areaAtuacao;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public List<String> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<String> projetos) {
		this.projetos = projetos;
	}
}