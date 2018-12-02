package br.ufc.persistencia.teste;

import java.util.List;

import br.ufc.persistencia.dao.impl.DepartamentoJPADAO;
import br.ufc.persistencia.model.Departamento;

public class ListarTeste {
	
	public static void main(String[] args) {
		listarDepartamento();
	}
	
	public static void listarDepartamento() {
		DepartamentoJPADAO jpadao = new DepartamentoJPADAO();
		jpadao.beginTransaction();
		List<Departamento> deps = jpadao.find();
		for (Departamento departamento : deps) {
			System.out.println(departamento.toString());
		}
		
		jpadao.close();
	}

}
