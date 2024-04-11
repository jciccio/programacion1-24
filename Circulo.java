public class Circulo{
	// Una constante que reprentaba PI
	// Un método que recibiera por parámetro el diámetro y retornara el área del círculo
	private static final double PI = 3.14159;

	public double calcularArea(double diametro){
		double radio = diametro/2;
		double area = PI * radio * radio;
		return area;
	}
}