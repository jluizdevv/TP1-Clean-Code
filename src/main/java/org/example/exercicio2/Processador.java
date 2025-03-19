package org.example.exercicio2;

public class Processador {

    public void validarEDisplay(String dado) {
        String mensagem = validarDado(dado);
        System.out.println(mensagem);
    }

    private String validarDado(String dado) {
        if (dado == null || dado.isEmpty()) {
            return "Erro: Dado inválido.";
        }
        if (dado.length() <= 10) {
            return "Erro: Dado muito curto.";
        }
        return "Dado válido: " + dado;
    }

    public void executar(String exemploDeDado) {
    }
}
