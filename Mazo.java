public class Mazo{

	private Carta [] cartas;
	
	public Mazo(){
		cartas = new Carta [52];
		int celda = 0;
		for (int i = 0; i < 4; i++){
			String paloActual = obtenerPalo(i);
			int contador = 1;
			while(contador <= 13){
				cartas[celda] = new Carta(contador, paloActual);
				contador++; 
				celda++;
			}
		}
	}

	public void revolver(){
		for(int i = 0 ; i < cartas.length; i++){
			int celdaAleatoria = (int)(Math.random()*52);
			Carta temporal = cartas[i];
			cartas[i] = cartas[celdaAleatoria];
			cartas[celdaAleatoria] = temporal;
		}
	}

	public void imprimir (){
		for(int i = 0; i < cartas.length; i++){
			cartas[i].imprimir();
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
		System.out.println( "" + (int)(Math.random()*52));
		mazo.imprimir();
		mazo.revolver();
		System.out.println( "- - - - - - - - - -");
		mazo.imprimir();
	}
}