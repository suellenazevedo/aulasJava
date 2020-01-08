package com.primeiraAula.sextaAtividade;
import java.util.Scanner;

public class IdadeDias 
{
    public static void main( String[] args )
    {
    	Scanner e = new Scanner(System.in);
    	
    	System.out.println("Digite os anos: ");
    	int anos = e.nextInt();
    	
    	System.out.println("Digite os meses: ");
    	int meses = e.nextInt();
    	
    	System.out.println("Digite os dias: ");
    	int dias = e.nextInt();
    	
    	int anos2 = anos * 365;
    	int meses2 = meses * 30;
    	int resFinal = anos2 + meses2 + dias;
    	
    	System.out.println("Idade total em dias: " + resFinal);
    }
}
