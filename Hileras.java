public class Hileras{
	public static void main (String [] args){
		String hilera = "Hola mundo bonito, esto es una prueba de una hilera hola mundo";
		
		// Convertir letras mayúsculas
		String hileraMayusculas = hilera.toUpperCase();
		System.out.println(hileraMayusculas);
		System.out.println(hilera);
		// Comparar el contenido de las hileras 
		// sin importar si tienen letras mayúsculas o minúsculas
		System.out.println(hilera.equalsIgnoreCase(hileraMayusculas));
		
		// Comparar hileras tomando en cuenta mayúsculas y minúsculas (retorna bool)
		System.out.println(hilera.equals(hileraMayusculas));

		// Comparar hileras tomando en cuenta mayúsculas y minúsculas (retorna int)
		System.out.println(hilera.compareTo(hileraMayusculas));
		System.out.println(hilera.compareTo(hilera));

		// Buscar contenido dentro de una hilera
		// Retorna la posición inicial donde se encuentra la hilera
		// o un -1 si no se encuentra la búsqueda
		System.out.println("hilera.indexOf(bonito) " + hilera.indexOf("bonito"));
		System.out.println("hilera.indexOf(Bonito) " + hilera.indexOf("Bonito"));
		

		// Obtener el tamaño de una hilera
		System.out.println("hilera.length() " + hilera.length());
		System.out.println("Bonito " + "     Bonito   ".length());
		
		// Obtener un subconjunto de la hilera (desde posicion inclusive, hasta no inclusive)
		System.out.println(hilera.substring(8,14));

		// Obtener una subhilera (desde un punto inclusive hasta el final)
		System.out.println(hilera.substring(14));

		// Obtener un arreglo de hileras dado un separador
		// El separador desaparece en el arreglo resultante
		String [] partes = hilera.split(" ");
		for(int i = 0 ; i < partes.length; i++){
			System.out.println("Arreglo ["+i+"] " + partes[i]);
		}

		// Implementación dinámica de un String
		// No se generan copias
		StringBuilder stringDinamico = new StringBuilder("");
		// Agrega al final de la hilera
		// modificando la variable misma, sin generar copias
		stringDinamico.append("hola"); 
		stringDinamico.append("hola");
		stringDinamico.append("hola");
		System.out.println(stringDinamico);

		// Borra dinámicamente de una hilera de caracteres
		// Desde un punto, hasta otro punto no inclusive
		stringDinamico.delete(0,4);
		System.out.println(stringDinamico);

		// Inserta en la posición 4 de la hilera una cadena de caracteres
		stringDinamico.insert(4,"adios");
		System.out.println(stringDinamico);


		// String estático (como se ha visto en el semestre)
		// El constructor puede recibir un String dinámico
		String nuevoString = new String(stringDinamico);
		// Reemplaza todas las apariciones
		// de la letra a por i (todas sin excepción)
		System.out.println(nuevoString.replace('a', 'i'));
	}
}