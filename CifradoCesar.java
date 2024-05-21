public class CifradoCesar{
	private String frase;

	public CifradoCesar(String frase){
		this.frase = frase;
	}

	public void setFrase(String frase){
		this.frase = frase;
	}

	public String cifrar(int desplazamiento){
		String cifrado = "";
		String abecedario = "abcdefghijklmnopqrstuvwxyz";
		String abecedarioMayusculas = abecedario.toUpperCase();
		for (int i = 0; i < frase.length(); i++){
			int indice = abecedario.indexOf(""+frase.charAt(i));
			if(indice != -1){
				//indice += desplazamiento;
				//cifrado += (""+abecedario.charAt(indice%abecedario.length()));

				indice += desplazamiento;
				int tam = abecedario.length();
				int posicion = indice < 0 ? tam + indice : indice;
				cifrado += (""+abecedario.charAt(posicion%abecedario.length()));
			}
			else{
				cifrado += frase.charAt(i);
			}
		}
		this.frase = cifrado;
		return cifrado;
	}

	public String descifrar (int desplazamiento){
		desplazamiento = desplazamiento < 0 ? desplazamiento : desplazamiento *-1;
		String cifrado = cifrar(desplazamiento);
		return cifrado;
	}

	public static void main(String [] args){
		CifradoCesar cesar = new CifradoCesar("zebra rayada");
		System.out.println(cesar.cifrar(2));
		System.out.println(cesar.descifrar(2));
	}

}