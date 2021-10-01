package test;

import main.java.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        var soma = calculadora.soma(5.1, 8.2);

        System.out.println(soma);

        double subtracao = calculadora.subtracao(8.5, 7.6);

        System.out.println(subtracao);

        double multiplicacao = calculadora.multiplicacao(3.6, 4.9);

        System.out.println(multiplicacao);

        double divisao = calculadora.divisao(8.6, 4.5);

        System.out.println(divisao);

    }

    @Test
    void deveCalcularARaizQuadrada() {

        double raiz = 9;

        var valorEsperado = 3;

        var resultado = Calculadora.raizQuadrada(raiz);


        System.out.println("A raiz quadrada de " + raiz + " é igual a " + valorEsperado);
        assertEquals(valorEsperado, resultado);
    }

    @Test
    void deveSomarCorretamente() {

        var a = 10;
        var b = 5;

        var resultado = calculadora.soma(a, b);
        var valorEsperado = a + b;
        assertEquals(valorEsperado, resultado);
        System.out.println("O valor esperado é " + resultado);
    }

    @Test
    void deveSubtrair() {
        var a = 8;
        var b = 3;

        var resultado = calculadora.subtracao(a, b);
        var valorEsperado = a - b;
        assertEquals(valorEsperado, resultado);
        System.out.println(resultado);

    }

    @Test

    void deveMultiplicar() {

        var a = 2;
        var b = 3;

        var resultado = calculadora.multiplicacao(a, b);
        var valorEsperado = 6;

        assertEquals(valorEsperado, resultado);
        System.out.println(resultado);


    }

    @Test

    void DeveDividir () {

        var a = 10;
        var b = 5;

        var resultado = calculadora.divisao(a, b);
        var resultadoEsperado = a / b;
        assertEquals(resultadoEsperado, resultado);
        System.out.println(resultado);
    }
}
