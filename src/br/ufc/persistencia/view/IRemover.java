package br.ufc.persistencia.view;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public interface IRemover {
	public int setId();
	public boolean removerFuncionarioLimpeza();
	public boolean removerSecretario();
	public boolean removerPesquisador();
	public boolean removerProjeto();
	public boolean removerDepartamento();
	public boolean removerDependente();
}
