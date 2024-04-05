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


}