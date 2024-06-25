import javax.swing.*;
import java.awt.event.*;

public class InterfazGrafica implements ActionListener{
	private JButton botonAbrir;
	private JButton botonGuardar;
	private JTextField textoDeUnaLinea;
	private JTextArea textoMultilinea;

	public InterfazGrafica(){
		JFrame ventana = new JFrame();
		ventana.setLayout(null);
		ventana.setBounds(2200,50,600,600); // x,y, ancho, alto
		
		JButton boton1 = new JButton("Abrir");
		boton1.setBounds(100, 50,100, 25);// x, y, w,h
		boton1.addActionListener(this);
		ventana.getContentPane().add(boton1);


		JButton boton2 = new JButton("Guardar");
		boton2.setBounds(250, 50,100, 25);// x, y, w,h
		boton2.addActionListener(this);
		ventana.getContentPane().add(boton2);

		textoDeUnaLinea = new JTextField();
		textoDeUnaLinea.setBounds(10, 90, 570, 30);
		ventana.getContentPane().add(textoDeUnaLinea);

		textoMultilinea = new JTextArea();
		
		
		JScrollPane scroll = new JScrollPane(textoMultilinea);
		scroll.setBounds(10, 130, 570, 400);

		ventana.getContentPane().add(scroll);

		ventana.setVisible(true);
	}

	public void actionPerformed(ActionEvent evento){
		//System.out.println(evento);
		String nombreDelEvento = evento.getActionCommand();
		System.out.println(nombreDelEvento);
		Object quienLlamo = evento.getSource();
		System.out.println(quienLlamo);
		if(nombreDelEvento.equals("Abrir")){
			abrirArchivo();
		}
		else if(nombreDelEvento.equals("Guardar")){
			guardarArchivo();
		}
	}

	public void abrirArchivo(){
		String ruta = textoDeUnaLinea.getText();
		LectorDeArchivos lector = new LectorDeArchivos(ruta);
		String contenido = lector.leerArchivo();
		textoMultilinea.setText(contenido);
		lector.cerrar();
	}

	public void guardarArchivo(){
		String ruta = textoDeUnaLinea.getText();
		EscritorDeArchivos escritor = new EscritorDeArchivos(ruta, false);
		escritor.escribir(textoMultilinea.getText());
		escritor.cerrar();
	}


	public static void main (String args [] ){
		InterfazGrafica interfaz = new InterfazGrafica();
	}
}

