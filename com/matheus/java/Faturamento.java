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
        Historico historico = new Historico();


        saldo.incluirSaldo();

        do {
        System.out.println("******** Sistema de Compras ********");
        System.out.println(" 1 - Cliente");
        System.out.println(" 2 - Compra");
        System.out.println(" 3 - Historico de compra");
        System.out.println(" 4 - Saldo");
        System.out.println(" 5 - Sair");
        optMenu = scan.nextInt();

            switch (optMenu) {
                case 1:
                    cliente.menuCliente();
                    break;
                case 2:
                    compra.Produtos();
                    compra.Pagamento(saldo.getSaldoInicial());
                    saldo.setSaldoInicial(compra.getSaldoAtual());
                    break;
                case 3:
                    historico.apresentaHistorico();
                    break;
                case 4:
                    saldo.menuSaldo();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while (optMenu!=5);

        System.out.println("Obrigado pela preferencia");
    }

}
