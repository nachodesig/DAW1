package ActvdConstructores2;

public class Persona {
	String nombre;
	int edad;
	
	static int contador = 0;
	static String ultimoNombre;
	static Persona ultimaPersona;
	
	Persona(String nombre,int edad){
		this.nombre = nombre;
		this.edad = edad;
		contador++;
		ultimoNombre = nombre;
		ultimaPersona = this;
		
		
	}
	
	static void mostrarTotalPersonas() {
		System.out.println("El total de personas es de "+ contador);
	}
	
	static void mostrarUltimoNombre() {
		System.out.println("El nombre de la última persona es " + ultimoNombre);
	}
	static void mostrarUltimaPersona() {
		System.out.println("Los datos de la Última persona son "+ ultimaPersona.nombre + ultimaPersona.edad);
	}

		
	
}
