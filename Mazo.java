public class Mazo{
	
	public Mazo(){
		for (int i = 0; i < 4; i++){
			String paloActual = obtenerPalo(i);
			int contador = 1;
			while(contador <= 13){
				Carta carta = new Carta(contador, paloActual);
				contador++;
				carta.imprimir();
			}
		}
	}

	private String obtenerPalo(int valor){
		String palo = "";
		switch(valor){
			case 1:
				palo = "Treboles";
			break; 
			case 2:
				palo = "Corazones";
			break;
			case 3:
				palo = "Espadas";
			break;
			case 0:
				palo = "Diamantes";
			break;
		}
		return palo;
	}


	public static void main (String args[]){
		Mazo mazo = new Mazo();

	}
}