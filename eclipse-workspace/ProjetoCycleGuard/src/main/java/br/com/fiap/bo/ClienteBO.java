package br.com.fiap.bo;

import java.sql.SQLException;

import br.com.cycleguard.beans.Cliente;
import br.com.fiap.dao.ClienteDao;

public class ClienteBO {

	ClienteBO clienteBo;
	
	//cadastro
	
	public void inserirBo(Cliente cliente) throws ClassNotFoundException, SQLException  {
		ClienteDao clienteDAO = new ClienteDao();
		clienteDAO.inserir(cliente);
	}
	
}
