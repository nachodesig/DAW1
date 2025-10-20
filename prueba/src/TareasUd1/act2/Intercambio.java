package TareasUd1.act2;

public class Intercambio {

	
	
	private int a;	
	private int b;
	
	public Intercambio(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	
	public void geta() {
		System.out.println(a);
	}
	public void getb() {
		System.out.println(b);
	}
	public void seta() {
		this.a = a;
	}
	public void setb() {
		this.b = b;
	}
	
	
	public void Intercambiar() {
		int interA = a ;
		int interB = b ;
		a = interB;
		b = interA;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	
	
	
}
