package ejemplosenclase;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise215 {

	public static void main(String[] args) {
		// To declare the variable to use
		double base, altura, area;
		// To declare the decimals to use
		DecimalFormat df = new DecimalFormat("#.00");
		
		// To declare the Scanner
		Scanner sc = new Scanner(System.in);
		
		// Obtain the base and the high of the triangle 
		System.out.print("Introduzca la base del triangulo: ");
			base = sc.nextDouble();
		System.out.print("Introduzca la altura del triangulo: ");
			altura = sc.nextDouble();
			
		// Conditions for not do nothing if the variables are negatives
		if(base >= 0 && altura >= 0) {
			area = (base * altura) / 2;
			System.out.println("El area del triangulo es: " + area + " cm2");
		}else {
			System.out.println("Los valores introducidos no pueden ser negativos");
		}
	}

}
