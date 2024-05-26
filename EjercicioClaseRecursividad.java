public class EjercicioClaseRecursividad{
	
	public int [] eliminarDuplicados (int [] arreglo){
		int [] resultado = new int [arreglo.length];
		int ultimoUsado = 0;
		for(int i = 0; i < arreglo.length; i++){
			// vamos a buscar si el elemento se encuentra en resultado
			boolean encontrado = false;
			for (int j = 0; j < ultimoUsado; j++){
				if(resultado[j] == arreglo[i]){
					encontrado = true;
				}
			}
			if(!encontrado){
				resultado[ultimoUsado] = arreglo[i];
				ultimoUsado++;
			}
			
		}
		int [] sinDuplicados = new int[ultimoUsado];
		for(int i = 0; i < sinDuplicados.length; i++){
			sinDuplicados[i] = resultado[i];
		}
		return sinDuplicados;
	}

	public void imprimir(int [] arreglo){
		imprimir(arreglo, 0);
	}

	public void imprimir(int [] arreglo, int indice){
		if(indice == arreglo.length -1){
			System.out.println(arreglo[indice]);
		}
		else{
			System.out.print(arreglo[indice] + " ");
			imprimir(arreglo, indice+1);
		}
	}

	public int sumarElementos(int [] arreglo, int indice){
		int resultado = 0;
		if(indice == arreglo.length -1){
			resultado = arreglo[indice];
		}
		else{
			resultado = arreglo[indice] + sumarElementos(arreglo, indice+1);
		}
		return resultado;	
	}

	public static void main (String [] args){
		EjercicioClaseRecursividad r = new EjercicioClaseRecursividad();
		int [] arreglo = {1,1,1,2,2,2,2,3,3,3,4,4,4,4,4,5};
		int [] sinDuplicados = r.eliminarDuplicados(arreglo);
		r.imprimir(sinDuplicados);
		int suma = r.sumarElementos(sinDuplicados, 0);
		System.out.println(suma);

	}
}