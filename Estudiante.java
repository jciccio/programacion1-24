public class Estudiante{

	// Atributos - Características de cualquier objeto
	private String nombre;
	private int edad;


	// Constructor de clase
	public Estudiante (){
		nombre = "Pedro";
		edad = 10;
	}

	// new Estudiante(  "JP",                  20                );
	public Estudiante(String nombreEstudiante, int edadEstudiante){
		nombre = nombreEstudiante;
		edad = edadEstudiante;
	}


	// Métodos - Acciones que llevamos a cabo en la clase
	// público o privado -- Accesibilidad
	// lo que queremos que retorne el método
	// el nombre del método
	// lo que recibe el método para que funcione (parámetros)
	public void saludar(){
		System.out.println("Hola me llamo " + nombre + " y tengo "+ edad);
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