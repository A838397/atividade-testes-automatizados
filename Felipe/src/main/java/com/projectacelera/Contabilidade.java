package com.projectacelera;

public class Contabilidade {
    private double saldo = 0;

    public void AdicionarSaldo(double valor) {
        saldo += valor;
    }

    public void adicionarDespesa(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Contabilidade contabilidade = new Contabilidade();
        contabilidade.AdicionarSaldo(1000);
        contabilidade.adicionarDespesa(800);
        System.out.println("O saldo atual é R$" + contabilidade.getSaldo());
    }
}