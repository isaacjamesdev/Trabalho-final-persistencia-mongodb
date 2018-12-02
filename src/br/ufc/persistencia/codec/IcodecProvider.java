package br.ufc.persistencia.codec;

import br.ufc.persistencia.model.AbstractFuncionario;
import br.ufc.persistencia.model.AbstractPessoa;
import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.Dependente;
import br.ufc.persistencia.model.FuncionarioLimpeza;
import br.ufc.persistencia.model.Pesquisador;
import br.ufc.persistencia.model.Projeto;
import br.ufc.persistencia.model.Secretario;
import br.ufc.persistencia.model.TipoSexo;

import com.mongodb.BasicDBObject;

public interface IcodecProvider {
	
	public abstract BasicDBObject codec(AbstractPessoa pessoa);
	public abstract BasicDBObject codec(AbstractFuncionario funcionario);
	public BasicDBObject codec(Departamento departamento);
	public BasicDBObject codec(Dependente dependente);
	public BasicDBObject codec(FuncionarioLimpeza funLimpeza);
	public BasicDBObject codec(Pesquisador pesquisador);
	public BasicDBObject codec(Projeto projeto);
	public BasicDBObject codec(Secretario secretario);

}
