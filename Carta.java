public class Carta {
	private int numero; // El número será un valor entre 1 y 13
	private String palo; // Diamantes, Treboles, Corazones, Espadas


	public Carta(){
		numero = 3;
		palo = "Espadas";
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


}