package com.exercicios.segundoExercicio;
import java.util.Scanner;

public class PosOrNeg 
{
    public static void main( String[] args )
    {
    	Scanner e = new Scanner(System.in);
    	System.out.println("--------------------Saiba se um número é positivo ou negativo!--------------------");
    	int num = 1;
    	
    	while (num != 0) {
    		
    		System.out.println("Digite um número: ");
    		 num = e.nextInt();
	    		if (num > 0) {
	    			System.out.println("Esse número é positivo!");
	    			
		    		System.out.println("\n *digite 0 caso queira sair.* \n");
		    		
	    		} else if(num < 0) {
	    			System.out.println("Esse número é negativo!");
	    			System.out.println("\n *digite 0 caso queira sair.* \n");
	    		}
	    		
	    		
		}
    	
    	
    }
}


















































