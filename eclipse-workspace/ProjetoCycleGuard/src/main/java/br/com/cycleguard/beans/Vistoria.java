package br.com.cycleguard.beans;

public class Vistoria {
//visibilidade, tipo de dado e nome	
	
	private long cpf;
	private String status;
	
//getters e setters
	
	public void setCpf (long cpf) {
		this.cpf=cpf;
	}
	
	public void setStatus (String status) {
		this.status=status;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	public String getStatus() {
		return status;
	}
	
//construtores
	
	public Vistoria() {
		super();
	}
	
	public Vistoria(long cpf, String status ) {
		super();
		this.cpf=cpf;
		this.status=status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
