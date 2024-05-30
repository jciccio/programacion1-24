public class AlgoritmosDeOrdenamiento{
	public int [] clonar (int [] arreglo){
		int [] copia = new int [arreglo.length];
		for(int i = 0; i < arreglo.length; i++){
			copia[i] = arreglo[i];
		} 
		return copia;
	}

	public int [] ordenarSeleccion (int [] arreglo){
		int [] copia = clonar(arreglo);
		for(int i = 0 ; i < arreglo.length-1; i++){
			for(int j = i+1; j < arreglo.length; j++){
				if(copia[i] > copia[j]){
					// Hay que hacer un interambio de elementos
					int temporal = copia[i];
					copia[i] = copia[j];
					copia[j] = temporal;
				}
			}
		}
		return copia;
	}

	public int [] ordenarBurbuja (int [] arreglo){
		int [] copia = clonar(arreglo);
		for(int i = 0; i < copia.length; i++){
			for(int j = copia.length-1; j > i; j--){
				if(copia[j-1] > copia[j]){
					int temporal = copia[j-1];
					copia[j-1] = copia[j];
					copia[j] = temporal;
				}
			}
		}
		return copia;
	}
	

	public void imprimir(int [] arreglo){
		for(int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + "\t");
		}
		System.out.println();
	}

	public static void main (String [] args){
		AlgoritmosDeOrdenamiento ao = new AlgoritmosDeOrdenamiento();
		int [] arreglo = {1,40,-3, 3,6,7,19,12,22,4,5,1,1,4,5};
		ao.imprimir(ao.ordenarSeleccion(arreglo));
		ao.imprimir(ao.ordenarBurbuja(arreglo));
	}
}