package DaoMySQL;

import Entidades.*;
import Util.Conexion;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GeneroDao implements Serializable{
        
    private Conexion conexion;

    public GeneroDao() throws SQLException {
        this.conexion = new Conexion();
    }

    public boolean registrar(String nombre) {
        String consulta = "INSERT INTO Genero (descripcion) VALUES(?)";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            stmt.setString(1, nombre);
            int x = stmt.executeUpdate();
            System.out.println("Operacion: " + x);
            stmt.close();
            this.conexion.close();
            if(x==1){
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return false;
    }
    
    public ArrayList<Genero> cargar() {
        ArrayList<Genero> tipos = new ArrayList<Genero>();
        String consulta = "SELECT id, descripcion, fecha FROM Genero";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            Genero t;
            while (rs.next()) {
                t = new Genero();
                t.setId(rs.getInt(1));
                t.setDescripcion(rs.getString(2));
                t.setFecha(rs.getDate(3));
                tipos.add(t);
            }
            rs.close();
            stmt.close();
            this.conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return tipos;
    }
}
