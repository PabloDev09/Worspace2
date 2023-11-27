package ejerciciopracticar;

//Import the java utilities for use the Scanner
import java.util.Scanner;

public class PracticeProblemOfTheDay3Nov3 {

	public static void main(String[] args) {
		// Declaration the variables
		int n, m, result;
		
		// Declaration the Scanner
		Scanner sc = new Scanner(System.in);
		
		// Scan to the numbers 
		System.out.print("Introduzca el numero: ");
		n = sc.nextInt();
		
		System.out.print("Introduzca el multiplo: ");
		m = sc.nextInt();
		
		// Obtain the result
		result = m - (n % m);
		
		// Print the result
		System.out.print("A " + n + " hay que sumarle " + result + " para que sea multiplo de " + m);
	}

}
