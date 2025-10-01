package prueba.ACTVD1;

import java.util.Scanner;

public class actvd_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
	
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
    
		boolean edad_lab = edad >= 16 && edad < 67 ;
    
		System.out.println("¿Estas en edad laboral? " + edad_lab);
    	
	
	}

}
