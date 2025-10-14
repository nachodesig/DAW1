package ACTVDS_UD1.act8;

public class DistanciaAbsoluta {

	
private double num1;
private double num2;
	
	public DistanciaAbsoluta(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public void getnum1() {
		System.out.println(num1);
	}
	public void getnum2() {
		System.out.println(num2);
	}
	public void setnum1() {
		this.num1 = num1;
	}
	public void setnum2() {
		this.num2 = num2;
	}
	
	
	public  void mostrarDistancia() {
		System.out.println("El resultado es " + Math.abs(num1-num2));
	}
}
