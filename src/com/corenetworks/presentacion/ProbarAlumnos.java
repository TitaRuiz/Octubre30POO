package com.corenetworks.presentacion;

import com.corenetworks.modelo.Alumno;

public class ProbarAlumnos {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Pepito ",3);
        a1.asignarValores(8,0);
        a1.asignarValores(7,1);
        a1.asignarValores(10,2);
        System.out.println(a1.promedio());
        System.out.println(a1.mostar());

    }
}
