package br.com.cycleguard.beans;

public class ModeloBicicleta {

	private String marca;
	private String modelo;
	private double valorMercado;
	private String materialQuadro;
	
	//getters e setters
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public double getValorMercado() {
		return valorMercado;
	}
	public String getMaterialQuadro() {
		return materialQuadro;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}
	public void setMaterialQuadro(String materialQuadro) {
		this.materialQuadro = materialQuadro;
	}
	
	//construtores
	public ModeloBicicleta() {
		super();
	}
	
	public ModeloBicicleta(String marca, String modelo, double valorMercado, String materialQuadro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.valorMercado = valorMercado;
		this.materialQuadro = materialQuadro;
	}
	
	
	
	
	
}
