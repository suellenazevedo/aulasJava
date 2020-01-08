package com.exercicios.primeiroExercicio;

public class App 
{
    public static void main( String[] args )
    {
        Socio suellen = new Socio("suellen", 123456789, "44654654", 1302, 123456789, null);
        suellen.Cadastrar("suellen", 123456789);
        suellen.ConfirmarCadastro();
        suellen.ValidarSocio();
        
        
    }
}
