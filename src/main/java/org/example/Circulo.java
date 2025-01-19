package org.example;

public class Circulo extends Figura {

    private double radio;

    public Circulo(Punto punto, double radio) {
        super(punto);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 2 * Geometria.PI * radio;
    }

    @Override
    public double area() {
        return 3.14 * Geometria.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
