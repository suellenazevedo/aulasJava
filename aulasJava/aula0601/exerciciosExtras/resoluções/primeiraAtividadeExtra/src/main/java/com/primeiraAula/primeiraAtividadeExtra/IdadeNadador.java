package com.primeiraAula.primeiraAtividadeExtra;
import java.util.Scanner;

public class IdadeNadador 
{
    public static void main( String[] args )
    {
    	Scanner e = new Scanner(System.in);
    	
    	System.out.println("Digite sua idade: ");
    	int idade = e.nextInt();
    	
    	if (idade >= 5 && idade <= 7) {
			
    		System.out.println("Você está classificado na categoria: Infantil A");
    		
		} else if ( idade >= 8 && idade <= 11){
			
			System.out.println("Você está classificado na categoria: Infantil B");
			
		} else if ( idade >= 12 && idade <= 13) {
			
			System.out.println("Você está classificado na categoria: Juvenil A");
			
		} else if ( idade >= 14 && idade <= 17) {
			
			System.out.println("Você está classificado na categoria: Juvenil B");
			
		} else if ( idade >= 18) {
			
			System.out.println("Você está classificado na categoria: Adulto");
			
		}
    	
    }
}
