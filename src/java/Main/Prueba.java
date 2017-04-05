package Main;

import Entidades.TipoIdentificacion;
import JPA.EntityMan;
import JPA.TipoIdentificacionJpaController;

public class Prueba {
    
    public static void main(String args[]){
        try {
            TipoIdentificacionJpaController t = new TipoIdentificacionJpaController(null, EntityMan.getInstance());
            TipoIdentificacion tipo = new TipoIdentificacion();
            tipo.setDescripcion("Tarjeta de identidad");
            t.create(tipo);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
