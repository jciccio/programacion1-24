public class Recursividad{
	
	public int calcularSumatoria(int n){
		int resultado = 0;
		if(n <= 0){ // Caso trivial o caso base
			resultado = 0;
		}
		else{ // Caso recursivo
			resultado = n + calcularSumatoria(n-1);
		}
		return resultado;
	}

	public int calcularFibonacci(int n){
		int resultado = 0;
		if(n == 0){
			resultado = 0;
			//System.out.println("Caso trivial: " + n);
		}
		else if (n == 1){
			//System.out.println("Caso trivial: " + n);
			resultado = 1;
		}
		else{
			//System.out.println("Calculando fibonacci de: " + n);
			resultado = calcularFibonacci(n-1) + calcularFibonacci(n-2);
		}
		return resultado;
	}

	public static void main (String [] args){
		Recursividad recursividad = new Recursividad();
		int sumatoria5 = recursividad.calcularSumatoria(5);
		int sumatoria4 = recursividad.calcularSumatoria(4);
		int sumatoria10 = recursividad.calcularSumatoria(10);

		System.out.println("sumatoria4 "+ sumatoria4);
		System.out.println("sumatoria5 "+ sumatoria5);
		System.out.println("sumatoria10 "+ sumatoria10);

		System.out.println("Fibonacci de 20 "+ recursividad.calcularFibonacci(20));
	}

}