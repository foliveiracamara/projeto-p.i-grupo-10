
import org.apache.commons.dbcp2.BasicDataSource;

public class Connetion {

    private BasicDataSource dataSource;

    public Connetion() {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://onhomesolutions.database.windows.net:1433;database=onHome;user=AdminOnHome@onhomesolutions;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        dataSource.setUsername("AdminOnHome");
        dataSource.setPassword("2ads@grupo10");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
