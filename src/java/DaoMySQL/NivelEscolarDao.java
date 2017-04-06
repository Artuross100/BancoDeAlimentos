package DaoMySQL;

import Entidades.*;
import Util.Conexion;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NivelEscolarDao implements Serializable{
        
    private Conexion conexion;

    public NivelEscolarDao() throws SQLException {
        this.conexion = new Conexion();
    }

    public boolean registrar(String nombre) {
        String consulta = "INSERT INTO NivelEscolar (descripcion) VALUES(?)";
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
    
    public ArrayList<NivelEscolar> cargar() {
        ArrayList<NivelEscolar> tipos = new ArrayList<NivelEscolar>();
        String consulta = "SELECT id, descripcion, fecha FROM NivelEscolar";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            NivelEscolar t;
            while (rs.next()) {
                t = new NivelEscolar();
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
