package DBAccess;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The purpose of Connector is to...
 *
 * @author kasper
 */
public class Connector {

//    private static final String URL = "jdbc:mysql://159.89.10.139:3306/Legohus";
//    private static final String USERNAME = "Standard";
//    private static final String PASSWORD = "manager22";
    private static Connection singleton;

    private static void setConnection(Connection con) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if (singleton == null) {

            MysqlDataSource Source = new MysqlDataSource();
            Source.setServerName("localhost");
            Source.setPort(3306);
            Source.setDatabaseName("Legohus");
            Source.setUser("susteven");
            Source.setPassword("hejhejlol1");
            singleton = Source.getConnection();

        }
        return singleton;
    }

}
