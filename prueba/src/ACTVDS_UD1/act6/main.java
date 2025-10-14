package ACTVDS_UD1.act6;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el importe: ");		
		double total = sc.nextDouble();
		
		
		Compra comp = new Compra(total);
		comp.mostrarTotalDescuento();
		
		
	}

}
