package org.example;

import Exercicio5.BancoServico;

public class Main {
    public static void main(String[] args) {
        BancoServico banco = new BancoServico();

        banco.criarConta("José", 1000);
        banco.criarConta("Maria", 500);

        banco.exibirSaldo("José");
        banco.exibirSaldo("Maria");

        banco.transferir("José", "Maria", 300);

        banco.exibirSaldo("José");
        banco.exibirSaldo("Maria");
    }
}
