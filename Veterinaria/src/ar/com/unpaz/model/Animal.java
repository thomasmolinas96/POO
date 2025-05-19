package ar.com.unpaz.model;


public abstract class Animal {
	
	private String nombre;
	private int edad;
	
	 
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public void mostrarInfo() {
		System.out.println("El nombre es" + nombre + "y la edad" + edad);
	}
	public abstract void hacerRuido();

}
