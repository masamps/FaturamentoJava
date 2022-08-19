package com.matheus.java;
import java.util.Scanner;

public class Faturamento {

    public static void main(String[] args) {

        int optMenu;
        double ValorTotal;

        Scanner scan = new Scanner(System.in);
        Compra compra = new Compra();
        Saldo saldo = new Saldo();


        saldo.incluirSaldo();

        do {
        System.out.println("******** Sistema de Compras ********");
        System.out.println(" 1 - Compra de Produto");
        System.out.println(" 2 - Consultar saldo");
        System.out.println(" 3 - Sair");
        optMenu = scan.nextInt();

            switch (optMenu) {
                case 1:
                    System.out.println("******** Compra ********");
                    compra.Produtos();
                    ValorTotal = compra.getValorTotal();
                    compra.Pagamento();
                    break;
                case 2:
                    saldo.menuSaldo();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }while (optMenu!=3);

        System.out.println("Obrigado pela preferência");
    }

}
