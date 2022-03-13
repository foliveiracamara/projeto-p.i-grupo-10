package com.mycompany.projetoindividual;

/**
 *
 * @author Juliana Esteves
 */
public class Utilitaria {

    Double calcularIMC(Double peso, Double altura) {
        return peso / (altura * altura);
    }

    void exibirClassificacao(Double imc) {
        if (imc < 18.5) {
            System.out.println("A classificação do seu IMC é: Magreza, grau 0");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("A classificação do seu IMC é: Normal, grau 0");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("A classificação do seu IMC é: Sobrepeso, grau 1");
        } else if (imc >= 30 && imc <= 39.9) {
            System.out.println("A classificação do seu IMC é: Obesidade, grau 2");
        } else {
            System.out.println("A classificação do seu IMC é: Obesidade Grave, grau 3\n"
                    + "Recomenda-se procurar um médico!");
        }
    }

    void exibirResposta(Integer resposta) {
        if (resposta == 1) {
            System.out.println("Em 2019, uma em cada quatro pessoas de "
                    + "18 anos ou mais anos de idade no Brasil estava obesa,"
                    + "\no equivalente a 41 milhões de pessoas. Já o excesso"
                    + " de peso atingia 60,3% da população de 18 anos\nou mais de idade,"
                    + " o que corresponde a 96 milhões de pessoas, "
                    + "sendo 62,6% das mulheres e 57,5% dos homens.\n\nFonte: IBGE");
        } else if (resposta == 2) {
            System.out.println("Ok, até logo!");
        } else {
            System.out.println("Número inválido! Você encerrou o programa.");
        }
    }
}
