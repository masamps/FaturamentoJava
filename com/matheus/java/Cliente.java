package com.matheus.java;

import java.util.Scanner;

public class Cliente {

    Scanner scan = new Scanner(System.in);

    private int optMenu;



    void menuCliente(){
        do {
            System.out.println("******** Cliente ********");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Visualizar Cliente");
            System.out.println("3 - Sair");
            System.out.print("Digite sua opcao: ");
            optMenu = scan.nextInt();

            switch (optMenu){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while (optMenu!=3)
    }

    void cadastrarCliente(){
        
    }
}
