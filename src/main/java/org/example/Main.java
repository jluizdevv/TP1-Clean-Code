package org.example;

import org.example.exercicio1.SistemaFinanceiro;

public class Main {
    public static void main(String[] args) {
        SistemaFinanceiro sistema = new SistemaFinanceiro();

        sistema.adicionarConta("José", 1000);
        sistema.adicionarConta("Luiz", 1500);

        sistema.gerarRelatorio();

        sistema.processarPagamentos(100);
        sistema.gerarRelatorio();
    }
}
