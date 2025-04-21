package org.example;

public class Multsuma {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;

        double resultado = multsuma(a, b, c);

        System.out.println("El resultado de a*b + c es: " + resultado);
    }

    public static double multsuma(double a, double b, double c) {
        return a * b + c;
    }
}


