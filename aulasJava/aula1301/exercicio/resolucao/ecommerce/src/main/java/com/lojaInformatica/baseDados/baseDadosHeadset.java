package com.lojaInformatica.baseDados;

import com.lojaInformatica.model.Headset;

public class baseDadosHeadset {

	private Headset[] headsets;
	
	public baseDadosHeadset(){
		
		headsets = new Headset[1];
		
		headsets[0] = new Headset("Cloud Revolver S", 880.00f, "Hyperx", "Hx-Hscrs-Gm/Na", true, true, true);
	}
}
