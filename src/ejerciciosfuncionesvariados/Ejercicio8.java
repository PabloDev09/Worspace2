package ejerciciosfuncionesvariados;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static double potencia(double n, double x) {
		double resultadoPot = 1;
		for(double i = 0; i < n; i++) {
			resultadoPot += Math.pow(x, i);
		}
		return resultadoPot;
	}
	
	public static double factorial(double n) {
		double resultadoFac = 1;
		for(double i = 1; i<=n; i++) {
			resultadoFac *= i;
		}
		return resultadoFac;
	}

	public static double funcionE(double n, double x) {
		double resultadoFuncion = 0;
		for(double i = 0; i <= n; i++) {
			resultadoFuncion = resultadoFuncion + calcularE(i, x);
		}
		return resultadoFuncion;
	}
	
	public static double calcularE(double n, double x) {
		return potencia(x, n)/factorial(n);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n, x;
	
		System.out.println("Introduzca el valor de angulo: ");
			x = sc.nextDouble();
		System.out.println("Introduzca el valor de precision: ");
			n = sc.nextDouble();
			
		System.out.println(funcionE(n, x));
		}
	}

