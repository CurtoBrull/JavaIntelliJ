package Strings;

public class StringMetodosArreglos {
	public static void main(String[] args) {

		String trabalenguas = "trabalenguas";

		System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

		char[] arreglo = trabalenguas.toCharArray();
		int largoArreglo = trabalenguas.length();
		System.out.println("largoArreglo = " + largoArreglo);

		for (int i = 0; i < largoArreglo; i++) {
			System.out.println("arreglo[" + i + "] = " + arreglo[i]);
		}

		System.out.println("trabalenguas = " + trabalenguas.split("a"));

		// Split separa el string en valores dentro del array cada vez que encuentra el valor indicado
		String[] arreglo2 = trabalenguas.split("a");
		int largoArreglo2 = arreglo2.length;

		for (int i = 0; i < largoArreglo2; i++) {
			System.out.println(arreglo2[i]);
		}

		String archivo = "alguna.imagen.pdf";
		// El . no funcionaría ya que forma parte de las palabras reservadas de las expresiones regulares
		// Hay que escapar el caracter o ponerlo entre [.]
		String archivoArr[] = archivo.split("\\.");
		int l = archivoArr.length;
		for (int i = 0; i < l; i++) {
			System.out.println(archivoArr[i]);
		}
		int extension = archivoArr.length - 1;
		System.out.println("Extension = " + archivoArr[extension]);
	}
}
