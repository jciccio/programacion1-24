public class Docente extends Persona{
	private String unidadAcademica;
	private String codigo;

	public Docente(String nombre, String cedula, int edad,  String udAcademica, String codigo){
		super(nombre, cedula, edad);
		this.codigo = codigo;
		this.unidadAcademica = udAcademica;
	}

	public void saludar(){
		super.saludar();
		System.out.println(" y trabajo en la Ud de "+ unidadAcademica);
		System.out.println("Acceder al atributo del papa: " + nombre);
	}

	public void saluda2(){
		
		System.out.println("Hola soy un docente que se llama: " + nombre);
	}

}