import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.FileInputStream;


public class DBManager {
 private static Connection conn;

    public static Connection getConnection() throws Exception {
        if (conn == null || conn.isClosed()) {
            Properties prop = new Properties();
            prop.load(new FileInputStream("config.properties"));
               Class.forName("com.mysql.cj.jdbc.Driver");
            String url = prop.getProperty("db.url");
            String user = prop.getProperty("db.user");
            String password = prop.getProperty("db.password");

            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false); // transazioni
        }
        return conn;
    }
}