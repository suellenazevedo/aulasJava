package com.lojaInformatica.baseDados;

import com.lojaInformatica.model.Teclado;

public class baseDadosTeclado {

	private Teclado[] teclados;
	
	public baseDadosTeclado() {
		
		teclados = new Teclado[1];
		
		teclados[0] = new Teclado("K55", 290f, "Corsair", "CH-9206015-BR", true, true, true, true);
		
	}
}
