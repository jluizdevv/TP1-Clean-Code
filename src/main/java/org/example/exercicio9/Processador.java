package org.example.exercicio9;

public class Processador {

    public void executar(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("O valor não pode ser nulo ou vazio.");
        }
        System.out.println("Processando: " + valor);
    }
}
