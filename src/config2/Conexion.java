package config2;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion {
    private Connection con1;
    private Connection con2;
    private Connection con3;
    private Connection con4;
  
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/datosacademicos", "root", "");
            con2 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/abelito", "root", "");
            con3 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/calculo", "root", "");
            
        } catch (Exception e) {
            System.err.println("No se puede conectar. Error: " + e);
        }
    }

    public Connection getConnection1() {
        return con1;
    }

    public Connection getConnection2() {
        return con2;
    }
    public Connection getConnection3(){
        return  con3;
    }
  
   
        }
    
   

