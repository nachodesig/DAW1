package ACTVDS_UD1.act4;

public class Temperatura {

	private double fahrenheit;
	
	Temperatura(double fahrenheit){
		this.fahrenheit = fahrenheit;
	}
	
	public void mostrarCelsius() {
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("La temperatura en Celsius es " + celsius);
		
	}
	
	
}
