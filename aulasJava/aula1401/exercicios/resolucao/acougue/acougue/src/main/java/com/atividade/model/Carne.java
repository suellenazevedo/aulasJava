package com.atividade.model;

public class Carne {	
	
	private int preco;
	private String tipo;
	private float kg;
	
	
	public Carne(int preco, String tipo, float kg) {
		super();
		this.preco = preco;
		this.tipo = tipo;
		this.kg = kg;
	}


	public int getPreco() {
		return preco;
	}


	public void setPreco(int preco) {
		this.preco = preco;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public float getKg() {
		return kg;
	}


	public void setKg(float kg) {
		this.kg = kg;
	}
	
	
	
	
	
	

}
