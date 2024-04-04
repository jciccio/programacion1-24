// Programar una clase Bombillo
// Watts, Estado
// Agregar uno extra
// Metodos set y get
// Quiz # 1
public class Bombillo{
	private int watts;
	private boolean estado;
	private String color;

	public void setWatts(int wattsParametro){
		watts = wattsParametro;
	}
	public void setEstado(boolean estado){
		this.estado = estado;
	}
	public void setColor(String colorParametro){
		this.color = colorParametro;
	}
	public int getWatts(){
		return watts;
	}
	public String getColor(){
		return color;
	}
	public boolean getEstado(){
		return estado;
	}

	public static void main (String [] args){
		Bombillo b1 = new Bombillo();
		b1.setWatts(100);
		b1.setEstado(true);
		b1.setColor("Amarillo");
		System.out.println( b1.getWatts() );
		System.out.println( b1.getEstado() );
		System.out.println( b1.getColor() );
	}
}