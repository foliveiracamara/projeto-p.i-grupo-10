package com.mycompany.livros;


public class Livro {
    
    public static void main(String[] args) {
        Bibliotecario bibliotecario = new Bibliotecario();
        
        Boolean continuarPrograma = true;
        
        while(continuarPrograma) {
            Integer opcaoEscolhida = bibliotecario.iniciarPrograma();
            switch(opcaoEscolhida) {
                case 1 -> {
                    Integer resposta = bibliotecario.calcularLeitura();
                    continuarPrograma = bibliotecario.continuarOuNao(resposta);
                }
                case 2 -> {
                    Integer resposta = bibliotecario.sugestaoLivro();
                    continuarPrograma = bibliotecario.continuarOuNao(resposta);
                }
                case 3 -> {
                    Integer resposta = bibliotecario.exibirPaginasLidas();
                    continuarPrograma = bibliotecario.continuarOuNao(resposta);
                }
                case 4 -> {
                    System.out.println("Muito obrigado e volte sempre!");
                    continuarPrograma = false;
                }
                default -> {
                    System.out.println("Número inválido. Tente novamente.");
                }
            }
        }
    }
}
