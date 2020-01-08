package com.primeiraAula.setimaAtividade;
import java.util.Scanner;

public class RelacaoNum 
{
    public static void main( String[] args )
    {
    	Scanner e = new Scanner(System.in);
    	
    	
    	System.out.println("------------------------------Saber relações entre os números------------------------------");
    	
    	System.out.println("Digite o primeiro número: ");
    	int num1 = e.nextInt();
    	
    	System.out.println("Digite o segundo número: ");
    	int num2 = e.nextInt();
    	
    	System.out.println("------------------------------Relações entre os números------------------------------");
    	
    	//condicoes
    	if (num1 == num2) {
			System.out.println("Igual = true");
		} else {
			System.out.println("Igual = false");
		}
    	
    	if (num1 != num2) {
			System.out.println("Diferente = true");
		} else {
			System.out.println("Diferente = false");
		}
    	
    	if (num1 > num2) {
			System.out.println("Maior = true");
		} else {
			System.out.println("Maior = false");
		}
    	
    	if (num1 < num2) {
			System.out.println("Menor = true");
		} else {
			System.out.println("Menor = false");
		}
    	
    	if (num1 > num2 || num1 == num2) {
			System.out.println("Maior ou igual = true");
		} else {
			System.out.println("Maior ou igual = false");
		}
    	
    	if (num1 < num2 || num1 == num2) {
			System.out.println("Menor ou igual = true");
		} else {
			System.out.println("Menor ou igual = false");
		}
    	
    	
    }
}
