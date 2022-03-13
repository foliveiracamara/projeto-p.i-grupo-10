package com.mycompany.projetoindividual;

import java.util.Scanner;

/**
 *
 * @author Juliana Esteves
 */
public class Consulta {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        
        Utilitaria util = new Utilitaria();
        
        System.out.println("\nOlá! Este é um sistema de Consulta Online, aqui você "
                + "poderá verificar seu IMC e onde você se encaixa dentro do "
                + "padrão internacional\nde avaliação do grau de sobrepeso e obesidade.\n\n"
                + "Insira seu nome:");
        String nome = leitorTexto.nextLine();
        
        System.out.println(String.format("Seja bem vindo(a) %s! Vamos dar ínicio "
                + "na sua consulta. Insira seu peso: ", nome));
        Double peso = leitor.nextDouble();
        
        System.out.println("Insira sua altura:");
        Double altura = leitor.nextDouble();
        System.out.println("\nPerfeito! Vamos começar, escolha uma opção:");
        
        System.out.println("1- Calcular IMC\n2- Verificar grau de obesidade\n"
                + "3- O que é IMC?\n"
                + "4- Sair");
        Integer opcaoDigitada = leitor.nextInt();

        // Menu
        while (opcaoDigitada > 4 || opcaoDigitada < 1) {
            System.out.println("Por favor, insira um número válido");
            opcaoDigitada = leitor.nextInt();
        }
        
        switch (opcaoDigitada) {
            case 1:
                // Cálculo
                Double imc = util.calcularIMC(peso, altura);
                System.out.println(String.format("Seu IMC é %.1f", imc));
                break;
            
            case 2:
                // Condicionais (if, operador ternário)
                imc = util.calcularIMC(peso, altura);
                System.out.println(String.format("Seu IMC é %.1f", imc));
                util.exibirClassificacao(imc);
                break;
            
            case 3:
                // Livre
                System.out.println("IMC é a sigla para Índice de Massa Corpórea,"
                        + " parâmetro adotado pela Organização Mundial de Saúde\n"
                        + "para calcular o peso ideal de cada pessoa. O índice "
                        + "é calculado da seguinte maneira:\ndivide-se o peso do "
                        + "paciente pela sua altura elevada ao quadrado.");
                
                System.out.println("\nVocê deseja saber qual é o índice de obesidade no Brasil?\n"
                        + "1- Sim\n2- Não");
                Integer resposta = leitor.nextInt();
                util.exibirResposta(resposta);
                break;
            case 4:
                // Encerra o programa
                System.out.println("Até logo!");
                break;
            default:
            
        }
    }
}
