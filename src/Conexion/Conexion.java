package Conexion;

import java.sql.DriverManager;
import java.sql.Connection;


public class Conexion {

    private Connection con2;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con2 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/abelito", "root", "");

        } catch (Exception e) {
            System.err.println("No se puede conectar. Error: " + e);
        }
    }

    public Connection getConnection2() {
        return con2;
    }

}
