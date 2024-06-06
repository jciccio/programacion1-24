public class ListaSimplementeEnlazada {
	private Nodo primero; // Puntero al inicio de la lista (primer nodo de la lista)

	// Necesitamos un Nodo (objeto clase)
	private class Nodo{
		private int valor;
		private Nodo siguiente;

		public Nodo(int valor){
			this.valor = valor;
			this.siguiente = null;
		}
		public String toString(){
			return "Nodo: " + valor + "\n";
		}
	}

	public ListaSimplementeEnlazada(){
		this.primero = null;
	}

	public void agregarAlInicio(int elemento){
		// 1. Crear un nodo y asignarle un valor 
		// 2. Agregar el siguiente al nodo que acabamos de crear
		// 3. Actualizar el primer elemento de la lista

		Nodo nuevo = new Nodo(elemento);
		// Forma 1
		//Nodo primeroViejo = primero;
		//primero = nuevo;
		//nuevo.siguiente = primeroViejo;

		// Forma 2
		nuevo.siguiente = primero;
		primero = nuevo;
	}

	public void agregarAlFinal(int elemento){
		// Queremos crear un nodo
		Nodo nuevo = new Nodo(elemento);
		if(primero == null){ // Si la lista está vacía actualizamos el puntero al inicio
			primero = nuevo;
		}
		else{ // Iterar hasta encontrar el último elemento de la lista
			Nodo actual = primero;
			while(actual.siguiente != null){
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
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

	public Nodo buscarPosicion(int posicion){
		int posicionActual = 0;
		Nodo actual = this.primero;
		while(actual != null  && posicionActual != posicion){
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
			// Nodo final (terminal) el último elemento de la lista
			Nodo anterior = buscarAnterior(posicion);
			if(anterior != null){
				Nodo nuevo = new Nodo(elemento);
				nuevo.siguiente = anterior.siguiente;
				anterior.siguiente = nuevo;
				insertado = true;
			}
		}
		return insertado;
	}


	public String toString(){
		String contenido = "";
		Nodo actual = primero;
		while(actual != null){
			contenido += actual.toString();
			actual = actual.siguiente;
		}
		return contenido;
	}

	public int getElemento(int posicion){
		int retorno = -1;
		Nodo elemento = buscarPosicion(posicion);
		if(elemento != null){
			retorno = elemento.valor;
		}
		return retorno;
	}

	public boolean setElemento(int posicion, int valor){
		boolean asignado = false;
		Nodo nodo = buscarPosicion(posicion);
		if(nodo != null){
			nodo.valor = valor;
			asignado = true;
		}
		return asignado;
	}

	public boolean borrar(int posicion){
		// Casos para borrar un nodo
		// Si es el primer nodo (elemento 0) -> necesitamos actualizar el puntero al inicio
		// Si es un nodo intermedio
		// Si es un nodo final
		boolean borrado = false;
		if(posicion >= 0 && primero != null){
			if(posicion == 0){
				Nodo temporal = primero;
				this.primero = primero.siguiente;
				temporal.siguiente = null;
				temporal = null;
				borrado = true;
			}
			else{
				Nodo actual = buscarAnterior(posicion);
				if(actual != null){
					Nodo borrar = actual.siguiente;
					if(borrar == null || borrar.siguiente == null){
						// Es el nodo final o terminal
						actual.siguiente = null;
						borrar = null;
						borrado = true;
					}
					else{
						// Es nodo intermedio
						actual.siguiente = borrar.siguiente;
						borrar.siguiente = null;
						borrar = null;
						borrado = true;
					}
				}
			}
		}
		return borrado;
	}


	public static void main (String [] args){
		ListaSimplementeEnlazada lse = new ListaSimplementeEnlazada();
		lse.agregarAlInicio(20);
		lse.agregarAlInicio(10);
		lse.agregarAlInicio(5);
		lse.agregarAlInicio(1);
		lse.agregarAlFinal(25);
		lse.insertar(0,13);
		lse.insertar(4,3);
		lse.insertar(40,56);
		lse.insertar(7,40);
		System.out.println(lse);
		lse.borrar(1);
		System.out.println("- - - -");
		System.out.println(lse);
	}
}