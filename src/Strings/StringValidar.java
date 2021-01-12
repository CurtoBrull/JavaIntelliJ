package Strings;

import javax.swing.*;
import java.util.Locale;

public class StringValidar {
    public static void main(String[] args) {

        String curso = null;
        String curso2 = " desde 0.";

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo); // true

        try {
            System.out.println(curso.toUpperCase());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error, valor nulo.");
        }

        // Da error cualquier método que use un valor null
        if (!esNulo){
            System.out.println(curso.toUpperCase());
        }
        // Da error cualquier método que use un valor null
        if (!esNulo){
            System.out.println(curso.concat(curso2));
        }

        // Concatenando no da error
        System.out.println("El valor de la variable curso es: " + curso);

        if (esNulo){
            curso = "Programación Java con IntelliJ";
        }

        System.out.println("El valor de la variable curso es: " + curso);
        System.out.println(curso.toUpperCase());
        System.out.println(curso.toUpperCase().concat(curso2.toUpperCase()));

        String esVacio = "";
        System.out.println("esVacio.length() = " + esVacio.length()); //0
        boolean esVacio2 = esVacio.isEmpty();

        System.out.println("esVacio2 = " + esVacio2); // true

        // Un espacio no es empty pero sí es blank
        String espacio = " ";
        boolean esBlanco = espacio.isBlank();
        System.out.println("esBlanco = " + esBlanco); // true
        boolean esBlanco2 = espacio.isEmpty();
        System.out.println("esBlanco2 = " + esBlanco2); // false
    }
}
