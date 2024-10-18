package com.mycompany.figurageometrica;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;

    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    public double obtenerPerimetro() {
        return (Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2))) + altura + base;
    }

}
