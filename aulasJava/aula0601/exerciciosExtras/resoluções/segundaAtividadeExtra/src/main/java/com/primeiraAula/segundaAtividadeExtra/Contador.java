package com.primeiraAula.segundaAtividadeExtra;


public class Contador 
{
    public static void main( String[] args )
    {
    	for (int i = 1; i < 100; i++) {
    		if (i%10 == 0) {
    			System.out.println(i + " é multiplo de 10");
    			continue;
			}
			System.out.println(i);
		}
    	
    }
}
