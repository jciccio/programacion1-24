public class Examen1{

	// Pregunta 2
	private int elevar(base, exponente){
		int resultado = 1;
		for (int i =0; i < exponente; i++){
			resultado *= base;
		}
		return resultado;
	}

	// Pregunta 2
	public int [][] crearMatrizCuadrada (int tam, int diagonal){
		int [][] resultado = null;
		if(tam > 0){
			resultado = new int [tam][tam];
			for (int f = 0; f < tam; f++){
				for(int c = f; c < tam; c++){
					int diferencia = (f - c) > 0 ? f-c : c-f;
					resultado[f][c] = diagonal * elevar(2,diferencia);
					resultado[c][f] = diagonal * elevar(2,diferencia);
				}
			}
		}
		return resultado;
	}

	// Pregunta 3
	public double calcularPi(int n){
		double pi = 1;
		int signo = -1;
		double denominador = 3;
		for(int i = 0; i < n ; i++){
			pi += (signo * 1/denominador);
			signo *= -1;
			denominador += 2;
		}
		return 4 * pi;
	}
}