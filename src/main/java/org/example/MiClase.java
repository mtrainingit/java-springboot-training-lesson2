package org.example;

public class MiClase {

    private int miPrimerAtributo;
    private final int miSegundoAtributo;

    public MiClase() {
        this.miPrimerAtributo = 0;
        this.miSegundoAtributo = 0;
    }

    public void setMiPrimerAtributo(int miPrimerAtributo) {
        if (miPrimerAtributo <= 3) {
            this.miPrimerAtributo = miPrimerAtributo;
        }
    }

    /* public void setMiSegundoAtributo(int miSegundoAtributo) {
        this.miSegundoAtributo = miSegundoAtributo;
    } */

    public MiClase(int miPrimerAtributo, int miSegundoAtributo) {
        if (miPrimerAtributo <= 3) {
            this.miPrimerAtributo = miPrimerAtributo;
        }
        this.miSegundoAtributo = miSegundoAtributo;
    }

    public int getMiPrimerAtributo() {
        return miPrimerAtributo;
    }

    public int getMiSegundoAtributo() {
        return miSegundoAtributo;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "miPrimerAtributo=" + miPrimerAtributo +
                ", miSegundoAtributo=" + miSegundoAtributo +
                '}';
    }
}
