package com.lojaInformatica.servicoVenda;

import com.lojaInformatica.model.Eletronicos;
import com.lojaInformatica.modelCliente.Cliente;

public interface IServicoVenda {
	
		String venda(Eletronicos produto, Cliente cliente);
		
		String cancelaVenda(Eletronicos produto, Cliente cliente);
}
