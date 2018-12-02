package br.ufc.persistencia.model;

import java.util.Calendar;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public abstract class AbstractPessoa {

	private int _id;
	private String nome;
	private TipoSexo sexo;
	private Calendar dataAniversario;

	public AbstractPessoa() {
		// TODO Auto-generated constructor stub
	}

	public AbstractPessoa(String nome, TipoSexo sexo, Calendar dataAniversario) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
	}

	

	public int get_id() {
		return _id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public Calendar getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Calendar dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public String toString() {
		return "[id=" + _id + ", nome=" + nome + ", sexo=" + sexo + ", dataAniversario=" + dataAniversario.get(1) + "/"
				+ dataAniversario.get(2) + "/" + dataAniversario.get(5) + "]";
	}

}
