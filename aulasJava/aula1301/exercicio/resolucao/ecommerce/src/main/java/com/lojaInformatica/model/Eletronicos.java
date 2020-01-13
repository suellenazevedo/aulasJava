package com.lojaInformatica.model;

public class Eletronicos extends Produto {
	private String marca;
	private String modelo;
	private boolean bivolt;
	
	
	public Eletronicos(String nome, float preco, String marca, String modelo, boolean bivolt) {
		super(nome, preco);
		this.marca = marca;
		this.modelo = modelo;
		this.bivolt = bivolt;
	}


	public Eletronicos() {
		super();
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public boolean getBivolt() {
		return bivolt;
	}


	public void setVoltagem(boolean bivolt) {
		this.bivolt = bivolt;
	}
	
	
	
	
}
