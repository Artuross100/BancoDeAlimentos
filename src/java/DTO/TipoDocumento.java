
package DTO;

import java.io.Serializable;

public class TipoDocumento implements Serializable{
    
    private int idTipoDoc;
    private String nombreDoc;

    public TipoDocumento(int idTipoDoc, String nombreDoc) {
        this.idTipoDoc = idTipoDoc;
        this.nombreDoc = nombreDoc;
    }

    public TipoDocumento() {
    }

    public int getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(int idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }
    
    
    
}
