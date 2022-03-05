
public class UtilitariosFinanciamento {

    // Opção 01 Métodos;
    Double calcularFinanciamentoMes(Double valorCarroVista, Integer quantidadeParcelas) {

        Double jurosMes = (2 * valorCarroVista) / 100;
        Double totalPagarMes = ((valorCarroVista / quantidadeParcelas) + jurosMes);
        
        return totalPagarMes;
    }

    Double calcularFinanciamentoTotal(Double valorCarroVista, Integer quantidadeParcelas) {

        Double totalPagarMes = calcularFinanciamentoMes(valorCarroVista, quantidadeParcelas);
        Double totalFinalMes = totalPagarMes * quantidadeParcelas;

        return totalFinalMes;
    }

    String respostaFinanciamento(Double valorCarroVista, Integer quantidadeParcelas) {

        Double totalPagarMes = calcularFinanciamentoMes(valorCarroVista, quantidadeParcelas);
        Double totalFinalMes = calcularFinanciamentoTotal(valorCarroVista, quantidadeParcelas);
        
        String resultadoFinanciamento = (String.format(">>> Simulação de Financiamento <<<\n\n"
                + "Valor a vista do veículo: %.2f \n"
                + "Quantidade de parcela: %d \n"
                + "Juros ao mês de 2%% \n\n"
                + "------------------------------------------------ \n"
                + ">>> Financiamento <<< \n"
                + "Total com juros mensal: %.2f \n"
                + "Total a pagar mensal: %.2f \n\n\n"
                + ">>> Obrigado por usar o simulador de financiamento <<< \n", 
                valorCarroVista, quantidadeParcelas, totalFinalMes, totalPagarMes));

        return resultadoFinanciamento;
    }
}
