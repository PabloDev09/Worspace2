package ejerciciopracticar;

//Import the java utilities for use the Scanner
import java.util.Scanner;

public class PracticeProblemOfTheDay3Nov2 {

	public static void main(String[] args) {
		// Declaration the variables
		int num1, result;
		
		// Declaration the Scanner
		Scanner sc = new Scanner(System.in);
		
		// Scan to the number 
		System.out.print("Introduzca el numero: ");
		num1 = sc.nextInt();
		
		// Obtain the result
		result = 7 - (num1 % 7);
		
		// Print the result
		System.out.print("A " + num1 + " hay que sumarle " + result + " para que sea multiplo de 7");
	}

}
