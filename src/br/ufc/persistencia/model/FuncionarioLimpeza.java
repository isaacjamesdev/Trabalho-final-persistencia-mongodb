package br.ufc.persistencia.model;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class FuncionarioLimpeza extends AbstractFuncionario {
	private int jornadaTrabalho;

	public FuncionarioLimpeza() {
	}

	public FuncionarioLimpeza(String nome, TipoSexo sexo, Calendar dataAniversario, String endereco, BigDecimal salario,
			Integer departamento, int jornadaTrabalho) {
		super(nome, sexo, dataAniversario, endereco, salario, departamento);
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public int getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(int jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public String toString() {
		return super.toString() + "FuncionarioLimpeza [jornadaTrabalho=" + jornadaTrabalho + "]";
	}

}
