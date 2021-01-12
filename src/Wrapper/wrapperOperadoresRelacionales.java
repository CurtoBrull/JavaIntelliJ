package Wrapper;

public class wrapperOperadoresRelacionales {
	public static void main(String[] args) {

		Integer num1 = 1280;
		Integer num2 = num1;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		System.out.println("Son el mismo objeto? " + (num1 == num2));

		num2 = 1280;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		System.out.println("Son el mismo objeto? " + (num1 == num2));

		// Hasta 127 o menor compara por valor y no por instancia
		System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));
		System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

		num2 = 200;
		boolean condicion = num1 > num2;
		System.out.println("condicion = " + condicion);

		// Lo mismo que lo anterior de forma explícita
		boolean condicion2 = num1.intValue() < num2.intValue();
		System.out.println("condicion2 = " + condicion2);
	}
}
