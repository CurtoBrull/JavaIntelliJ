package Strings;

public class StringMetodos {
    public static void main(String[] args) {

        String nombre = "Javier";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toUpperCase());
        System.out.println(nombre + " nombre.equals(\"Javier\") = " + nombre.equals("Javier"));
        System.out.println(nombre + " nombre.equals(\"javier\") = " + nombre.equals("javier"));
        System.out.println("nombre.equalsIgnoreCase(\"JaViEr\") = " + nombre.equalsIgnoreCase("JaViEr"));
        // Orden lexicográfico => si el valor es 0 son iguales
        System.out.println(nombre + " nombre.compareTo(\"Javier\") = " + nombre.compareTo("Javier"));
        System.out.println(nombre + " nombre.compareTo(\"Andrés\") = " + nombre.compareTo("Andrés"));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        // El ultimo de forma dinamica
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        // Desde inclusive (int)
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        // Desde inclusive hasta no inclusive (int, int)
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        // Desde x hasta el ultimo de foma dinamica. Al no ser inclusive podemos usar el .length aunque no es necesario indicar el final
        System.out.println("nombre.substring(2,nombre.length()) = " + nombre.substring(2,nombre.length()));
        // Ultimo caracter de forma dinamica.
        System.out.println("nombre.substring((nombre.length())-1,nombre.length() = " + nombre.substring(nombre.length()-1));
        
        String trabalenguas = "  trabalenguas  ";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.contains(\"aba\") = " + trabalenguas.contains("aba"));
        System.out.println("trabalenguas.startsWith(\"tra\") = " + trabalenguas.startsWith("tra"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println("trabalenguas = " + trabalenguas.trim()); // quitar espacios
        
    }
}
