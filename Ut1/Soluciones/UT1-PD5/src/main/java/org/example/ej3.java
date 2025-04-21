package org.example;

//Ejemplo de uso del método de valores en enum:
enum DíaSemana {
    LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
}


//Para obtener un array con todos los valores del enum:

DíaSemana[] días = DíaSemana.values();
for (DíaSemana día : días) {
        System.out.println(día);
}
