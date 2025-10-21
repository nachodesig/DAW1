package ACTVDS_UD1.act19;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿Cuántas monedas de  10 centimos tienes?");
		int cent10 =  sc.nextInt();
		
		System.out.println("¿Cuántas monedas de  20 centimos tienes?");
		int cent20 =  sc.nextInt();
		
		System.out.println("¿Cuántas monedas de  50 centimos tienes?");
		int cent50 =  sc.nextInt();
		
		System.out.println("¿Cuántas monedas de  1 euro tienes?");
		int unEuro =  sc.nextInt();
		
		System.out.println("¿Cuántas monedas de  2 euros tienes?");
		int dosEuros =  sc.nextInt();
		
		
		Monedero m1 = new Monedero(dosEuros, unEuro, cent50, cent20, cent10);
		m1.calcularTotalEuros();
	}

}
