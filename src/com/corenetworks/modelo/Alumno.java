package com.corenetworks.modelo;

public class Alumno {
    //1. Atributos
    private String nombreAlumno;
    private double[] notas;
    //2. Métodos
    public void asignarValores(double nota, int posicion){
        notas[posicion]= nota;
    }

    public double promedio(){
        //1. Declaración variables
        double suma = 0;
        //2. Estructuras
        for(int i = 0 ; i<notas.length;i++){
            suma = suma + notas[i];
            //suma+= notas[i];
        }
        return suma/notas.length;
    }

    public String mostar(){
        //1. Declarar variables
        String resultado = "";
        //2. Estructuras
        for(int i=0; i<notas.length;i++){
            resultado = resultado + notas[i] +", ";
            //resultado += notas[i];
        }
        return resultado;
    }

    //3. Constructores

    public Alumno(String nombre, int numParciales) {
        nombreAlumno = nombre;
        notas = new double[numParciales];
    }


    //4. Setters y Getters

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
