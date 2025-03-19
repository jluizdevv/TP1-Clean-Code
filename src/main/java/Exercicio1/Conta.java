package Exercicio1;

public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void processarPagamento(double taxa) {
        if (saldo >= taxa) {
            saldo -= taxa;
        } else {
            System.out.println("Erro: saldo insuficiente para " + nome);
        }
    }

    @Override
    public String toString() {
        return "Conta: " + nome + " - Saldo: " + saldo;
    }
}
