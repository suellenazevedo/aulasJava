package com.exercicios.quartoExercicio;
import java.util.Scanner;

public class Calculadora 
{
    public static void main( String[] args )
    {
    	Scanner e = new Scanner(System.in);
    	
    	System.out.println("--------------------Calculadora--------------------");
    	System.out.println("Digite dois números inteiros para fazer a operação desejada \n");
    	
    	
    	System.out.println("Primeiro número: ");
    	int num1 = e.nextInt();
    	
    	System.out.println("Segundo número: ");
    	int num2 = e.nextInt();
    	
    	
    	System.out.println("\n escolha uma opção: ");
    	System.out.println("1 – Adição\r\n" + "2 – Subtração\r\n" + "3 – Multiplicação\r\n" + "4 – Divisão");
    	int op = e.nextInt();
    	
    	if (op == 1) {
			System.out.println("resultado: " + (num1 + num2));
		} else if(op == 2) {
			System.out.println("resultado: " + (num1 - num2));
		}  else if(op == 3) {
			System.out.println("resultado: " + (num1 * num2));
		}  else if(op == 4) {
			System.out.println("resultado: " + (num1 / num2));
		}
    }
}
