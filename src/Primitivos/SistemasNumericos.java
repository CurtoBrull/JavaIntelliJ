package Primitivos;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog(null, "Ingrese numero entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        // anteponer 0b para indicar que es numero binario
        // int numBin = 0b110010;

        String binarioString = Integer.toBinaryString(numeroDecimal);
        String messageBinario = "numero Binario de " + numeroDecimal + " = " + binarioString;
        System.out.println(messageBinario);

        // Anteponer 0 al numero para indicar que es un octal
        // int numOctal = 0543;

        String octalString = Integer.toOctalString(numeroDecimal);
        String messageOctal = "numero Octal de " + numeroDecimal + " = " + octalString;
        System.out.println(messageOctal);

        // Anteponer 0x para definir un hexadecimal
        // int numHex = 0x4f3;

        String hexString = Integer.toHexString(numeroDecimal);
        String messageHexadecimal = "numero Hexadecimal de " + numeroDecimal + " = " + hexString;
        System.out.println(messageHexadecimal);

        String message = messageHexadecimal;
        message += "\n" + messageOctal;
        message += "\n" + messageBinario;
        JOptionPane.showMessageDialog(null, message);
    }
}
