package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int add(int a,  int b) { // función sobrecargada
        return a + b;
    }

    public static int add(int a,  int b, int c) { // función sobrecargada
        return a + b + c;
    }

    public static void main(String[] args) {

        MiClase miObjeto = new MiClase(0, 0); // una instancia

        // miObjeto.miPrimerAtributo = 4; // acceso con el operador punto no es posible para un miembro privado de la instancia
        miObjeto.setMiPrimerAtributo(3); // acceso utilizando la función setter de la instancia

        // miObjeto.miSegundoAtributo = 1;
        // miObjeto.setMiSegundoAtributo(1); // acceso con la función setter quitado declarando el miembro final

        System.out.println(miObjeto.getMiPrimerAtributo()); // acceso con la función getter de la instancia

        int p = 3;  // ejemplo de sobrecarga de función
        int q = 1;
        int o = 1;
        int t = add(p, q, o);

        System.out.println(t);

    }
}
