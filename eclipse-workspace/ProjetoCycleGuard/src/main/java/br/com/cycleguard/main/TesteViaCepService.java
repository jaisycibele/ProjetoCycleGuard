package br.com.cycleguard.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCepService;

public class TesteViaCepService {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// Instanciar objetos 
		
		ViaCepService viaCepService  = new ViaCepService();
		
		String cep = JOptionPane.showInputDialog("Informe o CEP para pesquisa");
		
		Endereco endereco = viaCepService.getEndereco(cep);
		
		// Saida toString 
		System.out.println(endereco);	
		

	}

}
