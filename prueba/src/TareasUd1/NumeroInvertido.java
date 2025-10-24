package TareasUd1;

public class NumeroInvertido {
 
	private int numero;
	
	public NumeroInvertido(int numero) {
		this.numero = numero;
	}
	
	public void invertirNumero(){
		int unidades = numero % 10;
		int decenas = numero /10;
		System.out.println(unidades +"" + decenas);
	}
	
	
	
	
}
