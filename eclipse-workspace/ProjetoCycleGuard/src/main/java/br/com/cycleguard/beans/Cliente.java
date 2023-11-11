package br.com.cycleguard.beans;

public class Cliente {
//visibilidade, tipo de dado e nome	
	
	private long cpf;
	private String nome;
	private String telefone;
	private String senha;
	private String email;
	private String idade;
	private String cep;
	private String endereco;
	private String estado;
	private String complemento;
	private String numero;
	
//setters e getters
	
	public void setCpf (long cpf) {
		this.cpf=cpf;
	}
	
	public void setNome (String nome) {
		this.nome=nome;
	}
	
	public void setTelefone (String telefone) {
		this.telefone=telefone;
	}
	
	public void setSenha (String senha) {
		this.senha=senha;
	}
	
	public void setEmail (String email) {
		this.email=email;
	}
	
	public long getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getSenha() {
		return senha;
	}

	public String getEmail() {
		return email;
	}
	
	public String getIdade() {
		return idade;
	}

	public String getCep() {
		return cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getEstado() {
		return estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	//construtores
	
	public Cliente() {
		super();
	}

	public Cliente(long cpf, String nome, String telefone, String senha, String email, String idade, String cep,
			String endereco, String estado, String complemento, String numero) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.senha = senha;
		this.email = email;
		this.idade = idade;
		this.cep = cep;
		this.endereco = endereco;
		this.estado = estado;
		this.complemento = complemento;
		this.numero = numero;
	}
	
}
	
	

