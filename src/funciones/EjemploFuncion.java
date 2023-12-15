package funciones;

public class EjemploFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean cincoEsPar = esPar(5);
		
		boolean seisEsPar = esPar(6);
		
		System.out.println(" ¿El cinco es par?" + cincoEsPar);
		System.out.println(" ¿El seis es par?" + seisEsPar);
	
		
	}
	
	public static double suma(double num1, double num2) {
		double resultado= num1+num2;
		return resultado;
	}
	
	// funcion tenemos que poner el tipo de datos
	// que devolvemos
	
	public static boolean esPar( int numero) {
		
		boolean resultado = (numero%2)==0;	
							// 6%2=0
							//	(0==0) -> true
		
							// 5%2=1
							// (1==0) -> false
		return resultado;
		
	}
	
	// Hacer la función esDivisiblePorTres( int numero)
	
	//Probarla con por ejemplo esDivisiblePorTres(11)
	public static boolean  esDivisiblePorTres(int numero) {
		
		
		return true;
				
	}
	
	
	
	
}
