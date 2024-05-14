import javax.swing.*;
public class Buscaminas {
	private int [][] tablero;
	private int minas;
	// -1 representa las minas

	public Buscaminas(int filas, int columnas, int minas){
		tablero = new int[filas][columnas];
		this.minas = minas;
		this.colocarMinas(minas);
		this.llenarTablero();
	}

	public void llenarTablero(){
		// recorrer la matriz
		// si el valor es un -1 entonces: 
		//    Siempre y cuando el vecino no sea una mina y esté en los límites
		//       vemos los 8 vecinos y sumamos 1 ud.
		int [] corrimientoF = {-1,-1,-1, 0,0, 1,1,1};
		int [] corrimientoC = {-1, 0, 1,-1,1,-1,0,1};
		for(int f = 0; f < tablero.length; f++){
			for (int c = 0 ; c < tablero[f].length; c++){
				if(tablero[f][c] == -1){ // El valor es una mina
					// Queremos ver los 8 vecinos
					for(int i = 0; i < 8; i++){
						int nuevaF = f + corrimientoF[i];
						int nuevaC = c + corrimientoC[i];
						if (nuevaF >= 0 && nuevaC >= 0 && 
							nuevaF < tablero.length && 
							nuevaC < tablero[nuevaF].length &&
							tablero[nuevaF][nuevaC] != -1)
						{
							tablero[nuevaF][nuevaC]++;
						}
					}
				}
			}
		}

	}

	public boolean colocarMinas(int minas){
		// 1 Vamos a iterar por la cantidad de minas que queremos colocar
		// 2 Generamos un número aleatorio por cada fila y columna
		// 3 Hay que revisar si la mina ya está en el campo
		// 	   Si hay un cero
		// 4 Actualizamos la matriz con un -1 y colocamos la mina
		// 	   Si ya está entonces volvemos al punto 2
		boolean colocadas = false;
		if(minas < tablero.length * tablero[0].length ){
			int minasColocadas = 0;
			while(minasColocadas < minas){
				int filaAleatoria = (int)(Math.random() * tablero.length);
				int columnaAleatoria = (int)(Math.random() * tablero[filaAleatoria].length);
				if(tablero[filaAleatoria][columnaAleatoria] == 0){
					tablero[filaAleatoria][columnaAleatoria] = -1;
					minasColocadas++;
				}
			}
			colocadas = true;
		}
		return colocadas;
	}

	public String toString(){
		String contenido = "Hay " + minas + " minas en el tablero. \n";
		for(int f = 0 ; f < tablero.length; f++){
			for(int c = 0; c < tablero[f].length; c++){
				contenido += (tablero[f][c] == -1) ? "* " : tablero[f][c] + " ";
			}
			contenido += "\n";
		}

		return contenido;
	}

	public static void main (String [] args){
		Buscaminas buscaminas = new Buscaminas(10,10,10);
		System.out.println(buscaminas);
		JOptionPane.showInputDialog(buscaminas);
	}

}