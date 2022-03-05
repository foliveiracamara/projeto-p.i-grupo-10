
import java.util.Scanner;

public class MenuInicial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UtilitariosFinanciamento utilFinanciamento
                = new UtilitariosFinanciamento();

        UtilitariosEmprestimosFinanciamentos utilEmprestimosFinanciamentos
                = new UtilitariosEmprestimosFinanciamentos();

        UtilitariosDepositos utilDepositos
                = new UtilitariosDepositos();

        Integer voltarMenu = 0;

        while (voltarMenu == 0) {
            System.out.println(""
                    + "#     #  #####	#     #\n"
                    + "# # # #  #	# # # #\n"
                    + "#  #  #  #####	#  #  #\n"
                    + "#     #	 #	#     #\n"
                    + "#     #  #	#     #");
            System.out.println(">>> Olá, Bem vindo ao Banco MFM <<< \n\n"
                    + "Escolha uma das nossas opções abaixo:\n\n"
                    + "(1) - Financiamento de Veículo\n"
                    + "(2) - Simular emprestimos e investimentos\n"
                    + "(3) - Deposito\n"
                    + "(4) - Sair\n"
                    + "Digite o número da opção:");
            Integer opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n>>> Bem Vindo ao simulador de Financiamento de Veículos <<<\n");

                    System.out.println("Informe o valor do carro a vista: ");
                    Double valorCarroVista = input.nextDouble();

                    System.out.println("Informe a quantidade de parcelas: ");
                    Integer quantidadeParcelas = input.nextInt();

                    String resultadoFinanciamento = utilFinanciamento.respostaFinanciamento(valorCarroVista, quantidadeParcelas);

                    System.out.println(resultadoFinanciamento);

                    break;
                case 2:

                    Integer voltarMenuEmprestimo = 0;

                    while (voltarMenuEmprestimo == 0) {
                        System.out.println(">>> Bem Vindo ao simulador de Emprestimo e Investimentos <<<\n\n"
                                + "Digite o número da operação:\n\n"
                                + "(1) - Empréstimo\n"
                                + "(2) - Investimento\n"
                                + "(3) - Sair");
                        Integer opcaoEmprestimoInvestimento = input.nextInt();

                        switch (opcaoEmprestimoInvestimento) {
                            case 1:
                                System.out.println(">>> Opção Emprestimo selecionada <<< \n\n");
                                System.out.println("Informe o valor do emprestimo: ");
                                Double valorEmprestimo = input.nextDouble();

                                System.out.println("Informe a quantidade de parcelas: ");
                                Integer quantidadeParcelasEmprestimo = input.nextInt();

                                String respostaEmprestimento
                                        = utilEmprestimosFinanciamentos.respostaEmprestimo(valorEmprestimo, quantidadeParcelasEmprestimo);

                                System.out.println(respostaEmprestimento);
                                break;
                            case 2:
                                System.out.println(">>> Opção Investimento selecionada <<< \n");
                                System.out.println("Informe o valor do investimento: ");
                                Double valorInvestimento = input.nextDouble();

                                System.out.println("Informe a quantidade (mês) de tempo para rendimento: ");
                                Integer quantidadeRendimentoInvestimento = input.nextInt();

                                String respostaInvestimento = utilEmprestimosFinanciamentos.respostaInvestimento(valorInvestimento, quantidadeRendimentoInvestimento);

                                System.out.println(respostaInvestimento);

                                break;
                            case 3:
                                System.out.println(">>> Obrigado por usar nosso simulador de Emprestimos e Investimentos! <<< \n\n");
                                voltarMenuEmprestimo = 1;
                                break;
                            default:
                                System.out.println("Opção inválida, escolha uma das opções a seguir:");
                        }
                    }
                    break;
                case 3:
                    System.out.println(">>> Bem vindo a área de depositos <<< \n");

                    System.out.println("Informe a quantidade de depositos realizados: ");
                    Integer quantidadeDepositos = input.nextInt();

                    System.out.println("Informe o valor depositado: ");
                    Double valorDeposito = input.nextDouble();

                    Double acumulativoDeposito = 0.0;

                    System.out.println(">>> Extrato da sua conta <<<");

                    for (Integer mes = 1; mes <= quantidadeDepositos; mes++) {

                        acumulativoDeposito += valorDeposito;

                        System.out.println(String.format("%dº Mês: R$ %.2f", mes, acumulativoDeposito));
                    }

                    String respostaDepositos = utilDepositos.respostaDeposito(quantidadeDepositos, valorDeposito, acumulativoDeposito);

                    System.out.println(respostaDepositos);
                    break;

                case 4:
                    System.out.println("\n\n>>> Obrigado por usar o app do Banco MFM, até logo :) <<<");
                    voltarMenu = 1;
                    break;

                default:
                    System.out.println("\nOpção inválida, escolha uma das opções a seguir: \n");
            }

        }

    }
}
