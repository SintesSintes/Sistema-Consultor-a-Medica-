package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Datos de conexión
    String url = "jdbc:mysql://localhost:3306/itmedical?useSSL=false&serverTimezone=UTC";
    static String usuario = "root"; 
    static String pass = "";        

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.toString());
        }
        return con;
    }
}
