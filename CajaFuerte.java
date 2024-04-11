public class CajaFuerte{
	// estaAbierta
	// combinacion

	private boolean estaAbierta; 
	private int combinacion; // 1219

	// Método constructor de clase que recibia parámetros
	// CajaFuerta caja1 = new CajaFuerte(false, 1219);
	public CajaFuerte(boolean abierta, int combinacionCaja){
		estaAbierta = abierta;
		combinacion = combinacionCaja;
	}
	

	// Métodos de tipo Set
	public void setEstaAbierta(boolean estaAbierta){
		this.estaAbierta = estaAbierta;
	}

	public void setCombinacion(int combinacion){
		this.combinacion = combinacion;
	}

	// Métodos de tipo Get
	public boolean getEstaAbierta(){
		return estaAbierta;
	}

	public int getCombinacion(){
		return combinacion;
	}

	public boolean verificarCombinacion(int combinacionPrueba){
		return combinacion == combinacionPrueba;
	}

	public static void main (String args []){
		CajaFuerte caja1 = new CajaFuerte(false, 1219);
		System.out.println(caja1.getCombinacion());
	}

}