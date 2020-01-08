package com.exercicios.primeiroExercicio;
import java.util.Scanner;

public class OrdemDecrescente 
{
    public static void main( String[] args )
    {
    	Scanner e = new Scanner(System.in);
    	
    	System.out.println("Digite o primeiro número: ");
    	int a = e.nextInt();
    	
    	System.out.println("Digite o segundo número: ");
    	int b = e.nextInt();
    	
    	System.out.println("Digite o terceiro número: ");
    	int c = e.nextInt();
    	
    	
    	if (a > b && a > c) {
	    		if(b > c) {
	    			System.out.println(a);
	    			System.out.println(b);
	    			System.out.println(c);
	    		} else {
	    			System.out.println(a);
	    			System.out.println(c);
	    			System.out.println(b);
	    		}
    	} else if(b > a && b > c) {
    			if (a > c) {
    				System.out.println(b);
	    			System.out.println(a);
	    			System.out.println(c);
				} else {
					System.out.println(b);
	    			System.out.println(c);
	    			System.out.println(a);
				}
    	} else if (c > a && c > b) {
			 	if (b > a) {
			 		System.out.println(c);
	    			System.out.println(b);
	    			System.out.println(a);
				} else {
					System.out.println(c);
	    			System.out.println(a);
	    			System.out.println(b);
				}
		}
		
    	
    }
}
