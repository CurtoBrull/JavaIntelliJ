package Wrapper;

public class wrapperInteger {
	public static void main(String[] args) {

		// Convertir literal entera en un objeto de la clase Integer
		int intPrimitivo = 2768;
		Integer intObjeto = Integer.valueOf(intPrimitivo); // Boxing
		Integer intObjeto2 = intPrimitivo; // AutoBoxing
		System.out.println("intObjeto = " + intObjeto);
		
		// Inverso
		int num = intObjeto;
		System.out.println("num = " + num);
		int num2 = intObjeto.intValue();
		System.out.println("num2 = " + num2);
		
		// Convertir de String a Integer
		String valorTvLcd = "6200";
		Integer valor = Integer.valueOf(valorTvLcd);
		System.out.println("valor = " + valor);
		
		// Convertir de Short a Integer
		Short shortObjeto = intObjeto.shortValue();
		System.out.println("shortObjeto = " + shortObjeto);
		
		// Convertir (con perdida al ser de mayor a menor capacidad)
		Byte byteObjeto = intObjeto.byteValue();
		System.out.println("byteObjeto = " + byteObjeto);
		
		// Convertir Long
		Long objetoLong = intObjeto.longValue();
		System.out.println("objetoLong = " + objetoLong);

	}
}
