package org.cgmlti.dominios.java.ejercicio2;

public class PruebaEjercicio2 {

    public static void main(String[] args) {

        // crear 2 instancias de cada Entidad
        // Instanciar 2 veces cada Entidad
        // crear dos objetos de cada Entidad
        // 1. Nombre de la clases a Instanciar
        // 2. nombre del objeto(identificador)
        // 3. operador de asignacion
        // 4. palabra (referencia) new
        // 5. otra vez, el nombre de la clase
        // 6. parentesis(Constructor)
        Hospital hospital1 = new Hospital();
        Hospital hospital2 = new Hospital();

        // acceder a los atributos del objeto:
        // operador .
        // 1. identificador del objeto
        // 2. el punto
        // 3. el atributo a trabajar
        // 4. el operador de asignacion
        // 5. el valor a asignar al atributo
        hospital1.direccion = "caracas con 52";
        hospital2.nombre = "Sara";
        hospital2.telefono = 123456789L;

        // crear 3 Medicos:
        Medico medico1 = new Medico();
        medico1.nombre = "Carlos Rodriguez";
        medico1.cedula = 23456L;
        medico1.especialidad = "Cardiología";

        Medico medico2 = new Medico();
        medico2.cedula = 456789L;
        medico2.especialidad = "Pediatria";
        medico2.nombre = "Yuyeimy Bohorquez";

        Medico medico3 = new Medico();
        medico3.nombre = "Sandra Romero";
        medico3.cedula = 87654L;
        medico3.especialidad = "Optometria";

        // Añadir Medicos al hospital
        hospital1.listaMedicos.add(medico1);
        hospital1.listaMedicos.add(medico2);
        hospital1.listaMedicos.add(medico3);

        // recorrer la lista de Medicos
        // del Hospital 1;

        for (Medico medicoRecorrer : hospital1.listaMedicos) {
            System.out.println("Médico: " + medicoRecorrer.nombre);
            System.out.println("Especialidad del médico: " + medicoRecorrer.especialidad);
            System.out.println("Cédula del médico: " + medicoRecorrer.cedula);
        }
        // crear 2 salas
        SalaHospital sala1 = new SalaHospital();
        sala1.numero = 502;
        sala1.cantidadCamas = 5;

        SalaHospital sala2 = new SalaHospital();
        sala2.numero = 503;
        sala2.cantidadCamas = 5;
        hospital1.listaSala.add(sala1);
        hospital1.listaSala.add(sala2);

        for (SalaHospital salaRecorrer : hospital1.listaSala) {
            System.out.println("Sala: " + salaRecorrer.numero);
            System.out.println("Cantidad de camas en Sala: " + salaRecorrer.cantidadCamas);
        }

    }
}
