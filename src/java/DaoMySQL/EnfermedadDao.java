package DaoMySQL;

import Entidades.*;
import Util.Conexion;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EnfermedadDao implements Serializable{
        
    private Conexion conexion;

    public EnfermedadDao() throws SQLException {
        this.conexion = new Conexion();
    }

    public boolean registrar(String nombre) {
        String consulta = "INSERT INTO Enfermedad (descripcion) VALUES(?)";
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
    
    public ArrayList<Enfermedad> cargar() {
        ArrayList<Enfermedad> tipos = new ArrayList<Enfermedad>();
        String consulta = "SELECT id, descripcion, fecha FROM Enfermedad";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            Enfermedad t;
            while (rs.next()) {
                t = new Enfermedad();
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
