package org.example.exercicio5;

import java.util.HashMap;
import java.util.Map;

public class BancoServico {
    private Map<String, ContaBancaria> contas;

    public BancoServico() {
        this.contas = new HashMap<>();
    }

    public void criarConta(String titular, double saldoInicial) {
        if (!contas.containsKey(titular)) {
            contas.put(titular, new ContaBancaria(titular, saldoInicial));
            System.out.println("Conta criada para " + titular);
        } else {
            System.out.println("Erro: Conta já existente.");
        }
    }

    public void transferir(String origem, String destino, double valor) {
        ContaBancaria contaOrigem = contas.get(origem);
        ContaBancaria contaDestino = contas.get(destino);

        if (contaOrigem != null && contaDestino != null && contaOrigem.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada de " + origem + " para " + destino);
        } else {
            System.out.println("Erro na transferência.");
        }
    }

    public void exibirSaldo(String titular) {
        ContaBancaria conta = contas.get(titular);
        if (conta != null) {
            System.out.println("Saldo de " + titular + ": R$ " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
