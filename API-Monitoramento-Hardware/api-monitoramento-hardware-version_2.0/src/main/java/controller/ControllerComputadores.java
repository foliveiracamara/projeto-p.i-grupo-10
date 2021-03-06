package controller;

import model.Computadores;
import connection.Connection;
import java.util.List;
import model.ContadoresBanco;
import model.InfoCpu;
import model.InfoDisco;
import model.InfoMaquina;
import model.InfoRam;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Matheus Mattos
 */
public class ControllerComputadores {

    //Instanciando conexão com o banco de dados e jdbc;
    Connection config = new Connection();
    JdbcTemplate connect = new JdbcTemplate(config.getDataSource());

    //Instanciando class para tazer informações(já formatadas) da maquina;    
    InfoMaquina infoMaquina = new InfoMaquina();
    InfoCpu infoCpu = new InfoCpu();
    InfoDisco infoDisco = new InfoDisco();
    InfoRam infoRam = new InfoRam();
    ContadoresBanco contador = new ContadoresBanco();

    //Criando variáveis para inserção no BD;
    String sistemaOperacional = infoMaquina.getSisOperacional();
    String arquitetura = infoMaquina.getArquitetura();
    String modeloProcessador = infoCpu.getNome();
    String idProcessador = infoCpu.getIdProcessador();
    Double memoriaRam = infoRam.getTotalMemoria();
    Double tamanhoDisco = infoDisco.getTotalDisco();
    List<Computadores> computador;

    //Método para inserir dados no BD após validação de login;
    public void inserirEquipamento() {

        computador = connect.query("SELECT * FROM Computadores WHERE idProcessador = ? "
                + "AND modeloProcessador = ?",
                new BeanPropertyRowMapper<>(Computadores.class),
                idProcessador, modeloProcessador);

        if (!computador.isEmpty()) {
            System.out.println("Bem vindo de volta");
            contador.setTotalSelect(+1);
        } else {
            String insertComputador = "INSERT INTO Computadores"
                    + "(sistemaOperacional, modeloProcessador,"
                    + "idProcessador, tamanhoDisco, tamanhoDiscoSecundario,"
                    + "tamanhoRam, fkUsuario) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            connect.update(insertComputador, sistemaOperacional,
                    modeloProcessador, idProcessador, tamanhoDisco,
                    null, memoriaRam, 1);
            System.out.println("Usuario criado com sucesso!!!");
            contador.setInsertComputadores(+1);
        }
    }
}
