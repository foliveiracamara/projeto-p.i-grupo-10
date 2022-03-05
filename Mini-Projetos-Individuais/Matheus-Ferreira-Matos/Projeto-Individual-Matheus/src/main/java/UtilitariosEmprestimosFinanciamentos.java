
public class UtilitariosEmprestimosFinanciamentos {

    // Métodos - Seção Empretimo;
    Double calculaJurosMesEmprestimo(Double valorEmprestimo, Integer quantidadeParcelasEmprestimo) {

        Double valorComJuros;

        if (quantidadeParcelasEmprestimo >= 1 && quantidadeParcelasEmprestimo <= 6) {
            valorComJuros = ((12 * valorEmprestimo) / 100) + valorEmprestimo;
        } else if (quantidadeParcelasEmprestimo >= 7 && quantidadeParcelasEmprestimo <= 12) {
            valorComJuros = ((7 * valorEmprestimo) / 100) + valorEmprestimo;
        } else {
            valorComJuros = ((4.5 * valorEmprestimo) / 100) + valorEmprestimo;
        }

        return valorComJuros;
    }

    Double calculaPagarMesEmprestimo(Double valorEmprestimo, Integer quantidadeParcelasEmprestimo) {

        Double valorComJuros = calculaJurosMesEmprestimo(valorEmprestimo, quantidadeParcelasEmprestimo);
        Double valorPagarMes = valorComJuros / quantidadeParcelasEmprestimo;

        return valorPagarMes;
    }

    String respostaEmprestimo(Double valorEmprestimo, Integer quantidadeParcelasEmprestimo) {

        Double valorComJuros = calculaJurosMesEmprestimo(valorEmprestimo, quantidadeParcelasEmprestimo);
        Double valorPagarMes = calculaPagarMesEmprestimo(valorEmprestimo, quantidadeParcelasEmprestimo);

        String resultadoEmprestimo = String.format("\n\n-------------------------------------------------------\n"
                + "Valor do emprestimo: R$%.2f \n"
                + "Quantidade de Parcelas: %d \n"
                + "-------------------------------------------------------\n"
                + ">>> Tabela de Taxa de Emprestimo <<< \n"
                + "--- Até 6 parcelas: 12%% \n"
                + "--- De 7 a 12 parcelas: 7%% \n"
                + "--- Acima de 12 parcelas: 4.5%% \n"
                + "-------------------------------------------------------\n"
                + "Total do Emprestimo: R$ %.2f \n"
                + "Total a pagar mês: R$ %.2f \n\n"
                + ">>> Obrigado por usar nosso simulador de Emprestimo <<< \n\n",
                valorEmprestimo, quantidadeParcelasEmprestimo, valorComJuros, valorPagarMes);

        return resultadoEmprestimo;
    }

    // Métodos - Seção Empretimo;
    Double calculaRendimentoJuros(Double valorInvestimento, Integer quantidadeRendimentoInvestimento) {

        Double valorRendimentoComJuros;

        if (quantidadeRendimentoInvestimento >= 1 && quantidadeRendimentoInvestimento <= 6) {
            valorRendimentoComJuros = (((6.3 * valorInvestimento) / 100) + valorInvestimento);
        } else if (quantidadeRendimentoInvestimento >= 7 && quantidadeRendimentoInvestimento <= 12) {
            valorRendimentoComJuros = (((8.7 * valorInvestimento) / 100) + valorInvestimento);
        } else {
            valorRendimentoComJuros = (((14 * valorInvestimento) / 100) + valorInvestimento);
        }

        return valorRendimentoComJuros;
    }

    Double calculaRendimentoMes(Double valorInvestimento, Integer quantidadeRendimentoInvestimento) {

        Double valorRendimentoComJuros = calculaRendimentoJuros(valorInvestimento, quantidadeRendimentoInvestimento);
        Double valorRendimentoMes = valorRendimentoComJuros / quantidadeRendimentoInvestimento;

        return valorRendimentoMes;
    }

    String respostaInvestimento(Double valorInvestimento, Integer quantidadeRendimentoInvestimento) {

        Double valorRendimentoComJuros = calculaRendimentoJuros(valorInvestimento, quantidadeRendimentoInvestimento);
        Double valorRendimentoMes = calculaRendimentoMes(valorInvestimento, quantidadeRendimentoInvestimento);

        String resultadoInvestimento = String.format("\n\n-------------------------------------------------------\n"
                + "Valor do Investimento: R$%.2f \n"
                + "Tempo a ser retirado: %d meses\n"
                + "-------------------------------------------------------\n"
                + ">>> Tabela de Taxa de Investimento <<< \n"
                + "--- Até 6 parcelas: 6.3%% \n"
                + "--- De 7 a 12 parcelas: 8.7%% \n"
                + "--- Acima de 12 parcelas: 14%% \n"
                + "-------------------------------------------------------\n"
                + "Total do rendimento: R$ %.2f \n"
                + "Total do rendimento ao mês: R$ %.2f \n\n"
                + ">>> Obrigado por usar nosso simulador de Investimento <<< \n", 
                valorInvestimento, quantidadeRendimentoInvestimento, 
                valorRendimentoComJuros, valorRendimentoMes);
        
        return resultadoInvestimento;
    }
}
