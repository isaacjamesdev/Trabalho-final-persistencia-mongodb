package br.ufc.persistencia.view;

import java.math.BigDecimal;
import java.util.Calendar;

import br.ufc.persistencia.model.AbstractFuncionario;
import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.Dependente;
import br.ufc.persistencia.model.FuncionarioLimpeza;
import br.ufc.persistencia.model.Pesquisador;
import br.ufc.persistencia.model.Projeto;
import br.ufc.persistencia.model.Secretario;
import br.ufc.persistencia.model.TipoSexo;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public interface ICadastro {
	
	public Departamento cadastrarDepartamento();
	public Pesquisador cadastrarPesquisador();
	public FuncionarioLimpeza cadastrarFuncionarioLimpeza();
	public Secretario cadastrarSecretario();
	public Projeto cadastrarProjeto();
	public Dependente cadastrarDependente();
	public String setString();
	public int setInt();
	public TipoSexo setSexo();
	public Calendar setDataAniversario();
	public BigDecimal setSalario();
	public AbstractFuncionario setFuncionario();
	public Departamento setDepartamento();
	public boolean validaInt(int entrada);
}
