package ACTVDS_UD1.act9;

public class NotaExamenes {

	private double nota1;
	private double mediaDeseada;
	
	public NotaExamenes() {
		this.nota1 = nota1;		
		this.mediaDeseada = mediaDeseada;
	}
	
	
	public void getNota1() {
		System.out.println(nota1);
	}
	
	public void getMediaDeseada() {
		System.out.println(mediaDeseada);
	}
	
	public void setNota1() {
		this.nota1 = nota1;
	}
	
	public void setMediaDeseada() {
		this.mediaDeseada = mediaDeseada;
	}
	
	
	public void calcularNotaNecesaria() {
		double nota2 = (mediaDeseada - nota1);
	}
	
	
}
