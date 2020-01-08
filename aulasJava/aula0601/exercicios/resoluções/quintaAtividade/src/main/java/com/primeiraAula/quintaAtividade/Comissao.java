package com.primeiraAula.quintaAtividade;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Comissao 
{
    public static void main( String[] args )
    {
    	Scanner e = new Scanner(System.in);
    	
    	System.out.println("Digite a identificacao do vendedor: ");
    	int id = e.nextInt();
    	
    	System.out.println("Digite o ID da Peca: ");
    	int idPeca = e.nextInt();
    	
    	System.out.println("Digite o preço unitario da peca: ");
    	float preco = e.nextFloat();
    	
    	System.out.println("Digite a quantidade de peças vendidas: ");
    	int quant = e.nextInt();
    	
    	
    	float res1 = preco * quant;
    	float porc = (float) 5;
    	float res2 = res1 * porc;
    	float resFinal = res2/100;
    	
    	System.out.println("o valor da comissão é de " + resFinal + " reais.");
    }
}
