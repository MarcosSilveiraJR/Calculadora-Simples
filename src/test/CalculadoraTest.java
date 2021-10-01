package test;

import main.java.Calculadora;

public class CalculadoraTest {

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


}
