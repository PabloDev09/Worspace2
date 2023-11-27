package ejerciciopracticar;

//Import the java utilities for use the Scanner
import java.util.Scanner;

public class PracticeProblemOfTheDay3Nov1 {

	public static void main(String[] args) {
		// Create the variables
		int can1, can2, sum;
				
		// Create the scanner
		Scanner sc = new Scanner(System.in);
				
		// Obtain the two numbers with the scanner
		System.out.print("Introduce el primer numero: ");
			can1 = sc.nextInt();
		
		System.out.print("Introduce el primer numero: ");
			can2 = sc.nextInt();
	
		// Obtain and print the result
		sum = can1 + can2;
			
		System.out.print("El resultado de la suma: " + sum);
			
	}

}
