package ar.com.unpaz.main;
import ar.com.unpaz.model.Animal;
import ar.com.unpaz.model.Perro;
import ar.com.unpaz.model.Gato;
import ar.com.unpaz.model.Puerco;

public class Inicio {

	public static void main(String[] args) {
		
		Animal perro1 = new Perro("Noha", 12, "perro");
		perro1.hacerRuido();
		perro1.mostrarInfo();
		
		Animal gato1 = new Gato("Ameli", 2, "gato");
		gato1.hacerRuido();
		gato1.mostrarInfo();
		
		Animal puerco1 = new Puerco("Tomi", 3, "puerco");
		puerco1.hacerRuido();
		puerco1.mostrarInfo();
		
	}


}