package Negocio;

import DaoMySQL.*;
import Entidades.*;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

public class Negocio implements Serializable {

    public Negocio() {

    }

    public String registrarTipoIdentificacion(String tipo) {
        try {
            TipoDocumentoDao t = new TipoDocumentoDao();
            if (t.registrarDocumento(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarCondicionFisica(String tipo) {
        try {
            CondicionFisicaDao t = new CondicionFisicaDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarCondicionSocial(String tipo) {
        try {
            CondicionSocialDao t = new CondicionSocialDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarEnfermedad(String tipo) {
        try {
            EnfermedadDao t = new EnfermedadDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarEstadoCivil(String tipo) {
        try {
            EstadoCivilDao t = new EstadoCivilDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarEstadoMujer(String tipo) {
        try {
            EstadoMujerDao t = new EstadoMujerDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarGenero(String tipo) {
        try {
            GeneroDao t = new GeneroDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarNivelEscolar(String tipo) {
        try {
            NivelEscolarDao t = new NivelEscolarDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarParentesco(String tipo) {
        try {
            ParentescoDao t = new ParentescoDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarTipoVivienda(String tipo) {
        try {
            TipoViviendaDao t = new TipoViviendaDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public ArrayList<CondicionFisica> listarCondicionFisica() {
        try {
            CondicionFisicaDao c = new CondicionFisicaDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<CondicionSocial> listarCondicionSocial() {
        try {
            CondicionSocialDao c = new CondicionSocialDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<Enfermedad> listarEnfermedad() {
        try {
            EnfermedadDao c = new EnfermedadDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<EstadoCivil> listarEstadoCivil() {
        try {
            EstadoCivilDao c = new EstadoCivilDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<EstadoMujer> listarEstadoMujer() {
        try {
            EstadoMujerDao c = new EstadoMujerDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<Genero> listarGenero() {
        try {
            GeneroDao c = new GeneroDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<NivelEscolar> listarNivelEscolar() {
        try {
            NivelEscolarDao c = new NivelEscolarDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<Parentesco> listarParentesco() {
        try {
            ParentescoDao c = new ParentescoDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<TipoIdentificacion> listarTipoIdentificacion() {
        try {
            TipoDocumentoDao c = new TipoDocumentoDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<TipoVivienda> listarTipoVivienda() {
        try {
            TipoViviendaDao c = new TipoViviendaDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
