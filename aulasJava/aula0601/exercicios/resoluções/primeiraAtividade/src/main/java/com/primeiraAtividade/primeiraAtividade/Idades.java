package com.primeiraAtividade.primeiraAtividade;
import java.util.Scanner;

public class Idades {
	
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

	    System.out.println("Digite sua idade: ");
	    int idade = s.nextInt();
	    
	    System.out.println("Informe a idade da sua mãe: ");
	    int idadeM = s.nextInt();
	     
	    int cal = idadeM - idade;
	    
	    System.out.println("Sua mãe é " + cal + " anos mais velha que você!");
	  }
	}