package org.cgmlti.dominios.java.paises;

public class Prueba5 {
    public static void main(String[] args) {

        Ciudad ciudad1 = new Ciudad("Bogotá");

        Ciudad ciudad2 = new Ciudad("Medellin");

        Ciudad ciudad3 = new Ciudad("Barranquilla");

        Ruta ruta1 = new Ruta(26);

        Pais pais1 = new Pais("Colombia");

        pais1.listaCiudades.add(ciudad1);
        pais1.listaCiudades.add(ciudad2);
        pais1.listaCiudades.add(ciudad3);

        for (Ciudad ciudadRecorrer : pais1.listaCiudades) {
            System.out
                    .println("Cuidad: " + ciudadRecorrer.nombre + " País: " + pais1.nombre + " Ruta: " + ruta1.numero);
        }

    }

}
