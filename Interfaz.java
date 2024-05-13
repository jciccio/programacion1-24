import javax.swing.JOptionPane;
public class Interfaz{
	
	public double solicitarNumeroReal(String mensaje){
		String numeroHilera = JOptionPane.showInputDialog(mensaje);
		double numero = 0;
		try{
			numero = Double.parseDouble(numeroHilera);
		}
		catch(NumberFormatException e){
			System.err.println("Ocurrio un error al convertir el numero: " + e);
		}
		return numero;
	}

	public int solicitarNumeroEntero(String mensaje){
		String numeroHilera = JOptionPane.showInputDialog(mensaje);
		int numero = 0;
		try{
			numero = Integer.parseInt(numeroHilera);
		}
		catch(NumberFormatException e){
			System.err.println("Ocurrio un error al convertir el numero: " + e);
		}
		return numero;
	}

	public int solicitarString(String mensaje){
		String hilera = JOptionPane.showInputDialog(mensaje);
		return hilera;
	}

	public void mostrarMensaje(String mensaje){
		JOptionPane.showMessageDialog(null, mensaje);
	}

}