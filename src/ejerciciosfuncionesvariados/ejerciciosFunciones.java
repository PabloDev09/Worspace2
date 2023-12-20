package ejerciciosfuncionesvariados;

import java.util.Scanner;

public class ejerciciosFunciones {

	static void saludo(String nombre) {
		System.out.println("Hola " + nombre + " ¿Cómo estás? \n");
	}
	
	public static boolean esMultiplo(int num1, int num2) {
		// boolean esMulti = num1 % num2 == 0;
		return num1 % num2 == 0;
	}
	
	public static double temperaturaMedia(double temMaxima, double temMinima) {
		return (temMaxima + temMinima) / 2;
	}
	
	public static double funcionValor(double x) {
		return Math.pow(x, 3) + 2*x - 3;
	}
	
	public static void validarLogin(String usuario, String contrasena) {
		if(usuario.equals("usuario1") && contrasena.equals("asdasd"))
			System.out.println("Ha iniciado sesión satisfactoriamente");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, dias;
		double temMaxima, temMinima, valorX;
		String usuario = "", contrasena = "";
		
		// Procedimiento Ejercicio 1
		System.out.println("Introduzca un nombre por pantalla: ");
			String nombre = sc.next();
		
		saludo(nombre);
		// Cierre Procedimiento Ejercicio 1
		
		// Funcion Ejercicio 2
		System.out.println("Introduzca el primer numero: ");
			num1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
			num2 = sc.nextInt();
		
		if(esMultiplo(num1, num2)) {
			System.out.println(num1 + " es multiplo de " + num2 + "\n");
		}else {
			System.out.println(num1 + " no es multiplo de " + num2 + "\n");
		}
		// Cierre Funcionamiento Ejercicio 2
		
		// Funcion Ejercicio 3
		System.out.println("Introduzca el numero de dias que desea introducir: ");
		dias = sc.nextInt();
		
		for(int i = 1; i <= dias; i++) {
			System.out.println("Introduzca la temperatura maxima del dia " + i + ": ");
				temMaxima = sc.nextDouble();
			System.out.println("Introduzca la temperatura mínima del dia " + i + ": ");
				temMinima = sc.nextDouble();
				
			System.out.println("La temperatura media del dia " + i + " es: " + temperaturaMedia(temMaxima, temMinima) + "\n");
		}
		// Cierre Función Ejercicio 3
		
		// Función Ejercicio 4
		System.out.println("f(x) = x^3 + 2x -3");
		System.out.println("Introduzca el valor de x: ");
			valorX = sc.nextDouble();
			
		System.out.println(funcionValor(valorX) + "\n");
		// Cierre Función Ejercicio 4
		
		// Función Procedimiento Ejercicio 6
		int contador = 0;
		while(!usuario.equals("usuario1") && !contrasena.equals("asdasd") && contador < 3){
			
		System.out.println("Introduzca el usuario: ");
			usuario = sc.next();
		System.out.println("Introduzca la contraseña: ");
			contrasena = sc.next();
			
		contador ++;
		validarLogin(usuario, contrasena);
		}
		System.out.println("Lo has intentado " + contador + " veces \n");
		// Cierre Procedimiento Ejercicio 6
	}

}
