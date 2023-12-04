package com.projectacelera;

import org.junit.jupiter.api.Test;

public class AppTest 
{
    @Test
    public static void main(String[] args) {
        Contabilidade contabilidade = new Contabilidade();
        contabilidade.AdicionarSaldo(1000);
        contabilidade.adicionarDespesa(200);
        System.out.println("O saldo atual é R$" + contabilidade.getSaldo());
    }
}