
import org.springframework.jdbc.core.JdbcTemplate;


public class TesteConnetion {

    public static void main(String[] args) {
        Connetion connect = new Connetion();
        JdbcTemplate template = new JdbcTemplate(connect.getDataSource());
/*        
        template.update("CREATE TABLE Usuario ("
                + "idUsuario int primary key identity,"
                + "nomeUser varchar(50),"
                + "emailUser varchar(50),"
                + "senhaUser varchar(50),"
                + "cargo varchar(20),"
                + "dataCadastro date,"
                + "dataAtualizacao date,"
                + "fkEmpresa int)");
        
        System.out.println("Tabela Criada com sucesso!!!");
*/        
        template.update("INSERT INTO Usuario (nomeUser, emailUser, senhaUser,"
                + "cargo, dataCadastro) VALUES ("
                + "'Matheus Ferreira Matos',"
                + "'matheus.matos@bandtec.com.br',"
                + "'teste123',"
                + "'Admin',"
                + "getdate())");
        
        System.out.println("Usuário inserido com sucesso!!!");
    }
}
