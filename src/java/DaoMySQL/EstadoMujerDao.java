package DaoMySQL;

import Entidades.*;
import Util.Conexion;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EstadoMujerDao implements Serializable{
        
    private Conexion conexion;

    public EstadoMujerDao() throws SQLException {
        this.conexion = new Conexion();
    }

    public boolean registrar(String nombre) {
        String consulta = "INSERT INTO EstadoMujer (descripcion) VALUES(?)";
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
    
    public ArrayList<EstadoMujer> cargar() {
        ArrayList<EstadoMujer> tipos = new ArrayList<EstadoMujer>();
        String consulta = "SELECT id, descripcion, fecha FROM EstadoMujer";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            EstadoMujer t;
            while (rs.next()) {
                t = new EstadoMujer();
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
