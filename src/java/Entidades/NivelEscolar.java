/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Estudiante
 */
@Entity
@Table(catalog = "ufps_87", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NivelEscolar.findAll", query = "SELECT n FROM NivelEscolar n"),
    @NamedQuery(name = "NivelEscolar.findById", query = "SELECT n FROM NivelEscolar n WHERE n.id = :id"),
    @NamedQuery(name = "NivelEscolar.findByDescripcion", query = "SELECT n FROM NivelEscolar n WHERE n.descripcion = :descripcion"),
    @NamedQuery(name = "NivelEscolar.findByFecha", query = "SELECT n FROM NivelEscolar n WHERE n.fecha = :fecha")})
public class NivelEscolar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Size(max = 255)
    @Column(length = 255)
    private String descripcion;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public NivelEscolar() {
    }

    public NivelEscolar(Integer id) {
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
        if (!(object instanceof NivelEscolar)) {
            return false;
        }
        NivelEscolar other = (NivelEscolar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.NivelEscolar[ id=" + id + " ]";
    }
    
}
