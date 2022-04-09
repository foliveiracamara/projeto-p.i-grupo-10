package controller;

import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.sistema.Sistema;
import connection.Connection;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Matheus Mattos
 */
public class ControllerMonitoramento {

    //Instanciando conexão com o banco de dados e jdbc;
    Connection config = new Connection();
    JdbcTemplate connect = new JdbcTemplate(config.getDataSource());

    //Instanciando API looca;
    Processador processador = new Processador();
    DiscosGroup discosGroup = new DiscosGroup();
    Memoria memoria = new Memoria();
    Sistema sistema = new Sistema();

    //Instanciando elementos para loop e formatação
    DecimalFormat formatarNumber = new DecimalFormat("#.00");
    Timer timer = new Timer();
    Integer delay = 10000;
    Integer interval = 4000;
    //Variavel contador;
    Integer contador = 0;

    public void inserirDadosMonitoramento() {

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                //Criando variaveis para inserção no BD;
                //Dados Processador;
                Integer cpuLogica = processador.getNumeroCpusLogicas();
                Integer cpuFisica = processador.getNumeroCpusFisicas();
                Double usoProcessador = processador.getUso();
                //Dados Disco;
                List<Volume> lista = discosGroup.getVolumes();
                Double totalDisco = Double.valueOf(lista.get(0).getTotal());
                Double disponivelDisco = Double.valueOf(lista.get(0).getDisponivel());
                Double usadoDisco = totalDisco - disponivelDisco;
                Double porcentagemDisco = (disponivelDisco / totalDisco) * 100;
                //Dados Memoria Ram;
                Double totalRam = Double.valueOf(memoria.getTotal());
                Double livreRam = Double.valueOf(memoria.getDisponivel());
                Double usoRam = Double.valueOf(memoria.getEmUso());
                Double porcentagemRam = (livreRam / totalRam) * 100;
                //Formatando segundos em horas;
                Long segundos = sistema.getTempoDeAtividade();
                Integer horas = (int) (segundos / 3600);
                segundos %= 3600;
                Integer minutos = (int) (segundos / 60);
                segundos %= 60;
                String tempoUsoFormatado = String.format("%d:%d:%d", horas, minutos, segundos);

                String insertMonitoramento = "INSERT INTO Monitoramento"
                        + "(processadorLogico, processadorFisico, usandoCpu,"
                        + "totalDisco, livreDisco, usandoDisco, totalRam,"
                        + "livreram, usandoRam, fkComputador, tempoDeUso, dataHoraCaptura) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

                connect.update(insertMonitoramento, cpuLogica, cpuFisica,
                        usoProcessador, totalDisco, disponivelDisco, usadoDisco,
                        totalRam, livreRam, usoRam, 1, tempoUsoFormatado);

                contador++;
                System.out.println("INSERT NA TABELA MONITORAMENTO - OK - Total: " + contador);
                //criar métodos para exibir as porcentagens na dash;
            }
        }, delay, interval);

    }
}
