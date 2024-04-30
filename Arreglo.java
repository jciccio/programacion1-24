public class Arreglo{
	

	// si recibimos parametro => [1,2,3,4]
	// cual es el tamanio del arreglo parametro
	// retornamos una copia [1,2,3,4]
	public int [] duplicar(int [] arreglo){
		int [] copia = new int [arreglo.length];
		for(int i = 0; i < copia.length; i++){
			copia[i] = arreglo[i];
		}
		return copia;
	}
	//  0 1 2  3 4
	// [1,3,50,7,9]
	// valor = 50
	// Metoro retorna => 2
	public int buscar(int [] arreglo, int valor){
		int encontrado = -1;
		for (int i = 0; i < arreglo.length && encontrado == -1; i++){
			if(valor == arreglo[i]){
				encontrado = i;
			}
		}
		return encontrado;
	}

	public void imprimir(int [] arreglo){
		for(int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + "\t");
		}
		System.out.println();
	}


	public static void main (String [] args){
		Arreglo arregloInstancia = new Arreglo();
		int [] arreglo1 = {1,3,5,7,9};
		arregloInstancia.imprimir(arreglo1);
		int [] a2 = arregloInstancia.duplicar(arreglo1);
		arreglo1[0] = 66;
		arregloInstancia.imprimir(arreglo1);
		arregloInstancia.imprimir(a2);


		System.out.println("Buscando 9 en {1,3,5,7,9} => " + arregloInstancia.buscar(a2, 9));
		System.out.println("Buscando 90 en {1,3,5,7,9} => " + arregloInstancia.buscar(a2, 90));

	}
}