package Contoller;

import Entidades.CondicionFisica;
import java.util.ArrayList;

public class Prueba {

    public static void main(String args[]) {
        Controlador c = new Controlador();
//        c.registrarCondicionFisica("Condicion fisica 4");
//        c.registrarCondicionSocial("Condicion social 3");
//        c.registrarEnfermedad("Enfermedad 3");
//        c.registrarEstadoCivil("Estado Civil 3");
//        c.registrarEstadoMujer("Estado mujer 3");
//        c.registrarGenero("Genero 3");
//        c.registrarNivelEscolar("Nivel escolar 3");
//        c.registrarParentesco("parentesco 3");
//        c.registrarTipoIdentificacion("Tipo identificacion 3");
//        c.registrarTipoVivienda("Tipo Vivienda 3");

        ArrayList<CondicionFisica> con = c.listarCondicionFisica();
        for (CondicionFisica fis : con) {
            System.out.println(fis.getDescripcion());
        }
    }

}
