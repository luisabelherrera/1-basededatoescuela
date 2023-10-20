
package model;

/**
 *
 * @author abel
 */
import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Loginmodel {
    public static String authenticate(String username, String password) {
        String userType = null;
        
        if (username.isEmpty() || password.isEmpty()) {
            return "Debes llenar todos los campos";
        }
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select tipo_nivel, estatus from usuarios where username = ? and password = ?");
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String tipo_nivel = rs.getString("tipo_nivel");
                String estatus = rs.getString("estatus");

                if (tipo_nivel.equalsIgnoreCase("Rector") && estatus.equalsIgnoreCase("Activo")) {
                    userType = "Rector";
                } else if (tipo_nivel.equalsIgnoreCase("profesor") && estatus.equalsIgnoreCase("Activo")) {
                    userType = "Profesor";
                } else if (tipo_nivel.equalsIgnoreCase("alumno") && estatus.equalsIgnoreCase("Activo")) {
                    userType = "Alumno";
                }
            } else {
                return "Datos de acceso incorrectos.";
            }
        } catch (SQLException e) {
            System.err.println("Error en la autenticación: " + e);
            return "¡¡ERROR al iniciar!!, contacte al administrador.";
        }
        
        return userType;
    }
}
