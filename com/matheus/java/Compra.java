package com.matheus.java;


import java.util.Scanner;

public class Compra  {

    int qtdItem;
    double valorItem, valorTotal;
    String nomeItem;

    Scanner scan = new Scanner(System.in);

    void Produtos(){
        System.out.println("Digite o nome do item: ");
        nomeItem = scan.next();
        System.out.println("Digite o valor do item: ");
        valorItem = scan.nextDouble();
        System.out.println("Digite a quantidade do item: ");
        qtdItem = scan.nextInt();
    }

    void precoProduto(){
        System.out.println("Valor total da Compra é de: " + (valorItem * qtdItem));
    }

