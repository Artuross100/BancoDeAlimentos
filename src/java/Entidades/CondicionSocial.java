
package Entidades;

import java.io.Serializable;
import java.util.Date;
public class CondicionSocial implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String descripcion;
    private Date fecha;

    public CondicionSocial() {
    }

    public CondicionSocial(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CondicionSocial)) {
            return false;
        }
        CondicionSocial other = (CondicionSocial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CondicionSocial[ id=" + id + " ]";
    }
    
}
