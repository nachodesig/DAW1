package ACTVDS_UD1.act3;

public class Calculadora {

private double numero1;
private double numero2;

public Calculadora(double numero1,double numero2) {

	this.numero1 = numero1;
	this.numero2 = numero2;
}

public void getNumero1() {
	System.out.println(numero1);
}

public void setNumero1(double numero1) {
	this.numero1 = numero1;
}
public void getNumero2() {
	System.out.println(numero2);
}
public void setNumero2(double numero2) {
	this.numero2 = numero2;
}


public void mostrarOperaciones() {
	double suma = numero1 + numero2;
	double resta = numero1 - numero2;
	double multiplicacion = numero1 * numero2;
	double division = numero1 / numero2;
	
	System.out.println(suma);
	System.out.println(resta);
	System.out.println(multiplicacion);
	System.out.println(division);
}







}
