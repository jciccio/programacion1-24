public class EstructurasDeSeleccion{
	public static void main (String [] args){
		//
		//
		//
		//
		// Ejemplo if
		int x = 1;
		if (x > 5){
			x *= 20;
		}
		System.out.println("El valor de X es: " + x);

		// Ejemplo if/else
		int y = 4;
		if (y % 2 == 0){
			// Se ejecuta si la condicion es true
			System.out.println("Y es divisible entre 2");
		}
		else{
			// Se ejecuta si la condicion es false
			System.out.println("Y NO es divisible entre 2");
		}

		double colones = 80000;
		double dolares = 300;

		if(colones/500 >= 350 || dolares >= 350 || dolares + colones/500 >= 350){
			System.out.println("Puede comprar el producto");
		}
		else{
			System.out.println("No tiene suficientes fondos para comprar el producto");
		}


		double nota = 100;

		if(nota >= 67.5){
			// Estudiante pasa
			System.out.println("Estudiante pasa " + nota);
		}
		else {
			if (nota >= 57.5 && nota < 67.5){
			// Estudiante va a amplicacion
			System.out.println("Estudiante va a amplicacion " + nota);
			}
			else{
				// El estudiante se queda
				System.out.println("El estudiante se queda " + nota);
			}
		}

	}

}