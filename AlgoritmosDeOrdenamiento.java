import java.time.Instant;
import java.time.Duration;

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
		boolean intercambioRealizado = true;
		for(int i = 0; i < copia.length && intercambioRealizado; i++){
			intercambioRealizado = false;
			for(int j = copia.length-1; j > i; j--){
				if(copia[j-1] > copia[j]){
					int temporal = copia[j-1];
					copia[j-1] = copia[j];
					copia[j] = temporal;
					intercambioRealizado = true;
				}
			}
		}
		return copia;
	}

	public int [] ordenarInsercion (int [] arreglo){
		int [] copia = clonar(arreglo);
		for(int i = 1; i < arreglo.length; i++){
			int temporal = copia[i];
			int contador = i - 1;
			while(contador >= 0 && copia[contador] > temporal){
				copia[contador+1] = copia[contador];
				contador--;
			}
			copia[contador+1] = temporal;
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
		int [] arreglo2 = new int [1000000];
		for(int i = 0 ; i < arreglo2.length; i++){
			arreglo2[i] = (int)(Math.random()*10000000);
		}
		ao.imprimir(ao.ordenarSeleccion(arreglo));
		ao.imprimir(ao.ordenarBurbuja(arreglo));
		ao.imprimir(ao.ordenarInsercion(arreglo));

		Instant tiempoInicial = Instant.now();
		ao.ordenarInsercion(arreglo2);
		Instant tiempoFinal = Instant.now();
		long tiempoTranscurrido = Duration.between(tiempoInicial, tiempoFinal).toMillis();
		System.out.println("Tiempo de insercion es: " + tiempoTranscurrido/1000.0);

	/*	tiempoInicial = Instant.now();
		ao.ordenarBurbuja(arreglo2);
		tiempoFinal = Instant.now();
		tiempoTranscurrido = Duration.between(tiempoInicial, tiempoFinal).toMillis();
		System.out.println("Tiempo de burbuja es: " + tiempoTranscurrido/1000.0);

		tiempoInicial = Instant.now();
		ao.ordenarSeleccion(arreglo2);
		tiempoFinal = Instant.now();
		tiempoTranscurrido = Duration.between(tiempoInicial, tiempoFinal).toMillis();
		System.out.println("Tiempo de seleccion es: " + tiempoTranscurrido/1000.0);
*/


	}
}