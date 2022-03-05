
public class UtilitariosDepositos {

    String respostaDeposito(Integer quantidadeDepositos, Double valorDeposito, Double acumulativoDeposito) {

        String resultadoDeposito = String.format("-------------------------------------------------------------------\n"
                + "Valor por deposito: R$ %.2f \n"
                + "Quantidade de deposito: %d \n"
                + "-------------------------------------------------------------------\n"
                + "Soma de todos os depósitos: R$ %.2f \n\n"
                + ">>> Obrigado por consultar seu extrato bancário <<< \n\n", 
                valorDeposito, quantidadeDepositos, acumulativoDeposito);

        return resultadoDeposito;

    }
}
