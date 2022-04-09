package controller;

import model.Usuario;
import connection.Connection;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Matheus Mattos
 */
public class ControllerLogin {

    public Boolean logar(String email, String senha) {

        Connection config = new Connection();
        JdbcTemplate connect = new JdbcTemplate(config.getDataSource());

        Boolean valida = false;

        List<Usuario> user;
        user = connect.query("SELECT * FROM Usuario WHERE emailUser = ? AND senhaUser = ?",
                new BeanPropertyRowMapper<>(Usuario.class), email, senha);

        if (!user.isEmpty()) {
            valida = true;
        }

        return valida;
    }
}
