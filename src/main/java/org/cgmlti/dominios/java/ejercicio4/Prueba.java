package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDate;

public class Prueba {

    public static void main(String[] args) {

        // Crear una instancia de vehiculo:
        Vehiculo vehiculo1 = new Vehiculo(2435L, true, 45);

        // crear un viaje
        Viaje v = new Viaje();

        // invocacion: llamado ejecicion, utilizacion
        v.calcularDuracionViaje(LocalDate.of(2024, 4, 26), LocalDate.of(2024, 4, 30));

        // invocacion de la sobrecarga:
        System.out.println("duracion de dias del viaje: " + v.calcularDuracionViaje());

        // instanciar un ejemplar
        // de cada tipo de vehiculo

        Camion c1 = new Camion();
        c1.estaDisponible = true;
        // establecer el viaje del csmion:
        c1.elTalViajeQueHizoElCamion = v;

        CamionConRemolque cr1 = new CamionConRemolque();
        cr1.capacidadCargaExtra = 9;
        cr1.capacidadCarga = 10;

        // invocar el metodo creado

        // Integer totalCarga = cr1.calcularTotalCarga();
        System.out.println("total Carga: " + cr1.calcularTotalCarga());

        System.out.println("el viaje del camion" + "tiene fecha de inicio:" + c1.elTalViajeQueHizoElCamion.fechaInicio);
        System.out.println("el viaje del camion" + " tiene fecha de fin:" + c1.elTalViajeQueHizoElCamion.fechaFin);
    }
}
