package funciones.enclase;

import java.util.Scanner;

public class Ejercicio8 {

	static double funcion(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4;
		
		System.out.println("Introduzca el valor de x1: ");
		n1 = sc.nextDouble();
		
		System.out.println("Introduzca el valor de y1: ");
		n2 = sc.nextDouble();
		
		System.out.println("Introduzca el valor de x2: ");
		n3 = sc.nextDouble();
		
		System.out.println("Introduzca el valor de y2: ");
		n4 = sc.nextDouble();
		
		System.out.println("La distancia entre los dos puntos es de: " + funcion(n1, n2, n3, n4));
		
	}

}
