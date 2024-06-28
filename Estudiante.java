public class Estudiante extends Persona{

	// Atributos - Características de cualquier objeto
	private String carne;
	private String carrera;

	// Constructor de clase
	public Estudiante (String nombre,  
		String cedula,int edad, String carne, String carrera){
		
		super(nombre, cedula, edad);
		this.carne = carne;
		this.carrera = carrera;
	}

	

	// Métodos - Acciones que llevamos a cabo en la clase
	// público o privado -- Accesibilidad
	// lo que queremos que retorne el método
	// el nombre del método
	// lo que recibe el método para que funcione (parámetros)
	public void saludar(){
		System.out.println("Hola me llamo " + nombre + " y tengo "+ edad + " y estudio "+ carrera);
	}

	public void bautizar (String nombreEstudiante){
		nombre = nombreEstudiante;
	}

	public void setEdad (int edadEstudiante){
		edad = edadEstudiante;
	}

	public void cumplirAnyos(){
		edad = edad + 1;
	}









}