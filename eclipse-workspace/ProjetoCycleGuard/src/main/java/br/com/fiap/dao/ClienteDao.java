package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.cycleguard.beans.Cliente;
import br.com.fiap.conexoes.ConexaoFactory;

public class ClienteDao {
	
	public Connection minhaConexao;
	
	public ClienteDao() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}

	// Inserir cliente no banco de dados
	public String inserir(Cliente cliente) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(
				"INSERT INTO cliente (cpf, email, nome, telefone, senha, idade, cep, endereco, estado, complemento, numero) " +
				"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
		);
		
		stmt.setLong(1, cliente.getCpf());
		stmt.setString(2, cliente.getEmail());
		stmt.setString(3, cliente.getNome());
		stmt.setString(4, cliente.getTelefone());
		stmt.setString(5, cliente.getSenha());
		stmt.setString(6, cliente.getIdade());
		stmt.setString(7, cliente.getCep());
		stmt.setString(8, cliente.getEndereco());
		stmt.setString(9, cliente.getEstado());
		stmt.setString(10, cliente.getComplemento());
		stmt.setString(11, cliente.getNumero());
		
		stmt.execute();
		stmt.close();
		
		return "Cliente cadastrado com sucesso!";
	} 
}
