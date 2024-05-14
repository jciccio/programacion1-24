public class Hileras{
	public static void main (String [] args){
		String hilera = "Hola mundo bonito, esto es una prueba de una hilera hola mundo";
		String hileraMayusculas = hilera.toUpperCase();
		System.out.println(hileraMayusculas);
		System.out.println(hilera);
		System.out.println(hilera.equalsIgnoreCase(hileraMayusculas));
		System.out.println(hilera.equals(hileraMayusculas));
		System.out.println(hilera.compareTo(hileraMayusculas));
		System.out.println(hilera.compareTo(hilera));
		System.out.println("hilera.indexOf(bonito) " + hilera.indexOf("bonito"));
		System.out.println("hilera.indexOf(Bonito) " + hilera.indexOf("Bonito"));
		System.out.println("hilera.length() " + hilera.length());
		System.out.println("Bonito " + "     Bonito   ".length());
		System.out.println(hilera.substring(8,14));
		System.out.println(hilera.substring(14));
		String [] partes = hilera.split(" ");
		for(int i = 0 ; i < partes.length; i++){
			System.out.println("Arreglo ["+i+"] " + partes[i]);
		}

		StringBuilder stringDinamico = new StringBuilder("");
		stringDinamico.append("hola");
		stringDinamico.append("hola");
		stringDinamico.append("hola");
		System.out.println(stringDinamico);

		stringDinamico.delete(0,4);
		System.out.println(stringDinamico);
		stringDinamico.insert(4,"adios");
		System.out.println(stringDinamico);

		String nuevoString = new String(stringDinamico);
		System.out.println(nuevoString.replace('a', 'i'));
	}
}