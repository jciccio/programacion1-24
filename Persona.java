public class Persona{
	protected String nombre;
	protected int edad;
	protected String cedula;

	public Persona(String nombre, String cedula, int edad){
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}

	public void setCedula(String cedula){
		this.cedula = cedula;
	}

	public void saludar(){
		System.out.println("Hola soy "+ nombre + 
			" mi cedula es: " + cedula + 
			" y tengo " + edad + " años");
	}

	public static void main (String [] args){
		Persona p1 = new Persona("Maria", "1-4324-2342", 23);
		//p1.saludar();
		Persona e1 = new Estudiante("Luis", "1-32232323", 30, "C43920", "Computacion");
		//e1.saludar();
		Persona d1 = new Docente("Jose", "1-389292", 21, "Matematicas", "C12345");
		//d1.saludar();

		Persona [] personas = new Persona[4];
		personas[0] = p1;
		personas[1] = d1;
		personas[2] = e1;
		personas[3] = (Persona) d1;

		System.out.println(personas[0].getClass());
		System.out.println(personas[3].getClass());

		if(personas[3] instanceof Persona){
			System.out.println("Personas[2] es una persona");
		}
		if(personas[3] instanceof Docente){
			System.out.println("Personas[2] es una Docente");
		}

		for(int i = 0 ; i < personas.length; i++){
			if(personas[i] instanceof Docente){
				Docente d = (Docente)personas[i];
				d.saluda2();	
			}
			else{
				personas[i].saludar();
			}

			
		}






	}
}



			// Headfirst Design patterns
			// Factory Pattern
			// Singleton 
			// Decorator