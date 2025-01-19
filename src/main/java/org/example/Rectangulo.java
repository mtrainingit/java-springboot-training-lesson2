package org.example;

public class Rectangulo implements Figura {

    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double perimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public double area() {
        return largo * ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                '}';
    }
}
