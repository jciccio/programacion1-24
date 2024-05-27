import java.io.*;

public class EscritorDeArchivos{
	private BufferedWriter escritor;
	private boolean estaAbierto;

	// Tipos de ruta:
	// Tipo de ruta relativa: ./HolaMundo.java ./html/class_carta.html
	// Tipo de ruta absoluta: C:\Users\Jose Antonio\Desktop\Progra 1 - 1-24\src\html\class_carta.html
	public EscritorDeArchivos(String ruta, boolean agregarAlFinal){
		abrir(ruta, agregarAlFinal);
	}

	public EscritorDeArchivos(String ruta){
		abrir(ruta, true);
	}

	public void abrir(String ruta, boolean agregarAlFinal){
		try{
			escritor = new BufferedWriter(new FileWriter(ruta, agregarAlFinal));
			estaAbierto = true;
		}
		catch(IOException e){
			System.err.println("Ocurrio un error al abrir el archivo "+  ruta + " " + e);
			estaAbierto = false;
		}
	}
	
	public void cerrar(){
		if(estaAbierto){
			try{
				this.escritor.close();
			}
			catch(IOException e){
				System.out.println("Ocurrio  un error al cerrar el archivo " + e);
			}
			estaAbierto = false;
		}
	}

	public boolean escribir(String datos){
		boolean escrito = false;
		if(estaAbierto){
			try{
				escritor.write(datos);
				escrito = true;
			}
			catch(IOException e){
				System.out.println("Ocurrio un error al escribir en el archivo " + e);
				estaAbierto = false;
			}
		}
		return escrito;
	}


	// Un metodo que nos permita abrir un archivo de texto
	// Un metodo para escribir
	// Un metodo para cerrar

	public static void main (String [] args){
		EscritorDeArchivos escritor = new EscritorDeArchivos("27DeMayo.txt", false);
		escritor.escribir("Voy a  sobreescribir el archivo``\n");
		//escritor.escribir("Hoy es 27 de mayo\n");
		escritor.cerrar();

		EscritorDeArchivos escritor2 = new EscritorDeArchivos("Bombillo.java", true);
		escritor2.escribir("// Esto es un comentario hecho con nuestro EscritorDeArchivos.java");
		escritor2.cerrar();

		EscritorDeArchivos escritor3 = new EscritorDeArchivos("rankings/datos.csv", true);
		escritor3.escribir("pais,provincia,canton,distrito\n");
		escritor3.escribir("Costa Rica,San José,Montes De Oca,San Rafael\n");
		escritor3.escribir("Costa Rica,San José,Montes De Oca,Sabanilla\n");
		escritor3.cerrar();

		EscritorDeArchivos escritor4 = new EscritorDeArchivos("rankings/datos_sin_extension", true);
		escritor4.escribir("pais,provincia,canton,distrito\n");
		escritor4.escribir("Costa Rica,San José,Montes De Oca,San Rafael\n");
		escritor4.escribir("Costa Rica,San José,Montes De Oca,Sabanilla\n");
		escritor4.cerrar();
	}


}