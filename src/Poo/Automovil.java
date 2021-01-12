package Poo;

// Mínimo palabra clave class (default)
public class Automovil {

	private String fabricante;
	private String modelo;
	// Por defecto para todos los objetos de la clase
	private String color = "gris";
	private double cilindrada;
	private int capacidadCombustible;

	public Automovil(String fabricante, String modelo){
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public String getFabricante() {
		return this.fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}

	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	public String verDetalle() {
		// this = atributo de la clase, no del metodo
		return "Fabricante = " + getFabricante() +
			  "\nModelo = " + getModelo() +
			  "\nColor = " + getColor() +
			  "\nCilindrada = " + getCilindrada();
	}

	public String acelerar(int rpm) {
		return "El auto " + this.fabricante + " " + this.modelo + " acelerando a " + rpm + "rpm.";
	}

	public String frenar() {
		return this.fabricante + " " + this.modelo + " frenando!!";
	}

	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + "\n" + frenar;
	}

	public String calcularConsumo(int km, float porcetajeCombustible){
		float consumo = km/(this.capacidadCombustible * porcetajeCombustible);
		return "El " + this.fabricante + " " + this.modelo + " consume " + consumo + " litros.";
	}

	public float calcularConsumo(int km, int porcentajeCombustible){
		return km/(capacidadCombustible*(porcentajeCombustible/100f));
	}
}
