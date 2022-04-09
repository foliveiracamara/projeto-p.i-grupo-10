package controller;

import model.Computadores;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.sistema.Sistema;
import connection.Connection;
import java.util.List;
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

    //Instanciando API Looca para tazer informações da maquina;
    Sistema sistema = new Sistema();
    Processador processador = new Processador();
    Memoria memoria = new Memoria();
    DiscosGroup disco = new DiscosGroup();

    //Criando variáveis para inserção no BD;
    String sistemaOperacional = sistema.getSistemaOperacional();
    Integer arquitetura = sistema.getArquitetura();
    String modeloProcessador = processador.getNome();
    Long memoriaRam = memoria.getTotal();
    Long tamanhoDisco = disco.getTamanhoTotal();
    String idProcessador = processador.getId();
    List<Computadores> computador;

    //Variavel contador;
    Integer contador = 0;

    //Método para inserir dados no BD após validação de login;
    public void inserirEquipamento() {

        computador = connect.query("SELECT * FROM Computadores WHERE idProcessador = ? "
                + "AND modeloProcessador = ?",
                new BeanPropertyRowMapper<>(Computadores.class),
                idProcessador, modeloProcessador);

        if (!computador.isEmpty()) {
            System.out.println("Bem vindo de volta");
            contador++;
            System.out.println("SELECT NA TABELA MAQUINA - OK - Total: " + contador);
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
            contador++;
            System.out.println("INSERT NA TABELA MAQUINA - OK - Total: " + contador);
        }
    }
}
