package org.cgmlti.dominios.java.paises;

import java.util.List;
import java.util.ArrayList;

public class Pais {
    String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;

    }

    List<Ciudad> listaCiudades = new ArrayList<Ciudad>();
}
