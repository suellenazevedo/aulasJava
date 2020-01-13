package com.lojaInformatica.baseDados;

import com.lojaInformatica.model.Notebook;

public class baseDadosNotebook {

	private Notebook[] notebooks;
	
	public baseDadosNotebook() {
		notebooks = new Notebook[1];
		
		notebooks[0] = new Notebook("Odyssey Z", 14.000f, "Samsung", "NP850XAC-XT1BR", true, true, true, 24);
		
	}
}
