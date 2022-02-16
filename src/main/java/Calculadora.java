package main.java;

public class Calculadora {

    private Double a;
    private Double b;

    public Calculadora() { }

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double soma(double a, double b) {
        return (a + b);
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {

        return a / b;
    }

    public static double raizQuadrada(double a) {
        return Math.sqrt(a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double formulaBhaskara(double a, double b, double c) {
        var delta = (b * b) + (-4 * a * c);
        var deltaFinal = Math.sqrt(delta);
        var dividendo = 2 * a;

        var x1 = ((b * -1) + deltaFinal) / dividendo;
        var x2 = ((b * -1) - deltaFinal) / dividendo;

        return x1 + x2;
    }

}
