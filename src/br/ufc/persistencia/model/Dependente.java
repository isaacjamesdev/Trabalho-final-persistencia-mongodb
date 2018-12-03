package br.ufc.persistencia.model;

import java.util.Calendar;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class Dependente extends AbstractPessoa {

	private String parentesco;
	private String funcionario;

	public Dependente(String nome, TipoSexo sexo, Calendar dataAniversario, String funcionario,
			String parentesco) {
		super(nome, sexo, dataAniversario);
		this.parentesco = parentesco;
		this.funcionario = funcionario;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}
	
}