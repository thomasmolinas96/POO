package ar.com.unpaz.model;

public class Gato extends Animal {
	
	private String raza;

	//Constructor de la clase Gato con el metodo super para traer los atributos de la superclase Animal
	public Gato(String nombre,int edad,String raza) {
		super(nombre, edad);
		this.raza = raza;
		
	}

	@Override
	public void hacerRuido() {
		System.out.println("MIIIAUUUUU!!");
		
	}
	public void mostrarInfo() {
		System.out.println("La raza es: " + this.raza);
	}

}
