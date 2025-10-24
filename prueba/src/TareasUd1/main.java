package TareasUd1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);


System.out.println("Introduce el numero:");
	int numero = sc.nextInt();
	
	NumeroInvertido ni1 = new NumeroInvertido(numero);
	ni1.invertirNumero();
	
	
	}

}
