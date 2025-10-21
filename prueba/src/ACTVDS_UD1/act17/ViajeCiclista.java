package ACTVDS_UD1.act17;

public class ViajeCiclista {

	
	
	private int horaSalida;
	private int minutoSalida;
	private int segundoSalida;
	private int tiempoTotalSegundos;
	
	
	
	public ViajeCiclista(int horaSalida,int minutoSalida,int segundoSalida,int tiempoTotalSegundos) {
		
		this.horaSalida = horaSalida;
		this.minutoSalida = minutoSalida;
		this.segundoSalida = segundoSalida;
		this.tiempoTotalSegundos = tiempoTotalSegundos;
	}
	
	
	public void mostarHoraLlegada() {
		int horas = (tiempoTotalSegundos / 3600) ;
		int minutos = (tiempoTotalSegundos / 60)%60  ;
		int segundos = tiempoTotalSegundos % 60 ;
		
		System.out.println("Has tardado en llegar " + horas + " horas " + minutos + " minutos y " + segundos + " segundos" );
		System.out.println("Y has llegado a las " + (horaSalida + horas % 24)+ ":"+(minutoSalida + minutos) + ":" + (segundos + segundoSalida)) ;
	}
	
}
