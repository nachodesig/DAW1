package ACTVDS_UD1.act5;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de respuestas correctas: ");
		int correctas = sc.nextInt();

		System.out.println("Introduce el número de respuestas incorrectas: ");
		int incorrectas = sc.nextInt();

		System.out.println("Introduce el número de respuestas en blanco: ");
		int blancas = sc.nextInt();
		
        EvalucionTest test = new EvalucionTest(correctas, incorrectas, blancas);
        test.calcularNotaFinal();
	}

}
