package Wrapper;

public class wrapperBoolean {
	public static void main(String[] args) {

		Integer num1, num2;
		// Implícita
		num1 = 1;
		// Explícita
		num2 = Integer.valueOf(2);

		boolean primBoolean = num1 > num2; // false
		Boolean objetoBoolean = Boolean.valueOf(primBoolean); // Autoboxing => Boolean objetoBoolean = primBoolean;
		Boolean objetoBoolean2 = Boolean.valueOf("false");
		Boolean objetoBoolean3 = false;

		System.out.println("primBoolean = " + primBoolean);
		System.out.println("objetoBoolean = " + objetoBoolean);
		System.out.println("objetoBoolean2 = " + objetoBoolean2);

		// No se comporta igual que los enteros al comparar
		System.out.println("Comparando 2 objetos boolean: " + (objetoBoolean == objetoBoolean2));
		System.out.println("Comparando 2 objetos boolean: " + (objetoBoolean.equals(objetoBoolean2)));
		System.out.println("Comparando 2 objetos boolean: " + (objetoBoolean == objetoBoolean3));
		System.out.println("Comparando 2 objetos boolean: " + (objetoBoolean2 == objetoBoolean3));
		
		// Obtener primitivo: (unboxing)
		boolean primBoolean2 = objetoBoolean2.booleanValue();
		System.out.println("primBoolean2 = " + primBoolean2);

	}
}
