public class RGB{
	private int r;
	private int g;
	private int b;
	private String nombre;

	public int clamp (int limiteInferior, int limiteSuperior, int valor){
		int resultado = valor;
		if(limiteInferior > valor){
			resultado = limiteInferior;
		}
		else if(limiteSuperior < valor){
			resultado = limiteSuperior;
		}
		return resultado;
	}

	public RGB(int r, int g, int b, String nombre){
		this.r = clamp(0,255, r);
		this.g = clamp(0,255, g);
		this.b = clamp(0,255, b);
		this.nombre = nombre;
	}

	public RGB(int r, int g, int b){
		this.r = clamp(0,255, r);
		this.g = clamp(0,255, g);
		this.b = clamp(0,255, b);
	}

	public int getR(){
		return r;	
	}
	public int getG(){
		return g;	
	}
	public int getB(){
		return b;	
	}
	public String getNombre(){
		return nombre;	
	}

	public int calcularValorFuncional(){
		return r + g * 256 + b * 256 * 256;
	}

	public void imprimir(){
		System.out.println(nombre + " = RGB("+ r+","+g+","+b+ ") " + calcularValorFuncional());
	}

	public static void main (String args[]){
		RGB color1 = new RGB(255,10,10, "Rojo");
		color1.imprimir();
	}

}