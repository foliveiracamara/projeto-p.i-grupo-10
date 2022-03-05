import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProjetoIndividualAssistenteVirtual {
    public static void main(String[] args) {
        
        System.out.println("Digite seu nome: ");
        Scanner leitor = new Scanner(System.in);
        String nomeUsuario = leitor.next();
        
        System.out.println(String.format("Olá %s, eu sou sua assistente virtual"
                + ", como posso ajudar?", nomeUsuario));
        System.out.println("Você pode perguntar algo como esses "
                + "exemplos abaixo: ");
        System.out.println("Opção 1: Quero converter real para dolar.");
        System.out.println("Opção 2: Está de noite ou de dia na China?");
        System.out.println("Opção 3: Me conte uma piada.");
        System.out.println("Opção 4: Ver feriados de 2022.");
        System.out.println("Opção 5: Qual é o meu número da sorte hoje?.");
        System.out.println("Opção 6: Encerrar assistente virtual.");
        System.out.println("-".repeat(40));
        System.out.println("Digite abaixo a opção desejada: ");
        
        Integer numeroDigitado;
        Double numeroConversaoDolar;
        Integer numeroRandom =  ThreadLocalRandom.current().nextInt(0, 10000);
        
        do{
            Scanner leitorOpcao = new Scanner(System.in);
            numeroDigitado = leitorOpcao.nextInt();
            
            if(numeroDigitado > 6 || numeroDigitado < 1){
                System.out.println("Digite um número válido");
            }
        }while(numeroDigitado > 6 || numeroDigitado < 1);
        
        switch (numeroDigitado){
            case 1:
                System.out.println("Qual valor em real deseja converter?");
                System.out.println("Digite abaixo: ");
                
                Scanner leitorDolar = new Scanner(System.in);
                numeroConversaoDolar = leitorDolar.nextDouble();
                Double resultadoConversao = numeroConversaoDolar / 5.16;
                
                System.out.println(String.format("O valor de %.2f reais"
                        + " está %.2f dolares", numeroConversaoDolar, 
                                                resultadoConversao));
                break;
            case 2:
                System.out.println("Na cidade que você está, já "
                        + "está de noite?");
                System.out.println("Responda sim ou não: ");
                
                Scanner leitorHoraDoDia = new Scanner(System.in);
                String ehNoite = leitorHoraDoDia.next();
                
                if(ehNoite.equals("sim")){
                    System.out.println("Então na China está de dia.");
                }else if(ehNoite.equals("não") || ehNoite.equals("nao")){
                    System.out.println("Então na China está de noite.");
                }else{
                    System.out.println("Resposta inválida.");
                }
                break;
            case 3:
                System.out.println("O que o tomate foi fazer no banco?");
                System.out.println("Resposta: Tirar extrato");
                break;
            case 4:
                FeriadosDoAno listarFeriados = new FeriadosDoAno();
                listarFeriados.ListarFeriados();
                break;
            case 5:
                System.out.println(String.format("Seu número da sorte "
                        + "de hoje é %d", numeroRandom));
                break;
            case 6:
                System.out.println("Até mais! Se precisar estou aqui!");
                break;
            default:
                break;
        }
    }
}
