package com.corenetworks.presentacion;


import com.corenetworks.modelo.TablaMultiplicar;

public class ProbarTablaMultiplica {
    public static void main(String[] args) {
        //Constructor vacio
        TablaMultiplicar t1 = new TablaMultiplicar();
        t1.setTabla(3);
        System.out.println(t1.tablasMultiplicar());

        //Constructor completo
        TablaMultiplicar t2 = new TablaMultiplicar(5);
        System.out.println(t2.tablasMultiplicar());

    }
}
