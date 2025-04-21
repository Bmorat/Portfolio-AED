package org.example;

//EJERCICIO #5 Conversión de números en strings
//http://docs.oracle.com/javase/tutorial/java/data/converting.html
//Dado el siguiente código:
public class ToStringDemo {
    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);
        int dot = s.indexOf('.');
        System.out.println(dot + " digits " +
                "before decimal point.");
        System.out.println( (s.length() - dot - 1) +
                " digits after decimal point.");
    }
}
//1) Indicar cuál es la salida obtenida al ejecutarlo.
//        2) Indicar por qué se imprime cada uno de los datos y la razón de su forma

//1-3 digits before decimal point.
//        2 digits after decimal point.

//2- Primero, declaro una variable "d" de tipo double con el valor 888.51.
//
//Luego, convierto este valor "d" a una cadena utilizando Double.toString(d),
// lo que me da la cadena "888.51".
//
//A continuación, encuentro la posición del punto decimal en la cadena utilizando s.indexOf('.').
// En este caso, el punto decimal está en la posición 3 (contando desde 0).
//
//Al final imprimo el número de dígitos antes y después del punto decimal.
// Hay 3 dígitos antes del punto y 2 dígitos después del punto.