package org.example.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {
    private List<Conta> contas;

    public SistemaFinanceiro() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(String nome, double saldo) {
        contas.add(new Conta(nome, saldo));
    }

    public void gerarRelatorio() {
        System.out.println("=== Relatório Financeiro ===");
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public void processarPagamentos(double taxa) {
        for (Conta conta : contas) {
            conta.processarPagamento(taxa);
        }
    }
}
