package org.example;

public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        NumberHolder holder = new NumberHolder();
        holder.anInt = 42;
        holder.aFloat = 3.14f;

        System.out.println("Valor de anInt: " + holder.anInt);
        System.out.println("Valor de aFloat: " + holder.aFloat);
    }
}
//En código esta creando dos cosas:

//Primero, una lista de nombres de estudiantes que tiene 10 espacios. Y después,
//una variable llamada studentName con el nombre “Peter Parker”.

//Luego, lo que hago es tomar ese nombre de estudiante y lo pongo en el primer espacio de la lista
// de estudiantes, o sea que digo que el primer espacio de la lista (students[0]) apunte al nombre
// del estudiante (students[0] = studentName;). Después de hacer
// esta asignación, la variable studentName queda en null. O sea que ya no apunta a nada.

//Entonces, al final del código, lo que queda son dos cosas a las que se hace referencia:

//La lista de estudiantes.
//El nombre de estudiante “Peter Parker”.

//Pero, el que se podría eliminar tranquilo por el garbage collector es el nombre “Peter Parker”,
// porque después de poner la variable studentName en null, ya no hay ninguna referencia que apunte a él.

//Para destruir un objeto, hay que dejar de referenciarlo.