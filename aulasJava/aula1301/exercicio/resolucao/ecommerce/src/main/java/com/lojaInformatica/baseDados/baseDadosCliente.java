package com.lojaInformatica.baseDados;

import com.lojaInformatica.modelCliente.Cliente;

public class baseDadosCliente {

	private Cliente[] clientes;
	
	public baseDadosCliente() {
		
		clientes = new Cliente[1];
		
		clientes[0] = new Cliente("Suellen", "123456789");
		
	}
}
