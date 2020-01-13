package com.atividade.concessionaria.model;

public class Veiculo extends Produto {

	private String modelo;
	private String cor;
	
	
	
	
	
	public Veiculo(String nome, double preco) {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Veiculo(String nome, double preco, String modelo, String cor) {
		super(nome, preco);
		this.modelo = modelo;
		this.cor = cor;
	}


	public String getModelo() {
		return modelo;
	}







	public void setModelo(String modelo) {
		this.modelo = modelo;
	}







	public String getCor() {
		return cor;
	}







	public void setCor(String cor) {
		this.cor = cor;
	}


	
	





	
}
