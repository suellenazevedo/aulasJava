package com.exercicios.quintoExercicio;
import java.util.Scanner;

public class Operações 
{
    public static void main( String[] args )
    {
    	Scanner e = new Scanner(System.in);
    	
    	System.out.println("Digite dois números inteiros para fazer a operação desejada \n");
    	
    	
    	System.out.println("Primeiro número: ");
    	int num1 = e.nextInt();
    	
    	System.out.println("Segundo número: ");
    	int num2 = e.nextInt();
    	
    	
    	System.out.println("\n escolha uma opção: ");
    	System.out.println("1 – Verificar se um dos números lidos é ou não múltiplo do outro\r\n" + 
    			"2 – Verificar se os dois números lidos são pares\r\n" + 
    			"3 – Verificar se a média dos dois números é maior ou igual a 7.\r\n" + 
    			"4 – Sair");
    	int op = e.nextInt();
    	
    	if (op == 1) {
	    		if (num1/num2 == 0) {
					System.out.println(num1 + " e "+ num2 + " são multiplos um do outro.");
				} else {
					System.out.println(num1 + " e "+ num2 + " não são multiplos um do outro.");
				}
    	} else if(op == 2) {
	    			if (num1 % 2 == 0 && num2 % 2 == 0) {
	    				System.out.println(num1 + " e "+ num2 + " são pares.");
					} else if(num1 % 2 != 0 && num2 % 2 != 0) {
						System.out.println(num1 + " e "+ num2 + " são ímpares.");
					} else if(num1 % 2 != 0 && num2 % 2 == 0) {
						System.out.println(num1 + " é ímpar, " + num2 + " não.");
					} else if(num1 % 2 == 0 && num2 % 2 != 0) {
						System.out.println(num2 + " é ímpar, " + num1 + " não.");
					}
    	} else if(op == 3) {
    			if((num1 + num2)/2 >= 7) {
    				System.out.println(num1 + " e "+ num2 + " são maiores ou iguais a 7.");
    			} else {
    				System.out.println(num1 + " e "+ num2 + " não são maiores ou iguais a 7.");
    			}
    	}else if(op == 4) {
    		System.out.println("Fim.");
    	}
    	
    	
    	
		
    	
    	
    	
    }
}
