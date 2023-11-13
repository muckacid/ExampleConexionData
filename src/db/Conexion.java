package db;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {

    private Connection conn;
    private Statement stat;

    public Conexion(String db) throws SQLException {
        String url = "jdbc:mysql://localhost/" + db + "?user=root&password=";
        this.conn = DriverManager.getConnection(url);
    }

    public ResultSet ejecutarQuery(String sql) throws SQLException {
        stat = conn.createStatement();
        if (sql.toLowerCase().startsWith("insert") || 
                sql.toLowerCase().startsWith("update") || 
                sql.toLowerCase().startsWith("delete")) {
            stat.executeUpdate(sql);
            stat.close();
        }
        if (sql.toLowerCase().startsWith("select")) {
            ResultSet rs = stat.executeQuery(sql);
            return rs;
        }
        return null;
    }

    public void close() throws SQLException {
        stat.close();
    }

}
