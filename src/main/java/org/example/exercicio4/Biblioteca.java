package org.example.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo) {
        livros.add(new Livro(titulo));
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.emprestar();
                return;
            }
        }
        System.out.println("Livro não encontrado no acervo.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.devolver();
                return;
            }
        }
        System.out.println("Livro não encontrado no acervo.");
    }
}
