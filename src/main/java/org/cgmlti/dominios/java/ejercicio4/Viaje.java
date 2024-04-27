package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDate;
import java.time.Period;

public class Viaje {

    LocalDate fechaInicio;
    LocalDate fechaFin;

    // crear un metodo que imprima la duraccion del viaje
    // dada la fecha de inicio y fin ingresadas como inputs

    public void calcularDuracionViaje(
            LocalDate fechaInicio,
            LocalDate fechaFin) {
        // asignar las fecha parametro a los atributos del viaje
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        Period diferencia = Period.between(fechaInicio, fechaFin);

        System.out.println("duracion del viaje: " + diferencia.getDays() + " días");

    }

    // sobrecarga del metodo calcularDuracion:
    public int calcularDuracionViaje() {
        Period diferencia = Period.between(fechaInicio, fechaFin);
        return diferencia.getDays();

    }

}
