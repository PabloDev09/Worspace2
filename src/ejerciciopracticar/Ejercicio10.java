package ejerciciopracticar;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Suponemos que es primo
		boolean esPrimo = true;
		int n = 0;
		
		System.out.print("Introduce el numero: ");
		n = sc.nextInt();

		for(int i = 2; i <= n / 2 && esPrimo; i ++) {
			// si encontramos un numero entre el 2 y el (n - 1) que divida a n será primo
			if(n % i == 0) {
				esPrimo = false;
				// Break no es la manera correcta
				//break
			}
		}
		if(esPrimo) {
			System.out.println("El numero " + n + " es primo");
		}else {
			System.out.println("El numero " + n + " no es primo");
		}
	}

}
