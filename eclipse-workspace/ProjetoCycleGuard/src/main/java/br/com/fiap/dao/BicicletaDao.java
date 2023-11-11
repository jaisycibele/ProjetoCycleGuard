package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.cycleguard.beans.Bicicleta;
import br.com.fiap.conexoes.ConexaoFactory;

public class BicicletaDao {
	
public Connection minhaConexao;
	
	public BicicletaDao() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}

	// Inserir cliente no banco de dados
	public String inserir(Bicicleta bicicleta) throws SQLException {
		try (PreparedStatement stmt = minhaConexao.prepareStatement(
	            "INSERT INTO bicicleta (serie, cor, ano_fabricacao) " +
	            "VALUES (?, ?, ?)")) {

	    stmt.setString(2, bicicleta.getSerie());
	    stmt.setString(3, bicicleta.getCor());
	    stmt.setString(4, bicicleta.getAnoFabricacao());

	    stmt.execute();
	    stmt.close();

	    return "Bicicleta cadastrada com sucesso!";
	} catch (SQLException e) {
	    // Trate a exceção
	    e.printStackTrace();
	    return "Erro ao cadastrar bicicleta";
	}

	} 

}
