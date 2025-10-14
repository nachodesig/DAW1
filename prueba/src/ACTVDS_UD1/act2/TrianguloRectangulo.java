package ACTVDS_UD1.act2;

import java.util.Scanner;

public class TrianguloRectangulo {
	
	//Atributos
	private double catetoA;
	private double catetoB;
	
	//Constructor
	public TrianguloRectangulo(double catetoA,double catetoB) {
		
		this.catetoA = catetoA;
		this.catetoB = catetoB;
	}

	
	public void calcularHipotenusa() {
		double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		System.out.printf("La hipotenusa del triángulo es: %.2f \n", hipotenusa);
	}
	

}
