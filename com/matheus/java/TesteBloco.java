package com.matheus.java;

import java.util.Scanner;

public class TesteBloco {

    private String escolha;

    Scanner scan = new Scanner(System.in);

    void Teste (){


        {
            System.out.println("Deseja fazer o calculo ?");
            escolha = scan.next();

        }
        if (escolha == "s"){
            System.out.println("Nao recalculou");
        }
        else{
            System.out.println("Recalculo");
        }

    }
}
