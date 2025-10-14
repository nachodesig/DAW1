package ACTVDS_UD1.act5;

public class EvalucionTest {

	private int correctas;
	private int incorrectas;
	private int blancas;

	public EvalucionTest(int correctas, int incorrectas, int blancas) {
		this.correctas = correctas;
		this.incorrectas = incorrectas;
		this.blancas = blancas;

	}

	public void getcorrectas() {
		System.out.println(correctas);

	}

	public void getincorrectas() {
		System.out.println(incorrectas);
	}

	public void getblancas() {
		System.out.println(blancas);

	}

	public void setcorrectas() {
		this.correctas = correctas;

	}

	public void setincorrectas() {
		this.incorrectas = incorrectas;

	}

	public void setblancas() {
		this.blancas = blancas;

	}
	
	public void calcularNotaFinal() {
		int notaFinal = (correctas*5) + (incorrectas * -1);
		int notaFinalPosible = (correctas  +  incorrectas + blancas)*5;
		System.out.println("La nota final es de " + notaFinal + "/" + notaFinalPosible);
		
	}

}
