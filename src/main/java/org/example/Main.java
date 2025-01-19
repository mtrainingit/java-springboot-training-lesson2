package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int add(int a,  int b) {
        return a + b;
    }

    public static int add(int a,  int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        MiClase miObjeto = new MiClase(0, 0);

        // miObjeto.miPrimerAtributo = 4;
        miObjeto.setMiPrimerAtributo(3);

        // miObjeto.miSegundoAtributo = 1;
        // miObjeto.setMiSegundoAtributo(1);

        System.out.println(miObjeto.getMiPrimerAtributo());

        int p = 3;
        int q = 1;
        int o = 1;
        int t = add(p, q, o);

        System.out.println(t);

    }
}
