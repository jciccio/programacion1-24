public class Matrices {
	
	public void imprimir(int [][] matriz){
		for (int f = 0 ; f< matriz.length ; f++){
			for(int c = 0; c < matriz[f].length; c++){
				System.out.print(matriz[f][c] + "\t");
			}
			System.out.print("\n");
		}
	}

	public void imprimir(char [][] matriz){
		for (int f = 0 ; f< matriz.length ; f++){
			for(int c = 0; c < matriz[f].length; c++){
				System.out.print(matriz[f][c] + "\t");
			}
			System.out.print("\n");
		}
	}

	public char [][] generarMatrizLetras (int filas, int columnas){
		char [] letras = {'a', 'b', 'c', 'd', 
			'e', 'f', 'g', 'h', 'i', 'j',
		 	'k', 'l', 'm', 'n', 'o', 'p', 
		 	'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

		int contador = 0;
		char [][] matriz = null;
		if(filas > 0 && columnas > 0){	
			matriz = new char[filas][columnas];
			for(int f = 0; f < matriz.length;f++){
			 	for(int c = 0; c < matriz[f].length; c++){
			 		matriz[f][c] = letras[contador % letras.length];
			 		contador++; 
			 	}
			}
		}
		return matriz;
	}

	public char [][] generarMatrizLetras2 (int filas, int columnas){
		int contador = 0;
		char [][] matriz = null;
		if(filas > 0 && columnas > 0){	
			matriz = new char[filas][columnas];
			for(int f = 0; f < matriz.length;f++){
			 	for(int c = 0; c < matriz[f].length; c++){
			 		matriz[f][c] = (char)( (int)'a' + contador % 26);
			 		contador++;	
			 	}
			}
		}
		return matriz;
	}


	public static void main (String [] args){

		int [][] matriz1 = { 
			{1,2,3} , 
			{4,5,6} 
		};

		Matrices matrizInstancia = new Matrices();
		matrizInstancia.imprimir(matriz1);

		matriz1[0][1] = 1337;
		System.out.println("- - - - - - -");
		matrizInstancia.imprimir(matriz1);

		// 3 x 2
		// a b
		// c d
		// e f

		char [][] matrizLetras1 = matrizInstancia.generarMatrizLetras(10,6);
		System.out.println("- - - - - - -");
		matrizInstancia.imprimir(matrizLetras1);
		System.out.println("- - - - - - -");
		System.out.println((int)'a');
		System.out.println((char)97);
		System.out.println("- - - - - - -");
		char [][] matrizLetras2 = matrizInstancia.generarMatrizLetras2(6,5);
		matrizInstancia.imprimir(matrizLetras2);
	}





}