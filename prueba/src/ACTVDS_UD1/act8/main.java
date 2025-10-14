package ACTVDS_UD1.act8;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Introduce el primer número:");
		double num1 = sc.nextDouble();
		
		System.out.println("Introduce el segundo número:");
		double num2 = sc.nextDouble();
		
		DistanciaAbsoluta dist = new DistanciaAbsoluta(num1, num2);
		dist.mostrarDistancia();
	}

}
