import java.io.*;
public class LectorDeArchivos{
	private BufferedReader lector;
	private boolean estaAbierto;


	public LectorDeArchivos(String ruta){
		try{
			lector = new BufferedReader(new FileReader(ruta));
			estaAbierto = true;
		}
		catch(IOException e){
			System.err.println("Ocurrio un error al abrir el arhivo " + ruta + " " + e);
			estaAbierto = false;
		}
	}

	public void cerrar(){
		if(estaAbierto){
			try{
				lector.close();
			}
			catch(IOException e){
				System.err.println("Ocurrio un error al cerrar el archivo " + e);
			}
			estaAbierto = false;
		}
	}

	public String leerLinea(){
		String linea = null; 
		if(estaAbierto){
			try{
				linea = lector.readLine();
			}
			catch(IOException e){
				System.err.println("Ocurrio un error al leer la linea " + e);
				estaAbierto = false;
			}
		}
		return linea;
	}

	public String leerArchivo (){
		String contenido = "";
		if(estaAbierto){
			String linea = "";
			while( ( linea = leerLinea()) != null){
				contenido += linea;
				contenido += "\n";
			}

			/* Codigo equivalente
			String linea = leerLinea();
			while(linea != null){
				contenido += linea;;
				contenido += "\n";
				linea = leerLinea();
			}*/
		}
		return contenido;
	}


	public static void main (String [] args){
		LectorDeArchivos lector = new LectorDeArchivos("LICENSE");
		//System.out.println(lector.leerLinea());
		//System.out.println(lector.leerArchivo());
		String datos = lector.leerArchivo();
		lector.cerrar();
		EscritorDeArchivos escritor = new EscritorDeArchivos("Copia de licencia.txt", false);
		escritor.escribir(datos);
		escritor.cerrar();
	}

}