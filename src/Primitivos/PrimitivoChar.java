package Primitivos;

public class PrimitivoChar {
    public static void main(String[] args) {
        // Un solo caracter
        char caracter = 'A';
        System.out.println("caracter = " + caracter);
        char caracterUnicode = '\u264B';
        System.out.println("caracterUnicode = " + caracterUnicode);
        char decimal = 9895;
        System.out.println("decimal = " + decimal);
        char symbol = '#';
        System.out.println("symbol = " + symbol);

        System.out.println("Tipo char corresponde en bytes a: " + Character.BYTES);
        System.out.println("Tipo char corresponde en bits a: " + Character.SIZE);
        System.out.println("Tipo char máximo corresponde a: " + Character.MAX_VALUE);
        System.out.println("Tipo char mínimo corresponde a: " + Character.MIN_VALUE);
        System.out.println();

        // Especiales
        char retroceso = '\b';
        System.out.println("retroceso borra un caracter = 12344" + retroceso);
        char tabulador = '\t';
        System.out.println("tabulador = " + tabulador + " después de tabular");
        char nuevaLinea = '\n';
        System.out.println("nuevaLinea = " + nuevaLinea + "nueva linea");
        char retornoCarro = '\r';
        System.out.println("retornoCarro = " + retornoCarro + "retorno carro");
    }
}
