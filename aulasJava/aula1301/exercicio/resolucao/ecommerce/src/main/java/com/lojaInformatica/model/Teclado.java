package com.lojaInformatica.model;

public class Teclado extends Eletronicos{
	
	private boolean gamer;
	private boolean leds;
	private boolean mecanico;
	
	
	public Teclado(String nome, float preco, String marca, String modelo, boolean bivolt, boolean gamer, boolean leds,
			boolean mecanico) {
		super(nome, preco, marca, modelo, bivolt);
		this.gamer = gamer;
		this.leds = leds;
		this.mecanico = mecanico;
	}


	public Teclado() {
		super();
	}
	
	
	
}
