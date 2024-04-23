public class EjerciciosCiclos{
	

	public int calcularFactorial(int n){
		int resultado = 0;
		if(n >= 0){
			resultado = 1;
			int contador = n;
			while(contador >= 1){
				resultado *= contador;
				contador--;
			}
		}
		return resultado;
	}

	public int calcularPotencia(int base, int exp){
		int resultado = 0;
		if(exp >= 0){
			resultado = 1;
			while(exp >= 1){
				resultado *= base;
				exp--;
			}
		}
		return resultado;
	}

	// 371 => 3
	// 82828 => 5
	public int calcularCantidadDigitos(int numero){
		int contador = 0;
		while(numero > 0){
			numero /= 10;
			contador++;
		}
		return contador;
	}


	public boolean calcularNumeroArmstrong(int numero){
		boolean esArmstrong = false;
		int numeroCopia = numero;
		int contador = 0;
		int cantidadDigitos = calcularCantidadDigitos(numero);
		while(numeroCopia > 0){
			int ultimoDigito = numeroCopia % 10;
			contador += calcularPotencia(ultimoDigito, cantidadDigitos);
			numeroCopia /= 10;
		}
		if(contador == numero){
			esArmstrong = true;
		}

		return contador == numero;
	}

	public static void main (String args []){
		EjerciciosCiclos ec = new EjerciciosCiclos();
	}
}