package ACTVDS_UD1.act6;

public class Compra {

	private double total;
	
	public Compra(double total) {
		this.total = total;
	}
	
	
	public void gettotal(){
		System.out.println(total);
	}
	public void settotal(){
		this.total = total;
	}
	
	
	public void mostrarTotalDescuento() {
		double totalDescuento = total - (total * 15 / 100);
		System.out.println("El importe despues de aplicar un 15% es de "+totalDescuento);
	}
	
	
	
	
	
	
}
