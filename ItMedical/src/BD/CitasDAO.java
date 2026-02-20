package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CitasDAO {

    public boolean insertarCita(
        String hora,
        String paciente,
        String dni,
        String estudio,
        String obraSocial,
        String importe,
        String contacto,
        String observaciones,
        String dadoPor,
        String recepPor
    ) {

        String sql = "INSERT INTO citas "
                   + "(hora, paciente, dni, estudio, obra_social, importe, contacto, observaciones, dado_por, recepcionado_por) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Conexion con = new Conexion();
            Connection cn = con.getConnection();

            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, hora);
            ps.setString(2, paciente);
            ps.setString(3, dni);
            ps.setString(4, estudio);
            ps.setString(5, obraSocial);
            ps.setString(6, importe);
            ps.setString(7, contacto);
            ps.setString(8, observaciones);
            ps.setString(9, dadoPor);
            ps.setString(10, recepPor);

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error al insertar cita: " + e);
            return false;
        }
    }
    // Dentro de CitasDAO.java
public ResultSet listarCitasPorEspecialidad(String especialidad) {
    try {
        Conexion con = new Conexion();
        Connection cn = con.getConnection();
        String sql = "SELECT hora, paciente, dni, estudio, obra_social, importe, contacto, observaciones, dado_por, recepcionado_por "
                   + "FROM citas WHERE estudio = ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, especialidad);
        return ps.executeQuery();
    } catch (Exception e) {
        System.out.println("Error al listar citas por especialidad: " + e.getMessage());
        return null;
    }
}

    public ResultSet listarCitas() {
    try {
        Conexion con = new Conexion();
        Connection cn = con.getConnection();

        // Consulta SQL para listar citas
        String sql = "SELECT hora, paciente, dni, estudio, obra_social, importe FROM citas";
        PreparedStatement ps = cn.prepareStatement(sql);

        // Ejecución de la consulta y retorno del ResultSet
        return ps.executeQuery();  // Sin la conversión innecesaria
        
    } catch (Exception e) {
        System.out.println("Error al listar citas: " + e.getMessage());
        return null;
    }
}

public ResultSet filtrarCitas(String campo, String valor) {
    try {
        Conexion con = new Conexion();
        Connection cn = con.getConnection();

        String sql = "SELECT hora, paciente, dni, estudio, obra_social, importe, "
                   + "contacto, observaciones, dado_por, recepcionado_por "
                   + "FROM citas WHERE " + campo + " LIKE ?";

        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, "%" + valor + "%");

        return ps.executeQuery();

    } catch (Exception e) {
        System.out.println("Error en filtro: " + e.getMessage());
        return null;
    }
}

}
