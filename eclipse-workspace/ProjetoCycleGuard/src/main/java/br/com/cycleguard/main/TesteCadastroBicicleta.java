package br.com.cycleguard.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.cycleguard.beans.Bicicleta;
import br.com.fiap.dao.BicicletaDao;

public class TesteCadastroBicicleta {
	
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
		// TODO Auto-generated method stub
		BicicletaDao dao = new BicicletaDao();
		
		Bicicleta objBicicleta = new Bicicleta();
		
		objBicicleta.setSerie(texto("Numero de série"));
		objBicicleta.setCor(texto("Cor"));
		objBicicleta.setAnoFabricação(texto("Ano de fabricação"));
		
		
		System.out.println(dao.inserir(objBicicleta));

	}

}
