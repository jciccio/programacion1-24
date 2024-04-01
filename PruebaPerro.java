public class PruebaPerro{
	public static void main (String [] args){
		Perro perro1 = new Perro();
		String datosPerro1 = perro1.saludar();
		
		perro1.sentarse();
		System.out.println("Perro1 " + datosPerro1);

		perro1.bautizar("Nacha");
		datosPerro1 = perro1.saludar();
		System.out.println("Perro1 " +datosPerro1);

		Perro perro2 = new Perro("Benito");
		perro2.correr();
		System.out.println("Perro2 " + perro2.saludar());

	}
}