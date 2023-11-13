package db;

import java.sql.SQLException;
import model.TipoProducto;

public class Data {
    
    private Conexion conn;

    public Data() throws SQLException {
        conn = new Conexion("almacen");
    }

    public void add(TipoProducto tipo) throws SQLException {
        String sql = "INSERT INTO tipos VALUES(null, '"+tipo.getTag()+"')";
        conn.ejecutarQuery(sql);
    }
    
    
    
    
    
    
    
}
