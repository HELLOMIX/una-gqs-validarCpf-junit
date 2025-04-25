package com.tiagoribeiro;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        ValidarCPF cpf = new ValidarCPF();

        System.out.println( "Escreva seu CPF" );
        String textoCpf = input.nextLine();

        System.out.println(cpf.imprimirResultado(cpf.validarCpf(textoCpf)));
        input.close();
    }
}
