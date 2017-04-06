package DaoMySQL;

import Entidades.TipoIdentificacion;
import Util.Conexion;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TipoDocumentoDao implements Serializable {

    private Conexion conexion;

    public TipoDocumentoDao() throws SQLException {
        this.conexion = new Conexion();
    }

//    @Override
    public ArrayList<TipoIdentificacion> cargar() {
        ArrayList<TipoIdentificacion> tipos = new ArrayList<TipoIdentificacion>();
        String consulta = "SELECT id, descripcion, fecha FROM TipoIdentificacion";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            TipoIdentificacion t;
            while (rs.next()) {
                t = new TipoIdentificacion();
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

    public boolean registrarDocumento(String nombre) {
        String consulta = "INSERT INTO TipoIdentificacion (descripcion) VALUES(?)";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            stmt.setString(1, nombre);
            int x = stmt.executeUpdate();
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

    public boolean eliminar(String doc) {
        String consulta = "DELETE FROM TipoIdentificacion where id=?";

        boolean a = false;
        int b;
        try {
            this.conexion = new Conexion();
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            stmt.setInt(1, Integer.parseInt(doc));
            b = stmt.executeUpdate();
            System.out.println("Numero de operacion= " + b);
            stmt.close();
            this.conexion.close();
            return a;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String args[]) {
        try {
            TipoDocumentoDao t = new TipoDocumentoDao();
            t.eliminar("2");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Hubo un error en el main");
        }
    }
}
