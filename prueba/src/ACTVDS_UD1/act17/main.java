package ACTVDS_UD1.act17;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la hora de salida: " );
		int horaSalida = sc.nextInt() ;
		
		System.out.println("Introduce el minuto de salida: " );
		int minutoSalida = sc.nextInt() ;
		
		System.out.println("Introduce el segundo de salida: " );
		int segundoSalida = sc.nextInt() ;
		
		System.out.println("Introduce el total en segundos de la salida: " );
		int tiempoTotalSegundos = sc.nextInt() ;
		
		ViajeCiclista v1 = new ViajeCiclista(horaSalida, minutoSalida, segundoSalida, tiempoTotalSegundos);
		v1.mostarHoraLlegada();
	}

}
