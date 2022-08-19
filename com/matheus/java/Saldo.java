package com.matheus.java;

import java.util.Scanner;

public class Saldo {

    double saldoInicial;
    Scanner scan = new Scanner(System.in);
    void incluirSaldo(){
        System.out.println("Digite o Saldo inicial: ");
        saldoInicial = scan.nextDouble();
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }
    
}


