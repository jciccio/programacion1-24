public class PruebaColores{
	private RGB [] colores;
	public PruebaColores(){
		colores = new RGB[10];// [null, null, ..., null]
	}

	public boolean asignarColor(int r, int g, int b, String color, int celda){
		boolean asignado = false;
		if(celda >= 0 && celda < colores.length){
			colores[celda] = new RGB(r,g,b,color);
			asignado = true;
		}
	}

	public void desplegarCelda(int celda){
		if(celda >= 0 && celda < colores.length && colores[celda] != null){
			colores[celda].imprimir();
		}
	}

	public static void main (String [] args){
		String menu = "Seleccione una opción:\n1- Crear Color\n2- Desplegar Color\n3- Salir";
		PruebaColores colores = new PruebaColores();
		Interfaz interfaz = new Interfaz();
		int opcion = 0;
		do{
			opcion = interfaz.solicitarNumeroEntero(menu);
			switch(opcion){ // Procesar la opcion
				case 1: // Crear color
					//Hay que solicitar el R, G, B, indice, Color
					int r = interfaz.solicitarNumeroEntero("Digite el Rojo (R)");
					int g = interfaz.solicitarNumeroEntero("Digite el Verde (G)");
					int b = interfaz.solicitarNumeroEntero("Digite el Azul (B)");
					String nombre = interfaz.solicitarHilera("Digite el nombre");
					int indice = interfaz.solicitarNumeroEntero("Digite el indice (0..9)");
					colores.asignarColor(r,g,b,nombre,indice);
				break;
				case 2:  //Desplegar el color
					int indice = interfaz.solicitarNumeroEntero("Digite el indice (0..9)");
					colores.desplegarCelda(indice);
				break; 
				default:
					if(opcion != 3){
						interfaz.mostrarHilera("La opción digitada no es válida");
					}
			}

		}while(opcion != 3);
	}

}