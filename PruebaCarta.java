public class PruebaCarta{
	public static void main (String args[]){
		Carta carta1 = new Carta();
		carta1.setPalo("Corazones");
		carta1.setNumero(10);

		Carta carta2 = new Carta();
		carta2.setNumero(4);
		carta2.setPalo("Treboles");

		System.out.println("Los resultados son:");

		String paloCarta1 = carta1.getPalo();
		int numeroCarta1  = carta1.getNumero(); 

		System.out.println("Carta 1: " + numeroCarta1 + " de " + paloCarta1);

		String paloCarta2 = carta2.getPalo();
		int numeroCarta2  = carta2.getNumero(); 

		System.out.println("Carta 2: " + numeroCarta2 + " de " + paloCarta2);

		Carta carta3 = new Carta();
		System.out.println("Carta 3: " + carta3.getNumero() + " de " + carta3.getPalo());

		Carta carta4 = new Carta();
		System.out.println("Carta 4: " + carta4.getNumero() + " de " + carta4.getPalo());
	}
}