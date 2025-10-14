package ACTVDS_UD1.act4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce los grados en Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		
		Temperatura temp = new Temperatura(fahrenheit);
		temp.mostrarCelsius();
		
		
		
	}

}
