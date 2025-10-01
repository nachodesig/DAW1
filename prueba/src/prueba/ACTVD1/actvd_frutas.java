package prueba.ACTVD1;

import java.util.Scanner;

public class actvd_frutas {
	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Introduce los kg de manzanas vendidos este semstre: ");
		int var_manzana = sc.nextInt();
		
		System.out.println("Introduce los kg de peras vendidos este semstre: ");
		int var_pera = sc.nextInt();

		double total_manz = (var_manzana * 2.35)*2;
		System.out.println("El importe total de manzanas es de " + total_manz + "euros");

		double total_peras = (var_pera * 1.95 )*2;
		System.out.println("El importe total de peras es de " + total_peras + "euros");

		
		
		System.out.println("El importe total  es de " + (total_manz + total_peras) + "euros");

	}

}
