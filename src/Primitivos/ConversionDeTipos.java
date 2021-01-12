package Primitivos;

public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";

        int enteroInt = Integer.parseInt(numeroStr);
        System.out.println("enteroInt = " + enteroInt);

        String realStr = "8787.43e-2";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStrFalse = "1";
        String logicoStrTrue = "TrUe";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStrFalse);
        boolean logicoBooleanTrue = Boolean.parseBoolean(logicoStrTrue);
        System.out.println("logicoBoolean = " + logicoStrFalse + " = "+ logicoBoolean);
        System.out.println("logicoStrTrue = " + logicoStrTrue + " = "+ logicoBooleanTrue);

        int otroNumInt = 500;

        System.out.println("otroNumInt = " + otroNumInt);

        String otroNumStr = Integer.toString(otroNumInt);
        System.out.println("otroNumStr = " + otroNumStr);

        otroNumStr = String.valueOf(otroNumInt);
        System.out.println("otroNumStr = " + otroNumStr);

        Double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 1000;
        // casting
        short s = (short) i;
        long l = i;
        System.out.println("s = " + s);
        System.out.println("l = " + l);
        char c = (char) i;
        System.out.println("c = " + c);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
