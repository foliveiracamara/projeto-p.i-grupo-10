import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utils util = new Utils();
		Boolean sair = false;
		do {
			util.menu();
			Integer opcao = scanner.nextInt();
			Boolean check = false;
			do {
				check = util.validaOpcao(opcao);
			} while(!check);
			if (opcao == 0) {
				System.out.println(String.format("Você escolheu a calculadora"));
				System.out.println(String.format("Digite um numero"));
				Double n1 = scanner.nextDouble();
				System.out.println(String.format("Digite o segundo numero"));
				Double n2 = scanner.nextDouble();
				String op;
				Boolean validaOperacao = false;
				do {
					System.out.println(String.format("Digite a operacao sendo [+, -, *, /]"));
					op = scanner.next();
					validaOperacao = util.validaOperacao(op);
				} while (!validaOperacao);
				Double resultado = util.calculadora(n1, n2, op);
				System.out.println(String.format("O resultado da operação é: %f", resultado));
			} else if (opcao == 1) {
				System.out.println(String.format("Você escolheu a opcao de descobrir o número sorteado"));
				Boolean erroValidacao = false;
				Integer inicio = 0;
				Integer fim = 0;
				Integer numero = 0;
				do {
					System.out.println(String.format("Digite um numero inicial"));
					inicio = scanner.nextInt();
					System.out.println(String.format("Digite um numero final"));
					fim = scanner.nextInt();
				} while (util.validaInicioFim(inicio, fim));
				do {
					System.out.println(String.format("Por favor, digite um numero entre %d e %d", inicio, fim));
					numero = scanner.nextInt();
					erroValidacao = util.validaInicioFimNumero(inicio, fim, numero);
				} while(erroValidacao);
				
				Integer aleatorio = util.gerarNumero(inicio, fim);
				
				while (numero != aleatorio) {
					System.out.println(String.format("Você digitou %d, e você errou", numero));
					System.out.println(String.format("Não desista, digite o numero novamente"));
					numero = scanner.nextInt();
				}
				System.out.println(String.format("Parabens, você acertou!!!\nO numero sorteado era %d", aleatorio));
			} else if (opcao == 2) {
				System.out.println(String.format("Você escolheu a opcao repetir uma palavra"));
				System.out.println(String.format("Digite uma palavra para que possa repetir"));
				String palavra = scanner.next();
				System.out.println(String.format("Digite a quantidade de vezes que deseja repetir"));
				Integer numero = scanner.nextInt();
				String palavraRepetida = util.repetir(palavra, numero);
				System.out.println(String.format("A palavra %s vai aparecer %d vezes", palavra, numero));
				System.out.println(String.format("%s", palavraRepetida));
			} else if (opcao == 3) {
				sair = true;
				System.out.println(String.format("Você escolheu a opcao sair"));
				util.sair();
			}
		} while (!sair);
		scanner.close();
	}
}
