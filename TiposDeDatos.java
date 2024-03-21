public class TiposDeDatos {

	public static void main (String args []) {
		System.out.println("Hola esta es la clase de Programacion 1  del 21 de Marzo");	
	
		// Tipo de dato
		// Declarar un nombre para la variable
		// la inicializamos indicando un valor
		// Finalizamos las sentencias con ;
		int numero1 = 12;
		int numero2 = 2;
		int numero3 = numero1 * numero2;
		System.out.println("Numero 1: " + numero1);
		System.out.println("Numero 2: " + numero2);
		System.out.println("Numero 3: " + numero3);

		double numeroReal1 = 3.14;
		double numeroReal2 = 6.012;
		double numeroReal3 = numeroReal1 / numeroReal2;
		System.out.println ("Numero Real - \nNumero 1: " + numeroReal1 + ", \nnumero 2: " + numeroReal2 + " \n\tresultado de division: " + numeroReal3);

		int divisionEntera = 5/2;
		System.out.println(divisionEntera);

		// Casting para convertir un tipo de dato a otro
		double divisionReal = (double)5 / 2;
		System.out.println(divisionReal);

		int numeroEntero4 = (int)5.99999999999;
		System.out.println(numeroEntero4);

	}
}