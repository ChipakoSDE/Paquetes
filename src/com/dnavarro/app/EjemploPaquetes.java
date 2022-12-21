package com.dnavarro.app;

import com.dnavarro.app.hogar.Persona;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Joroba";
        p.apellido = "Dito";
        System.out.println(p.nombre);

        Perro can = new Perro();
        can.nombre = "Huesos";
        can.raza = "Callejero";

    }
}
