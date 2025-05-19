package ar.com.unpaz.model;

public class Puerco extends Animal {

	private String raza;

	public Puerco(String nombre, int edad, String raza){
		super(nombre, edad);
		this.raza = raza;
		
	}

	@Override
	public void hacerRuido() {
		System.out.println("OINK OINK!!");
		
	}
	public void mostrarInfo() {
		System.out.println("La raza es: " + this.raza);
	}

}
