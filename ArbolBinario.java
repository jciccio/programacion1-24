public class ArbolBinario{
	// Nodo raiz  (elemento inicial del árbol)
	// Referencia a la raiz del arbol
	private Nodo raiz;

	private class Nodo{
		private Nodo izq;
		private Nodo der;
		private int elemento;

		// Nodo del árbol
		// Elemento que guarda
		// Dos referencias -> a un hijo izquierdo y derecho
		public Nodo(int elemento){
			this.elemento = elemento;
			this.izq = this.der = null;
		}

		public String toString(){
			return " " + this.elemento;
		}
	}

	public Nodo insertar(int elemento){
		return this.insertar(elemento, this.raiz);
	}
	private Nodo insertar(int elemento, Nodo nodo){
		Nodo nodoNuevo = nodo;
		if(nodo == null){
			// Caso trivial
			// Si el nodo parametro es nulo
			// El nodo es una hoja
			nodoNuevo = new Nodo(elemento);
			if(raiz == null){
				raiz = nodoNuevo;
			}
		}
		else{
			//Caso recursivo (nodo intermedio o la raíz)
			// Nos movemos a la izq o derecha hsta que lleguemos a la hoja
			if(nodo.elemento >= elemento){
				// Nos queremos mover hacia la izquiera
				nodo.izq = insertar(elemento, nodo.izq);
			}
			else{
				// Nos movemos hacia la derecha
				nodo.der = insertar(elemento, nodo.der);
			}
		}
		return nodoNuevo;
	}

	// Hay 3 formas de imprimir
	// Preorden: raiz, subarbol izquierdo, subarbol derecho
	// Postorden: subarbol izq, subarbol derecho y raiz
	// Inorden: subarbol izquierdo, raiz, subarbol derecho
	private void imprimir(Nodo nodo){
		if(nodo != null){
			imprimir(nodo.izq);
			System.out.println(nodo);
			imprimir(nodo.der);
		}
	}

	public void imprimir(){
		System.out.println("- - - Impresión del árbol - - -");
		this.imprimir(raiz);
	}

	public Nodo buscar(int elemento){
		return this.buscar(elemento, raiz);
	}
	private Nodo buscar(int elemento, Nodo nodo){
		Nodo retorno = null;
		if(nodo != null){
			if(elemento == nodo.elemento){
				// Encontre el elemento
				retorno = nodo;
			}
			else if(nodo.elemento > elemento){
				retorno = buscar(elemento, nodo.izq);
			}
			else{
				retorno = buscar(elemento, nodo.der);
			}
		}
		return retorno;
	}

	public int buscarValorMenor(Nodo nodo){
		int menor = nodo.elemento;
		while(nodo.izq != null){
			menor = nodo.izq.elemento;
			nodo = nodo.izq;
		}
		return menor;
	}

	public Nodo borrar(int elemento){
		return borrar(elemento, this.raiz);
	}

	private Nodo borrar(int elemento, Nodo nodo){
		Nodo retorno = null;
		if(nodo != null){
			if(nodo.elemento > elemento){
				// Nos movemos hacia la izquierda
				nodo.izq = borrar(elemento, nodo.izq);
			}
			else if (nodo.elemento < elemento){
				// Nos movemos hacia la derecha
				nodo.der = borrar(elemento, nodo.der);
			}
			else {
				// Encontramos el nodo que queremos borrar :)
				if(nodo.izq == null){
					nodo = nodo.der;
				}
				else if (nodo.der == null){
					nodo = nodo.izq;
				}
				else{ // Tiene dos hijos
					nodo.elemento = buscarValorMenor(nodo.der);
					nodo.der = borrar(nodo.elemento, nodo.der);
				}
			}
			retorno = nodo;
		}
		return retorno;
	}

	public int getLength(){
		return getLength(this.raiz);
	}

	public int getLength(Nodo nodo){
		int contador = 0;
		if(nodo != null){
			contador += getLength(nodo.izq);
			contador += getLength(nodo.der);
			contador++;
		}
		return contador;
	}
	public int getLength2(){
		return getLength2(this.raiz, 0);
	}

	public int getLength2(Nodo nodo, int contador){
		if(nodo != null){
			System.out.println(nodo);
			contador = getLength2(nodo.izq, contador + 1);
			contador = getLength2(nodo.der, contador);
		}

		return contador;
	}

	public int getProfundidad(){
		return getProfundidad(this.raiz) -1;
	}

	public int getProfundidad(Nodo nodo){
		int profundidadIzq = 0;
		int profundidadDer = 0;
		if(nodo != null){
			if(nodo.izq != null){
				profundidadIzq = getProfundidad(nodo.izq);
			}
			if(nodo.der != null){
				profundidadDer = getProfundidad(nodo.der);
			}
		}
		return (profundidadIzq > profundidadDer  ? profundidadIzq : profundidadDer) + 1;
	}


	public static void main (String [] args){
		ArbolBinario ab = new ArbolBinario();
		ab.insertar(25);
		ab.insertar(18);
		ab.insertar(23);
		ab.insertar(15);
		ab.insertar(22);
		ab.insertar(70);
		ab.insertar(50);
		ab.insertar(80);
		ab.imprimir();
		ab.borrar(80);
		ab.imprimir();
		System.out.println("El 15 se encuentra? "+ (ab.buscar(15) != null));
		System.out.println("El tam del arbol es: "+ ab.getLength());
		System.out.println("El tam del arbol es: "+ ab.getLength2());
	}
}