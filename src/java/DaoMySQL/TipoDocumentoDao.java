package DaoMySQL;

import DTO.TipoDocumento;
import Util.Conexion;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoDocumentoDao implements Serializable {

    private Conexion conexion;

    public TipoDocumentoDao() throws SQLException {
        this.conexion = new Conexion();
    }

//    @Override
    public ArrayList<TipoDocumento> cargarTiposDocumento() {
        ArrayList<TipoDocumento> tipos = new ArrayList<TipoDocumento>();
        String consulta = "SELECT * FROM TipoIdentificacion";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TipoDocumento t = new TipoDocumento(rs.getInt("id"), rs.getString("descripcion"));
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

//    @Override
    public TipoDocumento dtoTipoDocumento(int idDocumento) {
        TipoDocumento tipo=null;
        String consulta= "SELECT * FROM TipoDocumento where idTipoDocumento =?";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            stmt.setInt(1, idDocumento);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                tipo = new TipoDocumento(rs.getInt("id"),rs.getString("descripcion"));
            }
            rs.close();
            stmt.close();
            this.conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
       
        return tipo;
    }
    
    
//    public TipoDocumento buscarDocumento(int tipo) {
//        TipoDocumento t= null;
//        String consulta= "SELECT idTipoDocumento, nombre "
//                + "FROM TipoDocumento "
//                + "WHERE idTipoDocumento=?";
//        try {
//            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
//            stmt.setInt(1, tipo);
//            ResultSet rs = stmt.executeQuery();
//            while(rs.next()){
//                t = new TipoDocumento(rs.getInt(1),rs.getString(2));
//            }
//            rs.close();
//            stmt.close();
//            this.conexion.close();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return t;
//    }
//    
    public boolean registrarDocumento(String nombre) {
        String consulta = "INSERT INTO TipoIdentificacion (descripcion) VALUES(?)";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            stmt.setString(1, nombre);
            int x = stmt.executeUpdate();
            System.out.println("Operacion: " + x);
            stmt.close();
            this.conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return false;
    }
//
//    @Override
//    public boolean documentoEditar(int idTipo, String nombre) {
//        String consulta = "update TipoDocumento set nombre=? where idTipoDocumento=? ";
//        boolean b = true;
//        try{
//            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
//            stmt.setString(1,nombre);
//            stmt.setInt(2, idTipo);
//            b = stmt.execute();
//            stmt.close();
//            this.conexion.close();
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }
//        return b;
//    }
//    
//

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
