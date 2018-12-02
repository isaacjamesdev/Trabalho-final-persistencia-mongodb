package br.ufc.persistencia.view;

import java.util.Scanner;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public abstract class OpcoesView {

	private static int opcao;
	private static Scanner scanner = new Scanner(System.in);
	private static Cadastro cadastro = new Cadastro();
	private static Remover remover = new Remover();
	private static Listar listar = new Listar();
	private static Associar associar = new Associar();

	public static void main(String[] args) {

		do {
			System.out.println("*** Companhia James ***");
			System.out.println("1 - Cadastrar" // feito
					+ "\n2 - Remover" // feito
					+ "\n3 - Listar" + "\n4 - Associar" + "\n0 - Sair");
			opcao = scanner.nextInt();
			if (opcao != 0)
				decisao(opcao);
		} while (opcao != 0);
		System.out.println("============\n      Adeus!\n==========");
	}

	public static void decisao(int opcao) {
		switch (opcao) {
		case 1:
			cadastrosMenu(ViewMenu.cadastroMenu());
			break;
		case 2:
			removerMenu(ViewMenu.removeMenu());
			break;
		case 3:
			listarMenu(ViewMenu.listarMenu());
			break;
		case 4:
			associarMenu();
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}
	}

	public static void cadastrosMenu(int opcao) {
		switch (opcao) {
		case 1: // departamento
			cadastro.cadastrarDepartamento();
			break;
		case 2: // funcionario limpeza
			cadastro.cadastrarFuncionarioLimpeza();
			;
			break;
		case 3: // secretario
			cadastro.cadastrarSecretario();
			break;
		case 4: // pesquisador
			cadastro.cadastrarPesquisador();
			break;
		case 5: // projeto
			cadastro.cadastrarProjeto();
			break;
		case 6: // Dependente
			cadastro.cadastrarDependente();
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
	}

	public static void removerMenu(int opcao) {
		switch (opcao) {
		case 1: // departamento
			remover.removerDepartamento();
			break;
		case 2: // funcionario limpeza
			remover.removerFuncionarioLimpeza();
			break;
		case 3: // secretario
			remover.removerSecretario();
			break;
		case 4: // pesquisador
			remover.removerPesquisador();
			break;
		case 5: // projeto
			remover.removerProjeto();
			break;
		case 6: // Dependente
			remover.removerDependente();
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}

	}

	public static void listarMenu(int opcao) {
		switch (opcao) {
		case 1: // departamento
			listar.listarDepartamento();
			break;
		case 2: // funcionario limpeza
			listar.listarFuncionarioLimpeza();
			break;
		case 3: // secretario
			listar.listarSecretario();
			break;
		case 4: // pesquisador
			listar.listarPesquisador();
			break;
		case 5: // projeto
			listar.listarProjeto();
			break;
		case 6: // dependente
			listar.listarDependente();
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}
	}

	public static void associarMenu() {
		associar.associar();

	}

}
