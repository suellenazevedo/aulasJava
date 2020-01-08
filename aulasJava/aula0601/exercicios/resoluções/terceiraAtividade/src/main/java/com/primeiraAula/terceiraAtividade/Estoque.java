package com.primeiraAula.terceiraAtividade;
import java.util.Scanner;

public class Estoque 
{
    public static void main( String[] args )
    {
    	Scanner e = new Scanner(System.in);
    	
    	System.out.println("Digite a quantidade minima: ");
    	int qMin = e.nextInt();
    	
    	System.out.println("Digite a quantidade maxima: ");
    	int qMax = e.nextInt();
        
    	float est = (qMin + qMax)/2;
    	
    	System.out.println("Estoque médio: " + est);
    }
}
