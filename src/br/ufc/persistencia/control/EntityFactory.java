package br.ufc.persistencia.control;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.ufc.persistencia.model.AbstractFuncionario;
import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.Dependente;
import br.ufc.persistencia.model.FuncionarioLimpeza;
import br.ufc.persistencia.model.Pesquisador;
import br.ufc.persistencia.model.Projeto;
import br.ufc.persistencia.model.Secretario;
import br.ufc.persistencia.model.TipoSexo;
import br.ufc.persistencia.view.ICadastro;

public class EntityFactory implements ICadastro{
	
	private static Scanner scanner = new Scanner(System.in);
	private static EntityFactory entityFactory= null;
	
	private EntityFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static EntityFactory getInstance(){
		return entityFactory == null ? new EntityFactory() : entityFactory;
	}

	@Override
	public Departamento cadastrarDepartamento() {
		try {
			Departamento dep = new Departamento();
			System.out.println("Digite o Numero do Departamento");
			dep.setId(setInt());
			System.out.println("Digite o Nome do Departamento");
			dep.setNome(setString());
			return dep;
		} catch (Exception e) {
			System.out.println("ERRO AO SALVAR");
			System.out.println(e.getMessage());
		}
		return null;
	}


	@Override
	public Pesquisador cadastrarPesquisador() {
		Pesquisador pesquisador = new Pesquisador();
		System.out.println("Digite Nome do departamento");
		pesquisador.setNome(setString());
		pesquisador.setSexo(setSexo());
		pesquisador.setDataAniversario(setDataAniversario());
		System.out.println("Digite Endereco");
		pesquisador.setEndereco(setString());
		pesquisador.setSalario(setSalario());
		pesquisador.setDepartamento(setDepartamento());
		System.out.println("Digite Area de Atuação do Pesquisador");
		pesquisador.setAreaAtuacao(setString());
		return pesquisador;
	}

	@Override
	public Secretario cadastrarSecretario() {
		Secretario sec = new Secretario();
		System.out.println("Digite o Nome");
		sec.setNome(setString());
		System.out.println("Digite o Endereço");
		sec.setEndereco(setString());
		sec.setSexo(setSexo());
		sec.setDataAniversario(setDataAniversario());
		sec.setSalario(setSalario());
		System.out.println("Digite Grau Escolar");
		sec.setGrauEscolar(setString());
		sec.setDepartamento(setDepartamento());
		
		return sec;
	}

	@Override
	public Projeto cadastrarProjeto() {
		Projeto projeto = new Projeto();
		System.out.println("Digite o Nome do Projeto");
		projeto.setNome(setString());
		System.out.println("Digite o Periodo de Desenvolvimento");
		projeto.setPeriodoDesenvolvimento(setInt());
		projeto.setDepartamento(setDepartamento());
		return projeto;
	}

	/*
	 * Falta setar Funcionario
	 */
	@Override
	public Dependente cadastrarDependente() {
		Dependente dep = new Dependente();
		System.out.println("Digite o Nome");
		dep.setNome(setString());
		dep.setSexo(setSexo());
		dep.setDataAniversario(setDataAniversario());
		dep.setFuncionario(setFuncionario());
		System.out.println("Digite o Parentesco");
		dep.setParentesco(setString());
		return dep;
	}

	@Override
	public FuncionarioLimpeza cadastrarFuncionarioLimpeza() {
		FuncionarioLimpeza fLimpeza = new FuncionarioLimpeza();
		System.out.println("Digite o Nome");
		fLimpeza.setNome(setString());
		System.out.println("Digite o Endereço");
		fLimpeza.setEndereco(setString());
		System.out.println("Digite Jornada de Trabalho");
		fLimpeza.setJornadaTrabalho(setInt());
		fLimpeza.setSexo(setSexo());
		fLimpeza.setDataAniversario(setDataAniversario());
		fLimpeza.setSalario(setSalario());
		fLimpeza.setDepartamento(cadastrarDepartamento());
		return fLimpeza;
	}

	/*
	 * ATENÇÃO: Isso vai dar merda na ENtity AbstractFuncionario
	 */
	@Override
	public AbstractFuncionario setFuncionario() {
		System.out.println("Tipo do Funcionario\n1 - Pesquisador\n2 - FuncionarioLimpeza\n3 - Secretario");
		int opcao = scanner.nextInt();
		if (opcao == 1) {
			AbstractFuncionario af = new Pesquisador();
			af.setId(scanner.nextInt());
			return af;
		} else if (opcao == 2) {
			AbstractFuncionario af = new FuncionarioLimpeza();
			af.setId(scanner.nextInt());
			return af;
		} else {
			AbstractFuncionario af = new Secretario();
			af.setId(scanner.nextInt());
			return af;
		}
	}

	@Override
	public String setString() throws NullPointerException {
		try {
			return scanner.next();
		} catch (InputMismatchException e) {
			System.out.println("Entrada invalida. Tente De novo");
			return setString();
		}
	}

	@Override
	public int setInt() throws InputMismatchException {
		return scanner.nextInt();
	}

	@Override
	public TipoSexo setSexo() {
		try {
			int sexo = 0;
			do {
				System.out.println("Sexo do funcionario: 1 - Masculino | 2 - Feminino");
				sexo = scanner.nextInt();
				if (sexo == 1)
					return TipoSexo.MASC;
				else if (sexo == 2)
					return TipoSexo.FEM;
				else
					System.out.println("Opção Invalida!");
			} while (sexo != 1 || sexo != 2);
			return TipoSexo.FEM;
		} catch (InputMismatchException e) {
			System.out.println("Entrada invalida");
			return setSexo();
		}
	}

	@Override
	public Calendar setDataAniversario() {
		try {
			Calendar cal = Calendar.getInstance();
			System.out.println("Data de Aniversario");
			int year, month, day;
			System.out.println("Dia");
			day = scanner.nextInt();

			System.out.println("Mes");
			month = scanner.nextInt();

			System.out.println("Ano");
			year = scanner.nextInt();

			cal.set(year, month, day);
			return cal;
		} catch (InputMismatchException e) {
			System.out.println("Entrada invalida");
			return setDataAniversario();
		}
	}

	@Override
	public BigDecimal setSalario() {
		try {
			System.out.println("Digite o Salario");
			return new BigDecimal(scanner.next());
		} catch (InputMismatchException e) {
			System.out.println("Entrada invalida. Tente de novo");
			return setSalario();
		}
	}
	
	@Override
	public boolean validaInt(int entrada) {
		if (entrada >= 0)
			return true;
		return false;
	}
	
	@Override
	public Departamento setDepartamento() {
		try {
			Departamento dep = new Departamento();
			System.out.println("Digite ID do Departamento");
			dep.setId(scanner.nextInt());
			return dep;
		} catch (InputMismatchException e) {
			System.out.println("Entrada invalida. Tente de novo");
			System.out.println(e.getMessage());
			return setDepartamento();
		}
	}

}
