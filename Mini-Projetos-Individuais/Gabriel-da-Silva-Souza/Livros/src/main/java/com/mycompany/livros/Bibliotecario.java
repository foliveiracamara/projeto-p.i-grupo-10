package com.mycompany.livros;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Bibliotecario {
    Scanner leitorConsole = new Scanner(System.in);
    
    Integer iniciarPrograma() {
        System.out.println("Bem vindo ao Booking!");
        System.out.println("-".repeat(50)); 
        System.out.println("Escolha uma das opções abaixo para começar: ");
        System.out.println("1 - Saiba seu nível de leitura");
        System.out.println("2 - Receba uma sugestão de livro de acordo com seu gosto");
        System.out.println("3 - Entenda o poder da consistência");
        System.out.println("4 - Sair");
        Integer opcaoEscolhida = leitorConsole.nextInt();
        return opcaoEscolhida;
    }
    
    Integer reiniciarPrograma() {
        System.out.println("Gostaria de voltar ao início?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        Integer resposta = leitorConsole.nextInt();
        if (resposta == 2) System.out.println("Muito obrigado e volte sempre!");
        return resposta;
    }
    
    void dividirTexto() {
        System.out.println("-".repeat(50));
    }
    
    Boolean continuarOuNao(Integer resposta) {
        Boolean continuarPrograma = true;
        if (resposta == 2) {
            continuarPrograma = false;
        } else if (resposta == 1) {
            continuarPrograma = true;
        }
        return continuarPrograma;
    }
    
    Integer calcularLeitura() { 
        System.out.println("Quantos livros você leu em 2021?");
        Integer quantidadeLida = leitorConsole.nextInt();
        Double percentualAnual = ((quantidadeLida * 100) / 2.43) - 100;

        if (percentualAnual >= 0) {
            System.out.println(String.format("Você leu %.0f%% a mais do que a média "
                + "brasileira", percentualAnual));        
        } else {
            System.out.println(String.format("Você leu %.0f%% a menos do que a média "
                + "brasileira", Math.abs(percentualAnual)));        

        }
        dividirTexto();
        Integer resposta = reiniciarPrograma();
        return resposta;
    }
    
    Integer sugestaoLivro() {
        System.out.println("Qual seu tema favorito entre os listados?");
        System.out.println("1 - Ficção Científica");
        System.out.println("2 - Drama");
        System.out.println("3 - Romance");
        System.out.println("4 - Desenvolvimento pessoal");
        
        Integer temaEscolhido = leitorConsole.nextInt();
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(3);
        String livroRecomendado = "";

        livroRecomendado = switch (temaEscolhido) {
            case 1 -> switch (numeroAleatorio) {
                case 0 -> "Duna";
                case 1 -> "1984";
                default -> "Neuromancer";
            };
            case 2 -> switch (numeroAleatorio) {
                case 0 -> "Madame Bovary";
                case 1 -> "Crime e Castigo";
                default -> "Hamlet";
            };
            case 3 -> switch (numeroAleatorio) {
                case 0 -> "Dom Casmurro";
                case 1 -> "Romeu e Julieta";
                default -> "Anna Karenina";
            };
            default -> switch (numeroAleatorio) {
                case 0 -> "12 Regras para a vida";
                case 1 -> "Trabalhe 4 horas por semana";
                default -> "Como fazer amigos e influenciar pessoas";
            };
        };
        
        System.out.println(String.format("%s é um ótimo livro!", livroRecomendado));
        dividirTexto();
        Integer resposta = reiniciarPrograma();
        return resposta;
    }
    
    Integer exibirPaginasLidas() {
        System.out.println("O hábito da leitura é muito importante. Digite um"
                + " número de páginas ao qual irá se comprometer a ler diariamente"
                + " durante o ano");
        
        Integer paginasPorDia = leitorConsole.nextInt();
        Integer paginasLidas = 0;
        
        for (int i = 0; i < 365; i++) {
            paginasLidas += paginasPorDia;
        }
        
        Integer mediaLivros = paginasLidas / 200;
        
        System.out.println(String.format("Com %d páginas por dia você terá "
                + "lido %d páginas no ano, considerando uma média de 200 "
                + "páginas por livro, conseguirá ler aproximadamente "
                + "%d livros", paginasPorDia, paginasLidas, mediaLivros));
        
        dividirTexto();
        Integer resposta = reiniciarPrograma();
        return resposta;
    }
    
    
}
