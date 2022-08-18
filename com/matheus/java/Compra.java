package com.matheus.java;


import java.util.Scanner;

public class Compra {

    int qtdItem, condPagamento;
    double valorItem;
    public double valorTotal;
    String nomeItem;

    Scanner scan = new Scanner(System.in);

    // Cadastro de Produto
    void Produtos() {
        System.out.println("Digite o nome do item: ");
        nomeItem = scan.next();
        System.out.println("Digite o valor do item: ");
        valorItem = scan.nextDouble();
        System.out.println("Digite a quantidade do item: ");
        qtdItem = scan.nextInt();

        valorTotal = (valorItem * qtdItem);
        System.out.println("Valor total da Compra é de: " + valorTotal);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    // Forma de pagamento
    void Pagamento() {
        System.out.println("******** Formas de Pagamento ********");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartao Crédito/Débito");
        System.out.println("3 - PIX");
        System.out.println("4 - Saldo em Conta");

        System.out.println("Digite sua forma de pagamento: ");
        condPagamento = scan.nextInt();

        if (condPagamento!=1 || condPagamento!=4){
            System.out.println("Valor total Pago foi de : R$" + valorTotal);
            System.out.println("Obrigado pela compra");
        }
        else{
            System.out.println("Digite o valor a pagar: ");
        }
    }

    public int getCondPagamento() {
        return condPagamento;
    }

}
