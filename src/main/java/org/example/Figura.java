package org.example;

public abstract class Figura {

    private Punto punto;

    public Figura(Punto punto) {
        this.punto = punto;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public abstract double perimetro();

    public abstract double area();
}
