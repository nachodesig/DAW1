package TareasUd1.act2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el valor de a: ");
		int a = sc.nextInt();

		System.out.print("Introduce el valor de b: ");
		int b = sc.nextInt();

		Intercambio obj = new Intercambio(a, b);
		obj.Intercambiar();

	}

}
