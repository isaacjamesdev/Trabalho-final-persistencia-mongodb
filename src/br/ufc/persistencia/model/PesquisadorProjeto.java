package br.ufc.persistencia.model;


/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class PesquisadorProjeto {

	private Integer id;

	private Projeto projeto;

	private Pesquisador pesquisador;

	private int horasSemanais;

	public PesquisadorProjeto() {
	}

	public PesquisadorProjeto(Projeto projeto, Pesquisador pesquisador, int horasSemanais) {
		this.projeto = projeto;
		this.pesquisador = pesquisador;
		this.horasSemanais = horasSemanais;
	}

	public int getHorasSemanais() {
		return horasSemanais;
	}

	public void setHorasSemanais(int horasSemanais) {
		this.horasSemanais = horasSemanais;
	}

	public Integer getId() {
		return id;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public Pesquisador getPesquisador() {
		return pesquisador;
	}
}
