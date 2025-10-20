package TareasUd1.act3;

public class NotaAlgoritmos {

	private double parcial1;
	private double parcial2;
	private double parcial3;
	private double examenFinal;
	private double trabajoFinal;

	public NotaAlgoritmos(double parcial1, double parcial2, double parcial3, double examenFinal, double trabajoFinal) {
		this.parcial1 = parcial1;
		this.parcial2 = parcial2;
		this.parcial3 = parcial3;
		this.examenFinal = examenFinal;
		this.trabajoFinal = trabajoFinal;

	}

	public void getparcial1() {
		System.out.println(parcial1);
	}

	public void getparcial2() {
		System.out.println(parcial2);
	}

	public void getparcial3() {
		System.out.println(parcial3);
	}

	public void getexamenFinal() {
		System.out.println(examenFinal);
	}

	public void gettrabajoFinal() {
		System.out.println(trabajoFinal);

	}

	public void setparcial1() {
		this.parcial1 = parcial1;
	}

	public void setparcial2() {
		this.parcial2 = parcial2;
	}

	public void setparcial3() {
		this.parcial3 = parcial3;
	}

	public void setexamenFinal() {
		this.examenFinal = examenFinal;
	}

	public void settrabajoFinal() {
		this.trabajoFinal = trabajoFinal;
	}
	public void calcularNotaFinal() {
		double notaFinal = ((((parcial1 + parcial2 + parcial3)/3)*55 / 100) + (examenFinal * 30 / 100) + (trabajoFinal * 15 / 100)) ;
		System.out.println("Tu nota final es: "+ notaFinal);
	}

}
