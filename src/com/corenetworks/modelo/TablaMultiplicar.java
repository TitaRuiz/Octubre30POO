package com.corenetworks.modelo;

public class TablaMultiplicar {
    //1. Atributos
    private int tabla;
    //2. Métodos
    public String tablasMultiplicar(){
        String resultado = "";
        for(int i=1; i<=10; i++){
           resultado += tabla + " x " + i + " = " + (tabla*i)+ "\n";
        }
        return resultado;
    }
    //3. Constructores

    public TablaMultiplicar() {
    }

    public TablaMultiplicar(int tabla) {
        this.tabla = tabla;
    }
//4. Setters y Getters

    public int getTabla() {
        return tabla;
    }

    public void setTabla(int tabla) {
        this.tabla = tabla;
    }
}
