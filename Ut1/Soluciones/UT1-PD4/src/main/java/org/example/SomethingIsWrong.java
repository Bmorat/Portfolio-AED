package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//EJERCICIO #2
//        1) Indica qué es lo que está mal en el siguiente programa:
//public class SomethingIsWrong {
//    public static void main(String[] args) {
//        Rectangle myRect;
//        myRect.width = 40;
//        myRect.height = 50;
//        System.out.println("myRect's area is " + myRect.area());
//    }
//}
//2) Repara el error, ejecuta el programa y verifica que la salida es correcta.


// 1-El error en el programa es que se está utilizando la variable myRect sin haberla inicializado previamente.
// La variable myRect es de tipo Rectangle, pero no se ha creado una instancia de la clase Rectangle antes de
// intentar acceder a sus propiedades (width y height).

// 2-Para corregirlo, hay que crear un  Rectangle antes de asignar valores a sus propiedades.


public class SomethingIsWrong {
    public static void main(String[] args) {
        // Crear una instancia de Rectangle
        Rectangle myRect = new Rectangle();

        // Asignar valores a las propiedades width y height
        myRect.width = 40;
        myRect.height = 50;

        // Calcular y mostrar el área
        System.out.println("myRect's area is " + myRect.area());
    }
}

class Rectangle {
    double width;
    double height;

    // Método para calcular el área
    double area() {
        return width * height;
    }
}

