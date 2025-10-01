package prueba.ACTVD1;

import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Introduce un número ");
		int numero1 = sc.nextInt();
		
		boolean num_par = numero1 % 2 == 0;
		
		System.out.println("¿Es par? " + num_par);
		
	}

}
