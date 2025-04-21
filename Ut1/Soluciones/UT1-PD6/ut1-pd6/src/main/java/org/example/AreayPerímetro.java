package org.example;

import java.util.Scanner;

public class AreayPerímetro {
    public static void main(String[] args) {
        leerEntradaStdin();
    }

    public static void leerEntradaStdin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área de la circunferencia es: " + area);
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
    }
}
