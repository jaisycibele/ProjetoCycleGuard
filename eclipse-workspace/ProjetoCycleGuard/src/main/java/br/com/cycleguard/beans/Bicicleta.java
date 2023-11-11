package br.com.cycleguard.beans;

public class Bicicleta {
//visibilidade, tipo de dado e nome	

	private String serie;
	private String cor;
	private String anoFabricacao;
	private String notaFiscal;
	
//setters e getters
	
	public void setSerie (String serie) {
		this.serie=serie;
	}
	
	public void setCor (String cor) {
		this.cor=cor;
	}
	
	public void setAnoFabricação (String anoFabricacao) {
		this.anoFabricacao=anoFabricacao;
	}
	
	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	
	public String getSerie() {
		return serie;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public String getNotaFiscal() {
		return notaFiscal;
	}

//construtores
	
	public Bicicleta() {
		super();
	}
	
	public Bicicleta(String serie, String cor, String anoFabricacao,String notaFiscal) {
		super();
		this.serie=serie;
		this.cor=cor;
		this.anoFabricacao=anoFabricacao;
		this.notaFiscal=notaFiscal;
	}


	














}
