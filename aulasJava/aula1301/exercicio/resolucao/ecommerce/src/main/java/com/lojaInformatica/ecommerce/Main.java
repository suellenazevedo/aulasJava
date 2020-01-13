package com.lojaInformatica.ecommerce;

import com.lojaInformatica.baseDados.baseDadosCliente;
import com.lojaInformatica.baseDados.baseDadosHeadset;
import com.lojaInformatica.baseDados.baseDadosNotebook;
import com.lojaInformatica.servicoVenda.servicoVendaImpl;

public class Main 
{
    public static void main( String[] args )
    {
    	baseDadosNotebook baseListaNotebook= new baseDadosNotebook();
        baseDadosHeadset baseListaHeadset= new baseDadosHeadset();
        baseDadosCliente baseListaCliente= new baseDadosCliente();
        
//        System.out.println(servicoVendaImpl.venda(null, null)
    }
}
