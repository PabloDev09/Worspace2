package ejerciciosrecursividad;

import java.util.Scanner;

public class EjerciciosRecursividad {

	public static int sumarDesdeNPrimerosNumeros(int n) {
		if(n == 0) {
			return 0;
		}
		else {
			return n + sumarDesdeNPrimerosNumeros(n - 1);
		}
	}
	
	public static String imprimirDesdeNaPrimerosNumeros(int n) {
		if(n == 1) {
			return "1";
		}
		else {
			return n + ", " + imprimirDesdeNaPrimerosNumeros(n - 1);
		}
	}
	
	public static String imprimirDesdePrimerosNumerosaN(int n) {
		if(n == 1) {
			return "1";
		}
		else {
			return imprimirDesdePrimerosNumerosaN(n - 1) + ", " + n ;
		}
	}
	
	public static int cantidadDigitos(int n) {
		if(n == 0 ) {
			return 0;
		}
		else {
			return 1 + cantidadDigitos(n/10);
		}
	}
	
	public static String imprimirInvertido(int n) {
		if(n == 0) {
			return "";
		}else {
			return n%10 + "" + imprimirInvertido(n/10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero hasta el que se debe sumar: ");
		int n = sc.nextInt();
		
		System.out.println("La suma desde " + n + " hasta 1 es: " + sumarDesdeNPrimerosNumeros(n));
		System.out.println("La lista de numeros desde " + n + " hasta 1 es: " + imprimirDesdeNaPrimerosNumeros(n));
		System.out.println("La suma desde 1 hasta " + n + " es: " + imprimirDesdePrimerosNumerosaN(n));
		System.out.println("La suma desde 1 hasta " + n + " es: " + cantidadDigitos(n));
		System.out.println(imprimirInvertido(n));
	}

}
