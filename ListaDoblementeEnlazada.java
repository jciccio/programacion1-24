public class ListaDoblementeEnlazada{
	private Nodo primero;
	private Nodo ultimo;

	// Necesitamos un Nodo (objeto clase)
	private class Nodo{
		private int valor;
		private Nodo siguiente;
		private Nodo anterior;

		public Nodo(int valor){
			this.valor = valor;
			this.siguiente = null;
			this.anterior = null;
		}
		public String toString(){
			return "Nodo: " + valor + "\n";
		}
	}

	public ListaDoblementeEnlazada(){
		this.primero = this.ultimo = null;
	}

	public void agregarAlInicio(int elemento){
		Nodo nuevo = new Nodo(elemento);
		Nodo primeroViejo = primero;
		nuevo.siguiente = primero;
		this.primero = nuevo;
		if(ultimo == null){
			ultimo = nuevo;
		}
		else{
			primeroViejo.anterior = nuevo;	
		}
	}

	public void agregarAlFinal(int elemento){
		// Queremos crear un nodo
		Nodo nuevo = new Nodo(elemento);
		if(primero == null){ // Si la lista está vacía actualizamos el puntero al inicio
			primero = nuevo;
			ultimo = nuevo;
		}
		else{ 
			Nodo actual = this.ultimo;
			actual.siguiente = nuevo;
			nuevo.anterior = actual;
			this.ultimo = nuevo;
		}
	}

	public Nodo buscarAnterior(int posicion){
		int posicionActual = 0;
		Nodo actual = this.primero;
		while(actual != null  && posicionActual + 1 != posicion){
			posicionActual++;
			actual = actual.siguiente;
		}
		return actual;
	}

	public boolean insertar(int posicion, int elemento){
		boolean insertado = false;
		if(posicion == 0){
			// La posición 0 es la inicial de la lista
			agregarAlInicio(elemento);
			insertado = true;
		}
		else if(posicion > 0 && primero != null){
			// Nodo intermedio (a la mitad)
			// Nodo final (el último elemento de la lista)
			Nodo anterior = buscarAnterior(posicion);
			if(anterior != null){
				Nodo nuevo = new Nodo(elemento);
				nuevo.siguiente = anterior.siguiente;
				anterior.siguiente.anterior  =  nuevo;
				anterior.siguiente = nuevo;
				nuevo.anterior = anterior;
				insertado = true;
				if(anterior == ultimo){
					ultimo = nuevo;
				}
			}
		}
		return insertado;
	}

	public String toString(){
		String contenido = "";
		Nodo actual = primero;
		while(actual != null){
			contenido += actual;
			actual = actual.siguiente;
		}
		return contenido;
	}

	public static void main (String  [] args){
		ListaDoblementeEnlazada lde = new ListaDoblementeEnlazada();
		lde.agregarAlInicio(10);
		lde.agregarAlInicio(8);
		lde.agregarAlInicio(6);
		lde.agregarAlInicio(3);
		System.out.println(lde);
		System.out.println("- - - - ");
		lde.agregarAlFinal(15);
		System.out.println(lde);
	}

}