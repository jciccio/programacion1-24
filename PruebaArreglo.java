public class PruebaArreglo{

	public void imprimirArreglo(int [] arreglo){
		for(int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + "\t");
		}
		System.out.println();
	}


	public static void main (String [] args){
		PruebaArreglo aInstancia = new PruebaArreglo();

		int [] arreglo1 = new int [10];
		aInstancia.imprimirArreglo(arreglo1);

		arreglo1[0] = 15;
		aInstancia.imprimirArreglo(arreglo1);

		arreglo1[4] = 6;
		arreglo1[8] = 9;
		aInstancia.imprimirArreglo(arreglo1);

		arreglo1[8] = 9999;
		aInstancia.imprimirArreglo(arreglo1);

		int y = arreglo1[8];
		System.out.println ("Mi variable y es: "+ y);

		int [] arreglo2 = new int[10];
		int valor = 2;
		for(int i = 0; i < arreglo2.length; i++){
			arreglo2[i] = valor;
			valor *= 2;
		}
		arreglo2[0] = 40;
		aInstancia.imprimirArreglo(arreglo2);

	}
}