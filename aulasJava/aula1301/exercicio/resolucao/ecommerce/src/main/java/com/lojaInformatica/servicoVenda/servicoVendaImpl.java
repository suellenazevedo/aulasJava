package com.lojaInformatica.servicoVenda;

import com.lojaInformatica.model.Eletronicos;
import com.lojaInformatica.modelCliente.Cliente;

public class servicoVendaImpl implements IServicoVenda{

	public String venda(Eletronicos produto, Cliente cliente) {
		String msg= "Cliente: " + cliente.getNome() + "\n Comprando o eletronico: " + produto.getNome() + "\n Marca: " + produto.getMarca() + 
		"\n Modelo: " + produto.getModelo();		
		return msg;
	}

	public String cancelaVenda(Eletronicos produto, Cliente cliente) {
		String msg= "Cliente cancelando a compra do produto: " + produto.getNome() + "\n Marca: " + produto.getMarca() +
		"\n Modelo: " + produto.getModelo();
		return msg;
	}

}
