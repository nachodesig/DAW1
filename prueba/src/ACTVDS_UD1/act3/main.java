package ACTVDS_UD1.act3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("dime el primer numero: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("dime el segundo numero: ");
		double numero2 = sc.nextDouble();

		
		Calculadora call = new Calculadora(numero1, numero2);
		call.mostrarOperaciones();
	}

}
