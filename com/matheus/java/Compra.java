package com.matheus.java;

import java.util.Scanner;

public class Compra{

    private int qtdItem, condPagamento, optMenu;
    private double valorItem, saldoTotal, valordinheiro,saldoAtual;
    private double valorTotal;

    String nomeItem;

    Scanner scan = new Scanner(System.in);

    // Cadastro de Produto
    void Produtos() {
        System.out.println("******** Compra ********");
        System.out.println("Digite o nome do item: ");
        nomeItem = scan.next();
        System.out.println("Digite o valor do item: ");
        valorItem = scan.nextDouble();
        System.out.println("Digite a quantidade do item: ");
        qtdItem = scan.nextInt();
        valorTotal = (valorItem * qtdItem);
        System.out.println("Valor total da Compra e de: " + valorTotal);

    }

    // Forma de pagamento
    void Pagamento(double saldoTotal) {
        System.out.println("******** Formas de Pagamento ********");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartao Crédito/Débito");
        System.out.println("3 - PIX");
        System.out.println("4 - Saldo em Conta");

        System.out.println("Digite sua forma de pagamento: ");
        condPagamento = scan.nextInt();

        System.out.println("" + saldoTotal);

        switch (condPagamento){
            case 1:
                System.out.println("Digite o valor em dinheiro: ");
                valordinheiro = scan.nextDouble();
                if(valordinheiro<valorTotal){
                    System.out.println("Faltou dinheiro!");
                }
                else if (valordinheiro>valorTotal){
                    System.out.println("Seu troco e de: R$" +(valordinheiro - valorTotal));
                }
                else{
                    System.out.println("Obrigado pela compra!");
                }
                break;
            case 2:
                System.out.println("Valor total Pago foi de : R$" + valorTotal);
                System.out.println("Obrigado pela compra");
                break;
            case 3:
                System.out.println("Valor total Pago foi de : R$" + valorTotal);
                System.out.println("Obrigado pela compra");
                break;
            case 4:
                if (saldoTotal >= valorTotal) {
                System.out.println("Saldo restante e de: R$"+(saldoTotal - valorTotal));
                saldoAtual = saldoTotal - valorTotal;
                }
                else if (saldoTotal < valorTotal){
                    System.out.println("Saldo Insuficiente, compra nao concluida!");
                }
                break;
        }

    }

    public double getSaldoAtual() {
        return saldoAtual;
    }
}
