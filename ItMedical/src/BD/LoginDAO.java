package BD;

import java.sql.*;

public class LoginDAO {

    private Connection conectar() {
        Conexion conexion = new Conexion(); // usa tu clase Conexion
        return conexion.getConnection();
    }

    public boolean validarUsuario(String usuario, String contraseña) {
        String sql = "SELECT * FROM login WHERE Usuario=? AND Contraseña=?"; // ← tabla correcta
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            if (con == null) {
                System.out.println("Conexión nula");
                return false;
            }

            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            return rs.next(); // true si existe usuario y contraseña
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
