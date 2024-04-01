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

}