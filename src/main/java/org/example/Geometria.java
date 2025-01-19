package org.example;

public class Geometria {

    public static double PI = 3.1415926535;

    public static double distance(Punto p, Punto q) {
        return Math.sqrt(Math.pow(p.getX() - q.getX(), 2) + Math.pow(p.getY() - q.getY(), 2));
    }
}
