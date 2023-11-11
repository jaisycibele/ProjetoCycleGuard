package br.com.cycleguard.beans;


public class ImagemBicicleta {
//visibilidade, tipo de dado e nome	
	
	private String statusVerificacao;
	private String dataImagens;
	
//setters e getters	
	
	public void setStatusVerificacao(String statusVerificacao) {
		this.statusVerificacao = statusVerificacao;
	}

	public void setDataImagens(String dataImagens) {
		this.dataImagens = dataImagens;
	}
	
	public String getDataImagens() {
		return dataImagens;
	}
	
	public String statusVerificacao() {
		return statusVerificacao;
	}
	
	
	//construtor vazio	
	public ImagemBicicleta() {
		super();
	}
	
	//construtor cheio	
	public ImagemBicicleta(String statusVerificacao, String dataImagens) {
		super();
		this.statusVerificacao = statusVerificacao;
		this.dataImagens = dataImagens;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
