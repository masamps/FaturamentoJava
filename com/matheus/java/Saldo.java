package com.matheus.java;

import java.util.Scanner;

public class Saldo {

    int saldoInicial;

    Scanner scan = new Scanner(System.in);

    void incluirSaldo(){
        System.out.println("Digite o Saldo inicial: ");
        saldoInicial = scan.nextInt();
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }
}
