package prueba.ACTVD1;

import java.util.Scanner;

public class actvd2 {

	public static void main(String[] args) {
	
		Scanner sc =  new Scanner(System.in);
	
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
    
		boolean edad_lab = edad >= 18;
    
		System.out.println("¿Es mayor de edad? " + edad_lab);
    	
	}
}
