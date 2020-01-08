package com.primeiraAula.quartaAtividade;
import java.util.Scanner;

public class CotacaoDolar 
{
    public static void main( String[] args )
    {
    		Scanner e = new Scanner(System.in);
	    	
	    	System.out.println("Digite a cotação do dolar: ");
	    	float cot = e.nextFloat();
	    	
	    	System.out.println("Digite o valor em dolar: ");
	    	int dol = e.nextInt();
	        
	    	float valReal = (cot * dol);
	    	
	    	System.out.println("O valor em reais é " + valReal);
    }
}
