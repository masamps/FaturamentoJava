package com.matheus.java;

import java.util.Scanner;

public class Cliente {

    Scanner scan = new Scanner(System.in);

    private int optMenu;
    private String nome;

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
                    cadastrarCliente();
                    break;
                case 2:
                    System.out.println("Seu cliente cadastrado e o: " + getNome());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while (optMenu!=3);
    }

    void cadastrarCliente(){
        System.out.println("Digite o nome do cliente: ");
        nome = scan.next();
    }
    public String getNome() {
        return nome;
    }
}
