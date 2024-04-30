public class Ciclos{
	

	//2,3,4,5,6,7,8,9,10
	public boolean esPrimo(int numero){
		boolean primo = true;
		int contador = 2;
		if(numero < 2){
			primo = false;
		}
		while(contador <= numero/2 && primo){
			if(numero % contador == 0){
				primo = false;
			}
			contador++;
		}
		return primo;
	}

	public void imprimirPrimos(int numero){
		for(int i = 0 ; i<= numero; i++){
			if(esPrimo(i)){
				System.out.println(i);
			}
		}
	}

	public int[] generarArregloPrimos(int numero){
		int [] arregloPrimos = new int [numero];
		int contador = 0;
		for(int i = 2 ; i<= numero; i++){
			if(esPrimo(i)){
				arregloPrimos[contador] = i;
				contador++;
			}
		}
		int [] primosLimpio = new int [contador];
		for(int i = 0; i < primosLimpio.length; i++){
			primosLimpio[i] = arregloPrimos[i];
		}
		return primosLimpio;
	}


	public static void main (String [] args){
		Ciclos ciclos = new Ciclos();
		System.out.println(ciclos.esPrimo(11));
		System.out.println(ciclos.esPrimo(-5));
		System.out.println();
		ciclos.imprimirPrimos(1000);

	}

}