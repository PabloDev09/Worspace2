package ejerciciosfuncionesvariados;

import java.util.Scanner;

public class Ejercicio7 {
	
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
	
	public static double terminoSen(double n, double x) {
		int signo = 1;
		if(n%2==0)
			signo = 1;
		else
			signo = -1;
		
		return signo * potencia(x, 2 * n + 1)/factorial(2 * n + 1);
	}
	
	public static double funcionSen(double n, double x) {
		double resultadoFuncion = 0.0;
		
		for(double i = 0; i <= n; i++) {
			resultadoFuncion += terminoSen(i, x);
		}
		return resultadoFuncion;
		}
		
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n, x;
	
		System.out.println("Introduzca el valor de angulo: ");
			x = sc.nextDouble();
		System.out.println("Introduzca el valor de precision: ");
			n = sc.nextDouble();
			
		System.out.println(funcionSen(n, x));
		}
	}

