package com.exercicios.terceiroExercicio;
import java.util.Scanner;

public class PosOrNeg2 
{
    public static void main( String[] args )
    {
    	Scanner e = new Scanner(System.in);
    	System.out.println("--------------------Saiba se um número é positivo ou negativo!--------------------");
    	
    	
    	int a = 0;
    	int b = 0; 
    	int num = 1;
    	
    	while (num != 0) {
    		
    		System.out.println("Digite um número: ");
    		num = e.nextInt();
    		
				if (num > 0) {
				a = num;
				System.out.println(a +" foi armazenado no A");
			} else if(num < 0){
				b = num;
				System.out.println(b +" foi armazenado no B");
			}
		}
    	System.out.println("A = "+ a);
    	System.out.println("B = "+ b);
    	
    }
}
