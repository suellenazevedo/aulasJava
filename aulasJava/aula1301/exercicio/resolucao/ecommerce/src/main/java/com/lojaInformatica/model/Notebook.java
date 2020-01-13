package com.lojaInformatica.model;

public class Notebook extends Eletronicos{
	
	private boolean gamer;
	private boolean ssd;
	private int memoriaRam;
	
	
	public Notebook(String nome, float preco, String marca, String modelo, boolean bivolt, boolean gamer, boolean ssd,
			int memoriaRam) {
		super(nome, preco, marca, modelo, bivolt);
		this.gamer = gamer;
		this.ssd = ssd;
		this.memoriaRam = memoriaRam;
	}


	public Notebook() {
		super();
	}
	
	
	
	
	
}
