package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        produtos.add(new Produto(nome, preco, quantidade));
    }

    public void calcularTotal() {
        double total = 0;
        System.out.println("=== Resumo da Compra ===");
        for (Produto produto : produtos) {
            System.out.println(produto);
            total += produto.calcularSubtotal();
        }
        System.out.println("Total da compra: R$ " + total);
    }
}