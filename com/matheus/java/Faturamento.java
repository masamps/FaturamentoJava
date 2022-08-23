package com.matheus.java;
import java.util.Scanner;

public class Faturamento {

    public static void main(String[] args) {

        int optMenu;
        double ValorTotal;

        Scanner scan = new Scanner(System.in);
        Compra compra = new Compra();
        Saldo saldo = new Saldo();
        Cliente cliente = new Cliente();


        saldo.incluirSaldo();

        do {
        System.out.println("******** Sistema de Compras ********");
        System.out.println(" 1 - Cliente");
        System.out.println(" 2 - Compra");
        System.out.println(" 3 - Saldo");
        System.out.println(" 4 - Sair");
        optMenu = scan.nextInt();

            switch (optMenu) {
                case 1:

                    break;
                case 2:
                    compra.Produtos();
                    compra.Pagamento(saldo.getSaldoInicial());
                    saldo.setSaldoInicial(compra.getSaldoAtual());
                    break;
                case 3:
                    saldo.menuSaldo();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while (optMenu!=4);

        System.out.println("Obrigado pela preferencia");
    }

}
