package ACTVDS_UD1.act2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        // Solicitar los catetos al usuario
        System.out.println("Introduce el valor del cateto A: ");
        double catetoA = sc.nextDouble();

        System.out.println("Introduce el valor del cateto B: ");
        double catetoB = sc.nextDouble();

        // Crear el objeto y calcular la hipotenusa
        TrianguloRectangulo triangulo = new TrianguloRectangulo(catetoA, catetoB);
        triangulo.calcularHipotenusa();		
		
	}

}
