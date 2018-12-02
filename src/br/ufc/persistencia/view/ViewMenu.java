package br.ufc.persistencia.view;

import java.util.Scanner;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class ViewMenu {
	private static Scanner scanner = new Scanner(System.in);

	public static int cadastroMenu() {
		int opcao = 0;
		do {
			System.out.println("*** Companhia James ***");
			System.out.println("1 - Cadastrar Departamento" + "\n2 - Cadastrar Funcionario Limpeza"
					+ "\n3 - Cadastrar Secretário" + "\n4 - Cadastrar Pesquisador" + "\n5 - Cadastrar Projeto"
					+ "\n6 - Cadastrar Dependente" + "\n0 - sair");
			opcao = scanner.nextInt();
		} while (opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6);
		return opcao;
	}

	public static int removeMenu() {
		int opcao;
		do {
			System.out.println("*** Companhia James ***");
			System.out.println("1 - Remover Departamento" + "2 - Remover Funcionario Limpeza" + "3 - Remover Secretário"
					+ "4 - Remover Pesquisador" + "5 - Remover Projeto" + "6 - Remover Dependente" + "0 - sair");
			opcao = scanner.nextInt();
		} while (opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6);
		return opcao;
	}

	public static int listarMenu() {
		int opcao = 0;
		do {
			System.out.println("*** Companhia James ***");
			System.out.println("1 - Listar Departamentos" + "2 - Listar Funcionarios Limpeza" + "3 - Listar Secretários"
					+ "4 - Listar Pesquisadores" + "5 - Listar Projetos" + "6 - Listar Dependentes" + "0 - sair");
			opcao = scanner.nextInt();
		} while (opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6);
		return opcao;

	}

	public static int associarMenu() {
		int opcao = 0;
		do {
			System.out.println("*** Companhia James ***");
			System.out.println("1 - Associar Pesquisador a Projeto" + "0 - sair");
			opcao = scanner.nextInt();
		} while (opcao != 0 && opcao != 1);
		return opcao;
	}

}
