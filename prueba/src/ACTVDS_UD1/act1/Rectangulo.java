package ACTVDS_UD1.act1;

import java.util.Scanner;

public class Rectangulo {

	private int base;
	private int altura;
	Scanner sc = new Scanner(System.in);

	public Rectangulo(int base, int altura) {
		this.altura = altura;
		this.base = base;

	}

	public void pedirBase() {
		System.out.println("¿Cuánto mide la altura? ");
		altura = sc.nextInt();		
	}

	public void pedirAltura() {
		System.out.println("¿Cuánto mide la base? ");
		base = sc.nextInt();	
	}

	public void mostrarResultado(int perimetro,int area) {
		perimetro = (base + altura)*2;
		System.out.println("El perímetro mide " + perimetro);
		area = base * altura;
		System.out.println("El área mide " + area);
	}

}
