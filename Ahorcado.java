public class Ahorcado {
	private String palabraSecreta; //escuela
	private StringBuilder palabraUsuario; //??????? 
	private int intentosRestantes;
	// e???e??

	public Ahorcado(String palabra){
		intentosRestantes = 5;
		palabraSecreta = palabra; // hola
		palabraUsuario = new StringBuilder();
		for(int i = 0 ; i < palabraSecreta.length(); i++){
			palabraUsuario.append("?"); // ????
		}
	}

	public boolean buscarLetra(String hilera){
		// como buscamos una letra en el patron??
		// escuela => 
		// palabraSecreta.indexOf(hilera) // -1 > 
		boolean encontrado = false;
		String copiaPalabra = palabraSecreta;
		int posicion = copiaPalabra.indexOf(hilera);
		int ultimaPosicion = 0;
		while (posicion != -1){
			palabraUsuario.replace(ultimaPosicion+ posicion, posicion+hilera.length(), hilera);
			copiaPalabra = copiaPalabra.substring(posicion+hilera.length());
			ultimaPosicion += posicion+hilera.length();
			posicion = copiaPalabra.indexOf(hilera);
		}
		

		return encontrado;
	}

	public String toString(){
		String estado = "Ahorcado\n";
		estado += "Palabra secreta: " + palabraSecreta;
		estado += "\nPalabra usuario: " + palabraUsuario;
		return estado;
	}

	public static void main (String[] args){
		Ahorcado ahorcado = new Ahorcado("escuela");
		System.out.println(ahorcado);
		ahorcado.buscarLetra("e");
		System.out.println(ahorcado);
	}


}