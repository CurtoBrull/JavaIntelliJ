package Poo;

public class EjemploAutomovil {

	public static void main(String[] args) {

		Automovil subaru = new Automovil("Subaru", "Impreza");
		subaru.setColor("Blanco");
		subaru.setCilindrada(2.0);
		subaru.setCapacidadCombustible(50);

		Automovil mazda = new Automovil("Mazda", "BT-50");
		mazda.setColor("Rojo");
		mazda.setCilindrada(3.0);
		mazda.setCapacidadCombustible(30);

		System.out.println("mazda.fabricante = " + mazda.getFabricante());
		System.out.println("mazda.modelo = " + mazda.getModelo());
		System.out.println("mazda.color = " + mazda.getColor());
		System.out.println("mazda.cilindrada = " + mazda.getCilindrada());
		System.out.println("----");
		System.out.println(subaru.verDetalle());
		System.out.println("----");
		System.out.println(mazda.verDetalle());
		System.out.println("----");

		System.out.println(mazda.acelerar(5000));
		System.out.println(mazda.frenar());
		System.out.println("----");

		System.out.println(subaru.acelerarFrenar(3000));
		System.out.println("----");

		System.out.println(subaru.calcularConsumo(250, 0.4f));
		System.out.println("El " + mazda.getFabricante() + " " + mazda.getModelo() + " consume "
			  + mazda.calcularConsumo(250, 40) + " litros.");
	}
}
