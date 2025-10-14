package poo.persona;

public class Persona {

	//nombre,edad,estatura
	
	String nombre;
	int edad;
	double estatura;
	
	
	void saludar() {
		System.out.println("hola!!!");
	}

	
	void presentarse() {
		System.out.println("hola! mi nombre es "+ nombre + ", tengo " + edad + " años y mido" + estatura + "cm ");
		System.out.printf("Hola, mi nombre es %s, tengo %d años y mido %.2fcm. ", nombre, edad, estatura);

	}
	
	
}
       