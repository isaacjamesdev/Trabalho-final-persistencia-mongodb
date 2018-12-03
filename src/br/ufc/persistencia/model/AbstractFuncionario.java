package br.ufc.persistencia.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public abstract class AbstractFuncionario extends AbstractPessoa {
	private String endereco;
	private BigDecimal salario;
	private Integer departamento;

	private List<Integer> dependentes = new ArrayList<>();

	public AbstractFuncionario() {
	}

	public AbstractFuncionario(String nome, TipoSexo sexo, Calendar dataAniversario, String endereco,
			BigDecimal salario, Integer departamento) {
		super(nome, sexo, dataAniversario);
		this.endereco = endereco;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + "AbstractFuncionario [endereco=" + endereco + ", salario=" + salario
				+ ", departamento=" + departamento + ", dependentes=" + dependentes + "]";
	}

	public Integer getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Integer departamento) {
		this.departamento = departamento;
	}

	public List<Integer> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Integer> dependentes) {
		this.dependentes = dependentes;
	}
	
}
