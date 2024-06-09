public class Quiz3{
	// Pregunta 1
	public int multiplicarCeldasArreglo (int [] arreglo, int indice){
		int resultado = 1;
		if(indice == arreglo.length -1){ // Caso Trivial
			resultado = arreglo[indice];
		}
		else{ // Caso recursivo
			resultado = arreglo[indice] * multiplicarCeldasArreglo(arreglo, indice + 1);
		}
		return resultado;
	}

}