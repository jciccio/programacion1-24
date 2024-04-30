public class PasoCopiaVsReferencia{
	
	public void pasoCopia(int x){
		x = x + 10;
	}

	public void imprimirArreglo(int [] arreglo){
		for(int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + "\t");
		}
		System.out.println();
	}

	public void modificarArreglo(int [] arregloX){
		arregloX[0] = 8;
		arregloX[1] = 12;
	}


	public static void main (String [] args){
		PasoCopiaVsReferencia instancia = new PasoCopiaVsReferencia();
		int x = 10;
		instancia.pasoCopia(x);	
		System.out.println(x);

		int [] arreglo = new int [5];
		arreglo[0] = 5; 
		instancia.imprimirArreglo(arreglo);
		instancia.modificarArreglo(arreglo);
		instancia.imprimirArreglo(arreglo);
	}

}