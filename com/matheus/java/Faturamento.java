package com.matheus.java;

import java.util.Scanner;

public class Faturamento {

    public static void main(String[] args) {

        int optMenu, qtdItem;
        String nomeItem;


        Scanner scan = new Scanner(System.in);

        System.out.println("******** Sistema de Compras ********");
        System.out.println(" 1 - Compra de Produto");
        System.out.println(" 2 - Consultar saldo");
        System.out.println(" 3 - Sair");
        optMenu = scan.nextInt();


            switch (optMenu){
                case 1:
                    System.out.println("******** Compra ********");
                    System.out.println("");
                    System.out.println("Digite o nome do Item: ");

                    break;
                case 2:
                    System.out.println("******** Saldo ********");
                    break;
                case 3:
                    System.out.println("Obrigado pela preferência");
                    break;
                }
    }

}
