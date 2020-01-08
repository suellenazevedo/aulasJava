package com.primeiraAula.segundaAtividade;
import java.util.Scanner;

public class Validacao 
{
    public static void main( String[] args )
    {
    	Scanner e = new Scanner(System.in);
    	
    	System.out.println("Login: ");
    	String log = e.nextLine();
    	
    	System.out.println("Senha: ");
    	int pass = e.nextInt();
    	
    	
    	if (log.equals("suellen")   && pass == 1313) {
			System.out.println("Usuario suellen logado com sucesso.");
		} else {
			System.out.println("login ou senha invalidos!");
		}
    	
        //System.out.println( "Hello World!" );
    }
}
