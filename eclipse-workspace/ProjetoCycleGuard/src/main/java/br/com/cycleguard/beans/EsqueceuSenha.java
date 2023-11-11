package br.com.cycleguard.beans;

public class EsqueceuSenha {
//visibilidade, tipo de dado e nome	
	
	private long cpf;
	private String email;
	private String novaSenha;
	
//setters e getters
	
	public void setCpf (long cpf) {
		this.cpf=cpf;
	}
	
	public void setEmail (String email ) {
		this.email=email;
	}
	
	public void setNovaSenha (String novaSenha) {
		this.novaSenha = novaSenha;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNovaSenha() {
		return novaSenha;
	}

	
//construtores
		
	public EsqueceuSenha() {
		super();
	}

public EsqueceuSenha(long cpf, String email, String novaSenha) {
	super();
	this.cpf = cpf;
	this.novaSenha = novaSenha;
	this.email = email;
}

	
}
