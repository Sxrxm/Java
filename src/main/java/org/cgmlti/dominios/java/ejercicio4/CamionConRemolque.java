package org.cgmlti.dominios.java.ejercicio4;

public class CamionConRemolque extends Vehiculo {

    Integer capacidadCargaExtra;
    String descripcion;

    // crear un metodo que permita calcular el total que la carga maximo soportado
    // en los camiones con remolque
    // declaracion de metodo

    public Integer calcularTotalCarga() {
        Integer totalCarga = capacidadCarga + capacidadCargaExtra;
        return totalCarga;
    }

}
