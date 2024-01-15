package ejerciciosrecursividad;

import java.util.Scanner;

public class EjerciciosRecursividad {
	
	public static int sumarDesdeNPrimerosNumerosAux(int n, int y) {
		if(n == 0) {
			return y;
		}
		else {
			return sumarDesdeNPrimerosNumerosAux(n - 1, n + y);
		}
	}
	
	public static int sumarDesdeNPrimerosNumeros(int n) {
		return sumarDesdeNPrimerosNumerosAux(n, 0);
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
	
	private static int reverseNumberAux(int n, int result) {
		int digit = 0;
		if(n == 0) {
			return result;
		}else {
			digit = n%10;
			result = digit + result*10;
			n = n/10;
			
			return reverseNumberAux(n, result);
		}
	}
	
	public static int reverseNumber(int n) {
		return reverseNumberAux(n, 0);
	}
	
	public static int terminoFibonacci(int n) {
		if(n <= 1) {
			return 1;
		}
		else {
			return terminoFibonacci(n - 1) + terminoFibonacci(n - 2);
		}
	}
	
	public static int maximoComunDivisor(int n, int x) {
		if(x == 0) {
			return n;
		}else {
			return maximoComunDivisor(x, n%x);
		}
	}
	
	public static int maximoComunDivisorMejorada(int n, int x) {
		if(n <= x) {
			return maximoComunDivisor(x, n);
		}else {
			return maximoComunDivisor(x, n%x);
		}
	}
	
	static int terminoFibonacciAux(int n, int an_2, int an_1) {
		int an_2aux, an_1aux;
		
		if(n == 2) {
			return an_2 + an_1;
		}else {
			an_1aux = an_2;
			an_2aux = an_2 + an_1;
			return terminoFibonacciAux(n - 1 , an_2aux, an_1aux);
		}
	}
	static int terminoFibonacciMejorado(int n) {
		return terminoFibonacciAux(n, 1, 1);
	}
	
	public static int minimoComunMultiplo(int n, int x) {
		return (n * x) / maximoComunDivisor(n, x);
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
		System.out.println(terminoFibonacci(6));
		System.out.println(maximoComunDivisorMejorada(9,9));
		System.out.println(minimoComunMultiplo(20, 16));
		System.out.println(terminoFibonacciMejorado(6));
	}

}
