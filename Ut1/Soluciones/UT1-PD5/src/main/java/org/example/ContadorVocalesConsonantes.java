package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
enum TipoCaracter {
    VOCALES, CONSONANTES
}

public class ContadorVocalesConsonantes {
    public static void main(String[] args) {
        String frase = "tres tristes tigres cantaban algo!";
        int vocales = 0;
        int consonantes = 0;

        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                if (esVocal(c)) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }

    private static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
