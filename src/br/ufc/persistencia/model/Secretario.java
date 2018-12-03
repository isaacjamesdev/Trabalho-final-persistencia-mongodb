package br.ufc.persistencia.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
@Entity
public class Secretario extends AbstractFuncionario {

	private String grauEscolar;

	public Secretario(String nome, TipoSexo sexo, Calendar dataAniversario, String endereco, BigDecimal salario,
			String grauEscolar, Integer departamento) {
		super(nome, sexo, dataAniversario, endereco, salario, departamento);
		this.grauEscolar = grauEscolar;
	}

	public String getGrauEscolar() {
		return grauEscolar;
	}

	public void setGrauEscolar(String grauEscolar) {
		this.grauEscolar = grauEscolar;
	}
	
	
}