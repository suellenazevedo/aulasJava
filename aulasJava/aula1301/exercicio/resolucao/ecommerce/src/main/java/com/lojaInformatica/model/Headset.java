package com.lojaInformatica.model;

public class Headset extends Eletronicos{
	
	private boolean gamer;
	private boolean leds;
	
	
	public Headset(String nome, float preco, String marca, String modelo, boolean bivolt, boolean gamer, boolean leds) {
		super(nome, preco, marca, modelo, bivolt);
		this.gamer = gamer;
		this.leds = leds;
	}


	public Headset() {
		super();
	}
	
	
}
