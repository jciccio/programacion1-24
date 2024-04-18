public class CalculadoraV2{
	
	/*
		// Queremos hacer un método que reciba por parámetro un número real
		// Y nos regrese la parte decimal
		3.14 => 0.14
		6.999999 => 0.999999
	*/
	public double calcularParteDecimal(double numeroReal){
		return numeroReal - (int)(numeroReal);
	}


	public double sumar(double valorA, double valorB){
		System.out.println("Estamos en el metodo: sumar(double, double)");
		return valorA + valorB;
	}

	public int sumar(int valorA, int valorB){
		System.out.println("Estamos en el metodo: sumar(int, int)");
		return valorA + valorB;
	}	

	public double sumar(double valorA, int valorB){
		System.out.println("Estamos en el metodo: sumar(double, int)");
		return valorA + valorB;
	}

	public double sumar(int valorA, double valorB){
		System.out.println("Estamos en el metodo: sumar(int, double)");
		return valorA + valorB;
	}	


	public double restar(double valorA, double valorB){
		return valorA - valorB;
	}

	public double multiplicar(double valorA, double valorB){
		return valorA * valorB;
	}

	public double dividir (double valorA, double valorB){
		double resultado = valorA / valorB;
		return resultado;
	}


	public int redondear(double numeroReal){
		// Operador ternario
	/*	int parteEntera = (int)numeroReal;
		double parteDecimal = numeroReal - parteEntera;
		int numero = (parteDecimal >= 0.5) ? parteEntera + 1 : parteEntera;
		return numero; */
		double valorAbsoluto = calcularValorAbsoluto(numeroReal);

		int parteEntera = (int)valorAbsoluto; // 5.9999 => 5
		double parteDecimal = valorAbsoluto - parteEntera; // 5.9999 - 5 => 0.9999
		
		int resultado = parteEntera;
		if(parteDecimal >= 0.5){
			resultado += 1;
		}

		if(numeroReal < 0){
			resultado *= -1;
		}
		return resultado;
	}

	/*public int redondearV2(double numeroReal){
		double resultado = 0;
		if(numeroReal > 0){
			int parteEntera = (int)numeroReal;
			double parteDecimal = numeroReal - parteEntera;
			if(parteDecimal >= 0.5){
				resultado = parteEntera + 1;
			}	
		}
		else{
			numeroReal *= -1;
			int parteEntera = (-1*numeroReal);
			double parteDecimal = numeroReal - parteEntera;
			if(parteDecimal >= 0.5){
				resultado = parteEntera + 1;
			}
			resultado *= -1;	
		}
	}*/

	public double calcularValorAbsoluto (double numeroReal){
		// 5.6 => 5.6
		// -2.3 => 2.3
		double valorAbsoluto = numeroReal;
		if (numeroReal < 0){
			valorAbsoluto *= -1;
		}
		return valorAbsoluto;
	}


	public int calcularSumatoria(int n){
		int sumatoria = 0;
		for (int i = 0 ; i <= n ; i++){
			sumatoria +=  i ;
		}
		return sumatoria;
	}

}