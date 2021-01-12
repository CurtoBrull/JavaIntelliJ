package Primitivos;

public class PrimitivosNum {
    public static void main(String[] args) {

        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en bytes a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits a: " + Byte.SIZE);
        System.out.println("Tipo byte máximo corresponde a: " + Byte.MAX_VALUE);
        System.out.println("Tipo byte mínimo corresponde a: " + Byte.MIN_VALUE);

        System.out.println();

        short numeroShort = 137;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en bytes a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bits a: " + Short.SIZE);
        System.out.println("Tipo short máximo corresponde a: " + Short.MAX_VALUE);
        System.out.println("Tipo short mínimo corresponde a: " + Short.MIN_VALUE);

        System.out.println();

        int numeroInt = 137;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bits a: " + Integer.SIZE);
        System.out.println("Tipo int máximo corresponde a: " + Integer.MAX_VALUE);
        System.out.println("Tipo int mínimo corresponde a: " + Integer.MIN_VALUE);

        System.out.println();

//        Long, Float, Double hay que especificarlo en la variable con la letra correspondiente

        Long numeroLong = 23232323232L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo Long corresponde en bytes a: " + Long.BYTES);
        System.out.println("Tipo Long corresponde en bits a: " + Long.SIZE);
        System.out.println("Tipo Long máximo corresponde a: " + Long.MAX_VALUE);
        System.out.println("Tipo Long mínimo corresponde a: " + Long.MIN_VALUE);

        System.out.println();

        Float numeroFloat = 0.00000000015F;//1.5e-10F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Tipo Float corresponde en bytes a: " + Float.BYTES);
        System.out.println("Tipo Float corresponde en bits a: " + Float.SIZE);
        System.out.println("Tipo Float máximo corresponde a: " + Float.MAX_VALUE);
        System.out.println("Tipo Float mínimo corresponde a: " + Float.MIN_VALUE);

        System.out.println();

        Double numeroDouble = 686876D;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Tipo Double corresponde en bytes a: " + Double.BYTES);
        System.out.println("Tipo Double corresponde en bits a: " + Double.SIZE);
        System.out.println("Tipo Double máximo corresponde a: " + Double.MAX_VALUE);
        System.out.println("Tipo Double mínimo corresponde a: " + Double.MIN_VALUE);

    }
}