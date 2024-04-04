import javax.swing.JOptionPane;

public class PruebaCalculadora{
	public static void main (String args[ ]){
		Interfaz interfaz = new Interfaz();
		double numero1 = interfaz.solicitarNumeroReal("Digite el primer número");
		double numero2 = interfaz.solicitarNumeroReal("Digite el segundo número");

		// Como mostrar una pantalla de dialogo


		// Instancias de la calculadora
		Calculadora c1 = new Calculadora();
		c1.setValorA(numero1);
		c1.setValorB(numero2);
		c1.sumar();
		// En la variable resultado se encuentra la suma de 4.2 y 3.5
		System.out.println(c1.getValorA()+ " + " + c1.getValorB() + " = " + c1.getResultado());

		c1.restar();
		System.out.println(c1.getValorA()+ " - " + c1.getValorB() + " = " + c1.getResultado());
	
		c1.multiplicar();
		System.out.println(c1.getValorA()+ " * " + c1.getValorB() + " = " + c1.getResultado());

		c1.dividir();
		System.out.println(c1.getValorA()+ " / " + c1.getValorB() + " = " + c1.getResultado());
	
		CalculadoraV2 c2 = new CalculadoraV2();
		double resultado = c2.sumar(3.14, 5.28);
		System.out.println("3.14 + 5.28 = " + resultado);

		System.out.println (c2.sumar(5,6));

		System.out.println (c2.sumar(5.6,6));
		System.out.println (c2.sumar(5,6.78));

	/*	resultado = c2.restar(3.14, 5.28);
		System.out.println("3.14 - 5.28 = " + resultado);

		resultado = c2.multiplicar(3.14, 5.28);
		System.out.println("3.14 * 5.28 = " + resultado);

		resultado = c2.dividir(3.14, 5.28);
		System.out.println("3.14 / 5.28 = " + resultado);


		System.out.print("Hola");
		System.out.print("Mundo\n");

		System.out.println("Hola");
		System.out.println("Mundo");*/
	}
}