package com.matheus.java;

import java.util.Scanner;

public class Saldo  {

    double saldoInicial,saldoAdicionar;
    int optMenu;
    Scanner scan = new Scanner(System.in);

    void menuSaldo(){
        System.out.println("******** Saldo ********");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Adicionar saldo");
        System.out.println("3 - Sair");
        System.out.print("Digite sua opcao: ");
        optMenu = scan.nextInt();

            switch (optMenu) {
                case 1:
                    System.out.println("Seu saldo e de: R$" + saldoInicial);
                    break;
                case 2:
                    adicionarSaldo();
                    break;
                case 3:
                    System.out.println("Saindo do Saldo...");
                    break;
            }
    }

    void incluirSaldo(){
        System.out.println("Digite o Saldo inicial: ");
        saldoInicial = scan.nextDouble();
    }

    void adicionarSaldo(){
        System.out.println("Digite o saldo a adicionar:");
        saldoAdicionar = scan.nextDouble();
        saldoInicial+=saldoAdicionar;
        System.out.println("Seu saldo atual e de: R$"+saldoInicial);
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
}


