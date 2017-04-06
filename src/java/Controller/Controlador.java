package Controller;

import Entidades.CondicionFisica;
import Entidades.CondicionSocial;
import Entidades.Enfermedad;
import Entidades.EstadoCivil;
import Entidades.EstadoMujer;
import Entidades.Genero;
import Entidades.NivelEscolar;
import Entidades.Parentesco;
import Entidades.TipoIdentificacion;
import Entidades.TipoVivienda;
import Negocio.Negocio;
import java.util.ArrayList;

public class Controlador {

    private Negocio negocio;

    public Controlador() {
        this.negocio = new Negocio();
    }

    public String registrarTipoIdentificacion(String tipo) {
        return this.negocio.registrarTipoIdentificacion(tipo);
    }

    public String registrarCondicionFisica(String tipo) {
        return this.negocio.registrarCondicionFisica(tipo);
    }

    public String registrarCondicionSocial(String tipo) {
        return this.negocio.registrarCondicionSocial(tipo);
    }

    public String registrarEnfermedad(String tipo) {
        return this.negocio.registrarEnfermedad(tipo);
    }

    public String registrarEstadoCivil(String tipo) {
        return this.negocio.registrarEstadoCivil(tipo);
    }

    public String registrarEstadoMujer(String tipo) {
        return this.negocio.registrarEstadoMujer(tipo);
    }

    public String registrarGenero(String tipo) {
        return this.negocio.registrarGenero(tipo);
    }

    public String registrarNivelEscolar(String tipo) {
        return this.negocio.registrarNivelEscolar(tipo);
    }

    public String registrarParentesco(String tipo) {
        return this.negocio.registrarParentesco(tipo);
    }

    public String registrarTipoVivienda(String tipo) {
        return this.negocio.registrarTipoVivienda(tipo);
    }

    public ArrayList<CondicionFisica> listarCondicionFisica() {
        return this.negocio.listarCondicionFisica();
    }

    public ArrayList<CondicionSocial> listarCondicionSocial() {
        return this.negocio.listarCondicionSocial();
    }

    public ArrayList<Enfermedad> listarEnfermedad() {
        return this.negocio.listarEnfermedad();
    }

    public ArrayList<EstadoCivil> listarEstadoCivil() {
        return this.negocio.listarEstadoCivil();
    }

    public ArrayList<EstadoMujer> listarEstadoMujer() {
        return this.negocio.listarEstadoMujer();
    }

    public ArrayList<Genero> listarGenero() {
        return this.negocio.listarGenero();
    }

    public ArrayList<NivelEscolar> listarNivelEscolar() {
        return this.negocio.listarNivelEscolar();
    }

    public ArrayList<Parentesco> listarParentesco() {
        return this.negocio.listarParentesco();
    }

    public ArrayList<TipoIdentificacion> listarTipoIdentificacion() {
        return this.negocio.listarTipoIdentificacion();
    }

    public ArrayList<TipoVivienda> listarTipoVivienda() {
        return this.negocio.listarTipoVivienda();
    }
}
