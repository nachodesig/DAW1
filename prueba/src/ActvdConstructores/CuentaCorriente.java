package ActvdConstructores;

import java.util.Scanner;

public class CuentaCorriente {
	String dni;
	String titular;	
	double saldo;
	
	CuentaCorriente cc = new CuentaCorriente("2423121H","Pablo",0);
	
	
	Scanner sc =  new Scanner(System.in);
	



CuentaCorriente(String dni,	String titular,	double saldo){
		this.dni = dni;
		this.titular = titular;
		this.saldo = 0.0;
		
	}
	
	
	void ingresarDinero(double ingreso) {
	System.out.println("¿Qué cantidad quieres ingresar? ");
	ingreso = sc.nextDouble();		
	this.saldo += ingreso;
	
}

	void retirarDinero(double retiro) {
	System.out.println("¿Qué cantidad quieres retirar? ");
	retiro = sc.nextDouble();		
	this.saldo -= retiro;
	}
	
	
	
	void mostrarInfo() {
		System.out.println("Hola "+ this.titular + " tu cuenta tiene un saldo de "+ this.saldo );
		if (this.saldo <= 0) {
			System.out.println("Eres un puto pobre, juega a la ruleta y ganaras dinero,elige un numero del 1 al 10");
			
			int numero = sc.nextInt();
							if (numero >= 10 ) {
							this.saldo += 200.0;
							System.out.println("Enhorabuena tu saldo ahora es de " + saldo + "€");
				            } else {
				            	this.saldo -= 200.0;
				            	System.out.println("Enhorabuena tu saldo ahora es de " + saldo + "€");
				            }
		} else {
			System.out.println("Compaltan");
		}
			
	}
	
	

}
