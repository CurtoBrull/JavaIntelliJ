package Wrapper;

import java.lang.reflect.Method;

public class metodoGetClass {
	public static void main(String[] args) {
		String texto = "Hola que tal";
		
		Class strClass = texto.getClass();

		System.out.println("strClass.getName() = " + strClass.getName());
		System.out.println("strClass.getName() = " + strClass.getSimpleName());
		System.out.println("strClass.getName() = " + strClass.getPackage());
		System.out.println("strClass.getName() = " + strClass.getPackageName());
		System.out.println("strClass.getName() = " + strClass);

		// Imprime todos los metodos de la clase String
		for (Method metodo : strClass.getMethods()) {
			System.out.println("metodo.getName() = " + metodo.getName());
		}

		System.out.println();
		System.out.println("----");
		System.out.println();

		Integer num = 34;
		Class intClass = num.getClass();
		System.out.println("intClass = " + intClass);
		System.out.println("intClass = " + intClass.getName());
		System.out.println("intClass = " + intClass.getSimpleName());
		System.out.println("intClass = " + intClass.getPackageName());
		System.out.println("intClass = " + intClass.getSuperclass().getSuperclass());

		// Metodos de la clase Integer
		for (Method metodo:intClass.getMethods()) {
			System.out.println("metodo.getName() = " + metodo.getName());
		}
		System.out.println();
		System.out.println("----");
		System.out.println();

		// Metodos de la clase Object
		Class objClass = intClass.getSuperclass().getSuperclass();
		for (Method metodo:objClass.getMethods()) {
			System.out.println("metodo.getName() = " + metodo.getName());
		}
	}
}
