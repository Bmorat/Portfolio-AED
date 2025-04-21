package org.example;

import java.io.*;
import java.nio.file.*;

public class EntradaDatos {
    public static void main(String[] args) {
        leerEntradaArchivo("entrada.txt");
    }
    public static void leerEntradaArchivo(String rutaArchivo) {
        try {
            Path path = Paths.get(rutaArchivo);
            BufferedReader br = Files.newBufferedReader(path);

            int entero = Integer.parseInt(br.readLine());
            double flotante = Double.parseDouble(br.readLine());
            String cadena = br.readLine();

            System.out.println("El entero leído es: " + entero);
            System.out.println("El número de punto flotante es: " + flotante);
            System.out.println("La cadena leída es \"" + cadena + "\"");
            System.out.println("¡Hola " + cadena + "! La suma de " + entero + " y " + flotante + " es " + (entero + flotante) + ".");
            System.out.println("La división entera de " + flotante + " y " + entero + " es " + (int)(flotante / entero) + " y su resto es " + (flotante % entero) + ".");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
