import java.util.concurrent.ThreadLocalRandom;

public class Utils {
	void menu() {
		System.out.println(String.format(repetir("-", 10)));
		System.out.println(String.format("[0] - Calculadora"));
		System.out.println(String.format("[1] - Descobrir o número"));
		System.out.println(String.format("[2] - Repetir uma palavra"));
		System.out.println(String.format("[3] - Sair"));
	}
	Boolean validaOpcao(Integer opcao) {
		if(opcao < 0 || opcao > 3)
			return false;
		return true;
	}
	Double calculadora(Double n1, Double n2, String operacao) {
		Double value = 0.0;
		switch (operacao) {
			case "+":
				value = n1 + n2;
				break;
			case "-":
				value = n1 - n2;
				break;
			case "*":
				value = n1 * n2;
				break;
			case "/":
				value = n1 / n2;
				break;
		}
		return value;
	}
	Boolean validaOperacao(String operacao) {
		switch (operacao) {
			case "+":
				break;
			case "-":
				break;
			case "*":
				break;
			case "/":
				break;
			default:
				return false;
		}
		return true;
	}
	Integer gerarNumero(Integer inicio, Integer fim) {
		return ThreadLocalRandom.current().nextInt(inicio, fim);
	}
	Boolean validaInicioFim(Integer inicio, Integer fim) {
		return inicio < fim ? true : false;
	}
	Boolean validaInicioFimNumero(Integer inicio, Integer fim, Integer numero) {
		if (numero >= inicio && numero <= fim) {
			return true;
		}
		return false;
	}
	String repetir(String text, Integer count) {
		return text.repeat(count);
	}
	void sair() {
		System.out.println(String.format("POWEROFF"));
	}
}
