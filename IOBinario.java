import java.io.*;
public class IOBinario{
	public void escribir(Carta carta, String nombreArchivo){
		try{
			ObjectOutputStream escritor = new 
			ObjectOutputStream(new FileOutputStream(nombreArchivo));
			escritor.writeObject(carta);
			escritor.close(); 
		}
		catch(IOException e){
			System.err.println("Ocurrió un error al escribir: " + e);
		}
	}

	public Carta leer(String nombreArchivo){
		Carta carta = null;
		try{
			ObjectInputStream lector = new 
			ObjectInputStream(new FileInputStream(nombreArchivo));
			Object objeto = lector.readObject();
			carta = (Carta) objeto;
		}
		catch(IOException e){
			System.err.println("Ocurrió un error al escribir: " + e);
		}
		catch(ClassNotFoundException e){
			System.err.println("Ocurrió un error al realizar casting del objeto: " + e);
		}

		return carta;
	}

	public static void main(String [] args){
		IOBinario io = new IOBinario();
		Carta carta1 = new Carta(10, "Tréboles");
		io.escribir(carta1, "binarios/10Treboles");

		Carta cartaLeida = io.leer("binarios/10Treboles");
		cartaLeida.imprimir();
	}
}