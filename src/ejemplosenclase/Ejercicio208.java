package ejemplosenclase;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio208 {

	public static void main(String[] args) {
		// To declare the variables to use
		double a, b ,c, d, x1, x2;
		
		// Create the Scanner
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		// Obtain the 3 variables to use
		System.out.print("Introduzca el valor de la variable a: ");
			a = sc.nextDouble();
			
		System.out.print("Introduzca el valor de la variable b: ");
			b = sc.nextDouble();
			
		System.out.print("Introduzca el valor de la variable c: ");
			c = sc.nextDouble();
		
		// Calculate the d variable
		d = Math.pow(b, 2) - (4 * a * c);
		
		// Use the conditions to know the results
		if(d > 0) {
			x1 = (-b + Math.sqrt(d)) / (2*a);
			x2 = (-b - Math.sqrt(d)) / (2*a);	
				System.out.println("Hay dos resultados que son: ");
				System.out.println("La primera solución es: " + df.format(x1));
				System.out.println("La segunda solución es: " + df.format(x2));
		}else if (d == 0) {
			x1 = -b / (2 * a);
				System.out.println("La única solución es: " + df.format(x1));
		}else {
			System.out.println("No hay solución");
	}
	
	}
}
