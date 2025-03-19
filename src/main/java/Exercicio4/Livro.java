package Exercicio4;


public class Livro {
    private String titulo;
    private boolean disponivel;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro em empréstimo: " + titulo);
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido: " + titulo);
    }
}
