public class PruebaEstudiante {
	public static void main (String [] args){
		Estudiante estudiante1 = new Estudiante();
		Estudiante estudiante2 = new Estudiante();
		Estudiante estudiante3 = new Estudiante();

		estudiante1.saludar();
		estudiante1.bautizar("Mario");
		estudiante1.saludar();
		estudiante1.setEdad(20);
		estudiante1.saludar();

		estudiante2.bautizar("Ignacio");
		estudiante2.setEdad(18);
		estudiante2.saludar();

		estudiante3.bautizar("Maria");
		estudiante3.setEdad(19);
		estudiante3.saludar();

		Estudiante estudiante4 = new Estudiante("JP", 20);
		estudiante4.saludar();
		estudiante4.cumplirAnyos();
		estudiante4.saludar();

		estudiante3.cumplirAnyos();
		estudiante3.cumplirAnyos();
		estudiante3.cumplirAnyos();
		estudiante3.cumplirAnyos();
		estudiante3.cumplirAnyos();
		estudiante3.saludar();
	}
}