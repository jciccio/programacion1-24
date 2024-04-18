public class PruebasEstructurasRepeticion{
	public static  void main (String args[]){
		int x = 0;
		while(x < 5){
			System.out.println("While: " + x);
			x++;
		}

		int y = 0;
		do{
			// instrucciones que queremos ejecutar
			System.out.println("Do-While: " + y);
			y++;
		} while(y < 5);

		for(int i = 0; i < 5 ; i++){
			System.out.println("For: " + i);
		}

		/*int sumatoria = 0;
		for (int i = 0 ; i <= 5 ; i++){
			sumatoria +=  i ;
		}
		System.out.println(sumatoria);*/

		CalculadoraV2 calculadora = new CalculadoraV2();
		int resultado10 = calculadora.calcularSumatoria(10);
		int resultado5 = calculadora.calcularSumatoria(5); 
		int resultado20 = calculadora.calcularSumatoria(20);
		int resultado0 = calculadora.calcularSumatoria(0);
		int resultadoMenos10 = calculadora.calcularSumatoria(-10);

		System.out.println(resultado5);
		System.out.println(resultado10);
		System.out.println(resultado20);
		System.out.println(resultado0);
		System.out.println(resultadoMenos10);

		int contador = 0;
		for(int i = 0; i < 5 ; i++){
			for(int j = 0; j < 3 ; j++){
				System.out.println("Contador:"+ contador+" For: i=" + i +  " j= " + j);
				contador++;
			}
		}

	}
}