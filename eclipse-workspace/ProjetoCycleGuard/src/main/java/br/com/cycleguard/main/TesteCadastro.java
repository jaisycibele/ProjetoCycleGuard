package br.com.cycleguard.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.cycleguard.beans.Cliente;
import br.com.fiap.dao.ClienteDao;

public class TesteCadastro {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar 
		ClienteDao dao = new ClienteDao();
		
		Cliente objCliente = new Cliente();
		
		objCliente.setCpf(inteiro("CPF"));
		objCliente.setNome(texto("Nome"));
		objCliente.setTelefone(texto("Telefone"));
		objCliente.setSenha(texto("Senha"));
		objCliente.setEmail(texto("E-mail"));
		
		System.out.println(dao.inserir(objCliente));
		

	}

}
