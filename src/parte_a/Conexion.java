package parte_a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection conexion = null;
    private String usuario = "root";
    private String password = "admin";
    private String puerto = "3306";
    private String db = "tp3prog3sql";
    private String servidor = "localhost";
    
    public Connection conectar() {
        if (conexion != null) {
            return conexion;
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String urlConexion = "jdbc:mysql://" + servidor + ":" + puerto + "/" + db;
            conexion = DriverManager.getConnection(urlConexion, usuario, password);
        } catch (SQLException ex) {
            System.out.println("SQLException:  " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexion;
    }
    
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("SQLException:  " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
