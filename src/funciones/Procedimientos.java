package funciones;

public class Procedimientos {
	
	
	public static void NombreProc () {
		
		System.out.println("Procedimiento sin parámetros");
		
	}
	
	public static void NombreProcParametros (int parametro1, String parametro2) {
		
		System.out.println("Procedimiento con parámetros"  + parametro1 + " param2 " + parametro2);
		
	}
	
	
	public static void main(String[] args) {
		
		NombreProc();
		NombreProcParametros(2, "Hola");
		
		
	}
	
	

	

}
