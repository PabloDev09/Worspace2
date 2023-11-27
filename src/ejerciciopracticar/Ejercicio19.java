package ejerciciopracticar;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		// Acumulator for take the total addition
		double sumaTotal = 0;
		// Number for know how far to go
		int n = 0;
		
		System.out.println("Introduce the numbers that you want to go: ");
		n = sc.nextInt();
		
		for(double i = 1; i <= n; i++) {
			if(i == n) {
				System.out.print(df.format((1/i)) + ".\n");
				}
			else {
				System.out.print((1/i) + ", ");
				}
			sumaTotal += 1/i; 
			}
		System.out.println("The sum ot the first harmonic first " + n + " is: " + df.format(sumaTotal));
	}

}
