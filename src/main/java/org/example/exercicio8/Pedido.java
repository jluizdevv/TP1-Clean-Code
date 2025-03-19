package org.example.exercicio8;

public class Pedido {
    private int id;
    private String descricao;
    private double valor;

    public Pedido(int id, String descricao, double valor) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID do pedido deve ser positivo.");
        }
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição do pedido não pode estar vazia.");
        }
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do pedido não pode ser negativo.");
        }

        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("O ID do pedido deve ser positivo.");
        }
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}

