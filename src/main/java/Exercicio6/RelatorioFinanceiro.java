package Exercicio6;

import java.util.List;

public class RelatorioFinanceiro {

    public void gerarRelatorio(List<String> clientes, List<Double> saldos) {
        exibirCabecalho();
        exibirDetalhes(clientes, saldos);
        exibirRodape();
    }

    private void exibirCabecalho() {
        System.out.println("=== Relatório Financeiro ===");
    }

    private void exibirDetalhes(List<String> clientes, List<Double> saldos) {
        for (int i = 0; i < clientes.size(); i++) {
            exibirClienteSaldo(clientes.get(i), saldos.get(i));
        }
    }

    private void exibirClienteSaldo(String cliente, double saldo) {
        System.out.println("Cliente: " + cliente + " - Saldo: R$ " + saldo);
    }

    private void exibirRodape() {
        System.out.println("===========================");
        System.out.println("Fim do Relatório");
    }
}

