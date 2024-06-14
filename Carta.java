import java.io.Serializable;
public class Carta implements Serializable {
	private int numero; // El número será un valor entre 1 y 13
	private String palo; // Diamantes, Treboles, Corazones, Espadas

	public Carta(){
		numero = 3;
		palo = "Espadas";
	}
	//Carta carta3 = new Carta(7, "Diamantes");
	public Carta(int numero, String palo){
		this.numero = numero;
		this.palo = palo;
	}
	// 
	public Carta(int numero){
		this.numero = numero;
		this.palo = "Corazones";
	}

	// Métodos - Acciones que llevamos a cabo en la clase
	// público o privado -- Accesibilidad
	// lo que queremos que retorne el método
	// el nombre del método
	// lo que recibe el método para que funcione (parámetros)

	// Métodos de tipo SET
	public void setNumero(int numeroCarta){
		this.numero = numeroCarta;
	}
	public void setPalo(String paloCarta){
		this.palo = paloCarta;
	}
	public int getNumero(){
		return numero;
	}
	public String getPalo(){
		return palo;
	}

	public void imprimir(){
		String numeroHilera = "";
		if(numero == 1){
			numeroHilera = "As";
		}
		else if (numero == 11){
			numeroHilera = "J";
		}
		else if (numero == 12){
			numeroHilera = "Q";
		}
		else if (numero == 13){
			numeroHilera = "K";
		}
		else{
			numeroHilera += numero;
		}
		System.out.println("La carta es un " + numeroHilera + " de " + palo);
	}

	public void imprimirSwitch(){
		String numeroHilera = "";
		switch(numero){
			case 1:
				numeroHilera = "As";
			break;
			case 11:
				numeroHilera = "J";
			break;
			case 12:
				numeroHilera = "Q";
			break;
			case 13:
				numeroHilera = "K";
			break;
			default:
				numeroHilera += numero;
		}
		System.out.println("La carta es un " + numeroHilera + " de " + palo);
	}


}