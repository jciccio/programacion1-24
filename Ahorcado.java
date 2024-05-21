import javax.swing.*;
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
			int nuevaPosicion = ultimaPosicion + posicion; 
			palabraUsuario.replace(
				nuevaPosicion, nuevaPosicion +hilera.length(), hilera);
			copiaPalabra = copiaPalabra.substring(posicion+hilera.length());
			ultimaPosicion += posicion+hilera.length();
			posicion = copiaPalabra.indexOf(hilera);
			encontrado = true;
		}
		return encontrado;
	}

	public boolean gano(){
		return palabraUsuario.toString().indexOf("?") == -1;
	}

	public void jugar(){
		// Mientras tenga intentos
		// Pedirle al usuario un valor
		// Vamos a ver si el valor se encuentra
		// Si se encuentra se modifica la palabra secreta
		// Si no se encuentra, se resta 1 a los intentos
		do{
			String letras = JOptionPane.showInputDialog(toString() + "\nDigite una letra(s):");
			boolean letraEncontrada = buscarLetra(letras);
			if(!letraEncontrada){
				intentosRestantes--;
			}
		}while(intentosRestantes > 0 && !gano());

		if(gano()){
			JOptionPane.showMessageDialog(null, "Felicidades, ganó! :)");
		}
		else{
			JOptionPane.showMessageDialog(null, "Perdió :(");
		}
	}

	public String toString(){
		String estado = "Ahorcado, adivine la palabra secreta:";
		//estado += "Palabra secreta: " + palabraSecreta;
		estado += "\n" + palabraUsuario;
		estado += "\nIntentos restantes: " + intentosRestantes;
		return estado;
	}

	public static void main (String[] args){
		Ahorcado ahorcado = new Ahorcado("escuela");
		//System.out.println(ahorcado);
		//ahorcado.buscarLetra("esc");
		ahorcado.jugar();
	}


}