public class PaletaColores {
	RGB [] colores;

	public PaletaColores(){
		colores = new RGB[256*256*256];
		int indice = 0;
		for(int r = 0 ; r < 256; r++){
			for(int g = 0 ; g < 256 ; g++){
				for(int b = 0 ; b < 256; b++){
					colores[indice] = new RGB(r,g,b);
					indice++;
				}
			}
		}
	}

	public RGB getColor(int indice){
		RGB color = null;
		if( indice >= 0 && indice < colores.length){
			color = colores[indice];
		}
		return color;
	}
}