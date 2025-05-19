package ar.com.unpaz.model;

public class Perro extends Animal {
	
	private String raza;

	public Perro(String nombre,int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;

	}

	@Override
	public void hacerRuido() {
		System.out.println("GUAUU GUAUU!!");
		
	}
	public void mostrarInfo() {
		System.out.println("La raza es: " + this.raza);

	}
}
