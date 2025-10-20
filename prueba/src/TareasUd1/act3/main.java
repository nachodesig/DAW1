package TareasUd1.act3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota parcial 1: ");
		double parcial1 = sc.nextDouble() ;
		
		System.out.println("Introduce la nota parcial 2: ");
		double parcial2 = sc.nextDouble() ;
		
		System.out.println("Introduce la nota parcial 3: ");
		double parcial3 = sc.nextDouble() ;
		
		System.out.println("Introduce la nota del examen final: ");
		double examenFinal = sc.nextDouble() ;
		
		System.out.println("Introduce la nota del trabajo final: ");
		double trabajoFinal = sc.nextDouble() ;
		
		
		NotaAlgoritmos nota = new NotaAlgoritmos(parcial1, parcial2, parcial3, examenFinal, trabajoFinal);
		nota.calcularNotaFinal();
		
	}

}
