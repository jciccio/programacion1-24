import javax.swing.*;
public class Buscaminas {
	private int [][] tablero;
	// -1 representa las minas dentro del tablero
	// 0 representa que no hay minas alrededor

	private String [][] tableroUsuario;
	private int minas;
	

	public Buscaminas(int filas, int columnas, int minas){
		if(filas*columnas > minas){
			tablero = new int[filas][columnas];
			this.minas = minas;
			this.colocarMinas(minas);
			this.llenarTablero();
			this.llenarTableroUsuario(filas, columnas);
		}
	}

	public void llenarTableroUsuario(int f, int c){
		tableroUsuario = new String [f][c];		
		for(int fila = 0 ; fila < tablero.length; fila++){
			for(int col = 0; col <tablero[fila].length; col++){
				tableroUsuario[fila][col] = "_";
			}
		}
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

	public boolean realizarMovimiento(int f, int c, boolean perdio){
		if(	f >= 0 && c >=0 && 
			f < tablero.length && 
			c < tablero[f].length){ // caso trivial
			// caemos en un número > 0 
			if(tablero[f][c] == -1){ //Caso trivial: caemos en una mina
				perdio = true;
				tableroUsuario[f][c] = "M";
			}
			else if (tablero[f][c] > 0){
				tableroUsuario[f][c] = ""+tablero[f][c];
				perdio = false;
			}
			else if (tableroUsuario[f][c] == "_"){
				tableroUsuario[f][c] = ""+tablero[f][c];
				int [] cF = {-1,-1,-1, 0,0, 1,1,1};
				int [] cC = {-1, 0, 1,-1,1,-1,0,1};
				int contador = 0;
				while(contador < cF.length){
					int nuevaF = f + cF[contador];
					int nuevaC = c + cC[contador];
					perdio = realizarMovimiento(nuevaF, nuevaC, perdio);
					contador += 1;
				}
			}
		}
		return perdio;
	}

	public boolean verificarGanador(){
		// El jugador gana si la cantidad de minas es igual a la cantidad de espacios no visitados
		// Vamos a contar los "_" y si esto es igual a la cantidad de minas
		int camposSinDesbloquear = 0;
		for(int f = 0; f < tableroUsuario.length; f++){
			for(int c = 0; c < tableroUsuario[f].length; c++){
				if(tableroUsuario[f][c].equals("_")){
					camposSinDesbloquear++;
				}
			}
		}
		return camposSinDesbloquear == minas;
	}

	public void jugar(){
			// pedir una fila
			// pedir una columna
			// realizamos el movimiento
			// verificar si gana
		// Un ciclo mientras que no haya ganado
		Interfaz interfaz = new Interfaz();
		boolean perdio, gano;
		do{
			int fila = interfaz.solicitarNumeroEntero(toString() + " Digite la fila");
			int columna = interfaz.solicitarNumeroEntero(toString() + " Digite la columna");
			perdio = realizarMovimiento(fila, columna, false);
			gano = verificarGanador();

		}while(!gano && !perdio);
		String mensaje = gano ? "Felicidades, ganó el juego :)" : "Perdio :(";
		interfaz.mostrarMensaje(mensaje);
	}

	public String toString(){
		String contenido = "Hay " + minas + " minas en el tablero. \n";
		/*for(int f = 0 ; f < tablero.length; f++){
			for(int c = 0; c < tablero[f].length; c++){
				contenido += (tablero[f][c] == -1) ? "* " : tablero[f][c] + " ";
			}
			contenido += "\n";
		}*/

		contenido += "\r\n - - -  Tablero Usuario - - - - - \r\n";
		for(int fila = 0 ; fila < tableroUsuario.length; fila++){
			for(int col = 0; col <tableroUsuario[fila].length; col++){
				contenido += tableroUsuario[fila][col] + " \t";
			}
			contenido += "\r\n";
		}

		return contenido;
	}

	public static void main (String [] args){
		Buscaminas buscaminas = new Buscaminas(10,10,10);
		//System.out.println(buscaminas);
		//JOptionPane.showInputDialog(buscaminas);
		//buscaminas.realizarMovimiento(1,1, true);
		//System.out.println(buscaminas);
		buscaminas.jugar();
	}

}