package br.com.cycleguard.main;

import javax.swing.JOptionPane;

import br.com.cycleguard.beans.Bicicleta;
import br.com.cycleguard.beans.Cliente;
import br.com.cycleguard.beans.EsqueceuSenha;
import br.com.cycleguard.beans.ImagemBicicleta;
import br.com.cycleguard.beans.ModeloBicicleta;
import br.com.cycleguard.beans.Vistoria;

public class Teste { 
	
	// Método para ler texto da entrada padrão
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	// Método para ler número decimal da entrada padrão
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	// Método para ler número inteiro da entrada padrão
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		// Criação de arrays com tamanho máximo de 1 para cada objeto
		Cliente[] clientes = new Cliente[1];
		Bicicleta[] bicicletas = new Bicicleta[1];
		ModeloBicicleta[] modelos = new ModeloBicicleta[1];
		Vistoria[] vistorias = new Vistoria[1];
		ImagemBicicleta[] imagens = new ImagemBicicleta[1];

		// Loop para inserir um cliente
		for (int i = 0; i < 1; i++) {
			clientes[i] = new Cliente();

			// Entrada de dados do cliente
			clientes[i].setCpf(inteiro("Digite o CPF: "));
			clientes[i].setNome(texto("Digite o nome:"));
			clientes[i].setTelefone(texto("Digite o telefone: "));
			clientes[i].setEmail(texto("Digite o e-mail: "));
			clientes[i].setSenha(texto("Digite a senha: "));
			clientes[i].setIdade(texto("Digite a sua idade: "));
			clientes[i].setCep(texto("Digite o seu cep: "));
			clientes[i].setEndereco(texto("Digite o seu endereço: "));
			clientes[i].setEstado(texto("Digite o seu UF: "));
			clientes[i].setComplemento(texto("Digite o seu complemento: "));
			clientes[i].setNumero(texto("Digite o seu numero: "));

			// Estrutura condicional para recuperar senha
			if (JOptionPane.showConfirmDialog(null, "Esqueceu Senha? ") == 0) {
				EsqueceuSenha esqueceuSenha = new EsqueceuSenha();
				esqueceuSenha.setCpf(clientes[i].getCpf());
				esqueceuSenha.setEmail(texto("Confirme o seu e-mail: "));
				esqueceuSenha.setNovaSenha(texto("Digite a nova senha: "));
				JOptionPane.showMessageDialog(null, "Senha resetada com sucesso!");
			} else {
			
				// Entrada de dados da bicicleta
				bicicletas[i] = new Bicicleta();
				bicicletas[i].setSerie(texto("Digite o número de série da bicicleta: "));
				bicicletas[i].setCor(texto("Digite a cor da bicicleta: "));
				bicicletas[i].setAnoFabricação(texto("Ano de fabricação: "));
				bicicletas[i].setNotaFiscal("---Upload do arquivo da nota fiscal---");

				// Entrada de dados do modelo de bicicleta
				modelos[i] = new ModeloBicicleta();
				modelos[i].setMarca(texto("Marca: "));
				modelos[i].setModelo(texto("Modelo: "));
				double valorMercado;
				                
				                while (true) {
				                    valorMercado = decimal("Valor de mercado: ");
				                    if (valorMercado >= 2000) {
				                        modelos[i].setValorMercado(valorMercado);
				                        break; //se for maior que 2000, sai do loop
				                    } else {
				                        JOptionPane.showMessageDialog(null, "O valor de mercado não é suficiente para a contratação do seguro.");
				                    }
				                }
				modelos[i].setMaterialQuadro(texto("Material do quadro: "));

				// Entrada de dados da vistoria
				vistorias[i] = new Vistoria();
				vistorias[i].setCpf(clientes[i].getCpf());
				vistorias[i].setStatus("---Verificação com a Porto em andamento. Veja o processo diretamente no site da Porto.---");

				// Entrada de dados das imagens
				imagens[i] = new ImagemBicicleta();
				imagens[i].setStatusVerificacao("Imagens em análise!");
				imagens[i].setDataImagens(texto("Data das imagens da vistoria: "));


				// Saída de dados
				System.out.println(
					"DADOS DO CLIENTE" +
					"\nCPF: " + clientes[i].getCpf() +
					"\nNome: " + clientes[i].getNome() +
					"\nNúmero de telefone: " + clientes[i].getTelefone() +
					"\nSenha: " + clientes[i].getSenha() +
					"\nEmail: " + clientes[i].getEmail() +
					"\n" +
					"\nENDEREÇO DO CLIENTE" +
					"\nRua: " + clientes[i].getEndereco() +
					"\nNúmero: " + clientes[i].getNumero() +
					"\nEstado: " + clientes[i].getEstado() +
					"\nCEP: " + clientes[i].getCep() +
					"\n" +
					"\nDADOS DA BICICLETA" +
					"\nSérie: " + bicicletas[i].getSerie() +
					"\nCor: " + bicicletas[i].getCor() +
					"\nAno de fabricação: " + bicicletas[i].getAnoFabricacao() +
					"\n" + bicicletas[i].getNotaFiscal() +
					"\nMarca: " + modelos[i].getMarca() +
					"\nModelo: " + modelos[i].getModelo() +
					"\nValor de mercado: " + modelos[i].getValorMercado() +
					"\nMaterial do quadro: " + modelos[i].getMaterialQuadro() +
					"\n" +
						"\nIMAGENS DA BICICLETA PARA VISTORIA" +
						"\nData das imagens: " + imagens[i].getDataImagens() +
						"\n" +
						"\nVISTORIA" +
						"\nCPF do cliente: " + vistorias[i].getCpf() +
						"\n" + vistorias[i].getStatus()
				);
			}
		}
	}
}
