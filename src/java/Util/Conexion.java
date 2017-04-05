package Util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion implements Serializable {

    private Connection conexion;
    private final String schemaPpal = "ufps_87";
    private final String db_url = "jdbc:mysql://sandbox2.ufps.edu.co/" + schemaPpal;
    private final String db_driver = "com.mysql.jdbc.Driver";
    private final String db_usuario = "ufps_87";
    private final String db_contrasena = "ufps_er";

    public Conexion() throws SQLException {
        try {
            Class.forName(db_driver).newInstance();
            conexion = DriverManager.getConnection(db_url, db_usuario, db_contrasena);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (InstantiationException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void close() throws SQLException {

        if (conexion != null) {
            try {
                conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    throw e;
                } catch (Exception ex) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public String getSchema() {
        return this.schemaPpal;
    }

    public Connection getConexion() {
        return conexion;
    }

    public static void main(String[] args) {
        try {
            Conexion co = new Conexion();
            System.out.println(co.getConexion());
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
