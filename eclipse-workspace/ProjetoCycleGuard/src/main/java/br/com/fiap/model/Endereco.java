package br.com.fiap.model;

public class Endereco {
	
	private String bairro;
	private String logradouro;
	private String cep;
	
	public Endereco() {
		super();
	}

	public Endereco (String bairro, String logradouro, String cep) {
		super();
		this.bairro=bairro;
		this.logradouro=logradouro;
		this.cep=cep;
	}
	
	public void setBairro (String bairro) {
		this.bairro=bairro;
	}
	
	public void setLogradouro (String logradouro) {
		this.logradouro=logradouro;
	}
	
	public void setCep (String cep) {
		this.cep=cep;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public String getCep() {
		return cep;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + "]";
	}


}
