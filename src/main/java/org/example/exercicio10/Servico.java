package org.example.exercicio10;

public class Servico {

    public void processar(String dado) {
        if (dado == null || dado.trim().isEmpty()) {
            throw new IllegalArgumentException("O dado não pode ser nulo ou vazio.");
        }
        System.out.println("Processando: " + dado.toUpperCase());
    }
}

