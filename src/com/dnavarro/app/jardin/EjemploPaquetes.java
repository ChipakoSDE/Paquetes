package com.dnavarro.app.jardin;

import com.dnavarro.app.hogar.ColorPelo;
import com.dnavarro.app.hogar.*;

// importo de forma estatica el metodo para poder utilizarlo sin llamar a la clase Persona
// import static com.dnavarro.app.hogar.Persona.saludar;
// importo de forma estatica la constante para poder utilizarla sin llamar a la clase Persona
// import static com.dnavarro.app.hogar.Persona.GENERO_MASCULINO;
// puedo hacerlo más fácil agregando todos los miembros estáticos de la clase Persona con el .* al final

import static com.dnavarro.app.hogar.Persona.*;
import static com.dnavarro.app.hogar.ColorPelo.*;

import static com.dnavarro.app.hogar.Persona.GENERO_FEMENINO;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Joroba");
        p.setApellido("Dito");
        p.setColorPelo(COLORADO);
        System.out.println(p.getApellido() + ", " + p.getNombre());

        Perro can = new Perro();
        can.nombre = "Huesos";
        can.raza = "Callejero";

        String jugando = can.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String genero = GENERO_MASCULINO;
        System.out.println("genero = " + genero);

    }
}
