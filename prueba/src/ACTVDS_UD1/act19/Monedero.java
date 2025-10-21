package ACTVDS_UD1.act19;

public class Monedero {

	private int dosEuros;
	private int unEuro;
	private int cent50;
	private int cent20;
	private int cent10;

	public Monedero(int dosEuros, int unEuro, int cent50, int cent20, int cent10) {
		this.dosEuros = dosEuros;
		this.unEuro = unEuro;
		this.cent50 = cent50;
		this.cent20 = cent20;
		this.cent10 = cent10;
	}

	public void calcularTotalEuros() {
		int totalEnCentimos = (cent10 * 10) + (cent20 * 20)+ (cent50 *50)+ (dosEuros * 200) + (unEuro * 100);
		int euros = totalEnCentimos /100;
		int centimos = totalEnCentimos % 100;
		System.out.println("En total tienes "+ euros + " € y " + centimos+ " céntimos");
				
	}

}
