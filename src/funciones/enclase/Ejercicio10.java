package funciones.enclase;

import java.util.Scanner;

public class Ejercicio10 {

	static String rangedPrimeList(int num1, int num2) {
		int max = 0;
		int min = 0;
		boolean isPrime = true;
		String primeList = "";
		
		if(num1 >= num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		for(int i = min; i <= max; i++) {
			
			for(int j = 2; j < i; j++) {	
				if(i % j == 0) {
					isPrime = false;
				}
			}
		if(isPrime) {
			primeList = primeList + i + ", ";
		}
		isPrime = true;
		}
		
		return primeList;
	}
	static String rangedNPrimeList(int n1, int n2, int n) {
		int max = 0;
		int min = 0;
		int count = 0;
		boolean isPrime = true;
		String primeList = "";
		
		if(n1 >= n2) {
			max = n1;
			min = n2;
		}else {
			max = n2;
			min = n1;
		
			
		for(int i = min; i <= max; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
				}
			}
			
			if(isPrime && count < n && count + 1 != n) {
				primeList = primeList + i + ", ";
				count++;
			}else if(isPrime && (count + 1 == n)) {
				primeList = primeList + i + ".";
				count++;
			}
			isPrime = true;
		}
	}
		
		return primeList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1, n2, veces;
		
		System.out.println("Introduzca el primer numero del rango:");
			n1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero del rango:");
			n2 = sc.nextInt();
		System.out.println("Introduzca el número de primos que quiere:");
			veces = sc.nextInt();
		
		System.out.println("El rango de primos entre " + n1 + " y " + n2 + " es: " + rangedPrimeList(n1, n2));
		
		System.out.println("Los "+ veces + " primeros primos entre " + n1 + " y " + n2 + " es: " + rangedNPrimeList(n1, n2, veces));
	}

}
