package buclesejercicios;

import java.util.Scanner;

public class MostrarImparesNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declare and initialize an integer variable n to 0.
		int n = 0;

		// Print a message to the console, prompting the user to input the number of odd numbers they want.
		System.out.print("Enter the number of odd numbers you want: ");

		// Take user input using the Scanner class and assign the entered value to the variable n.
		n = sc.nextInt();

		// Use a for loop to iterate through odd numbers up to 2n - 1.
		for(int i = 1; i<=(n * 2 - 1); i = i+2) {
		    // Check if the next odd number (i + 2) is greater than the last odd number in the sequence (2 * n - 1).
		    if((i + 2) > (2 * n - 1)) {
		        // If true, print the current odd number followed by a period because it is the last number in the sequence.
		        System.out.print(i + ".");
		    } else {
		        // If false, print the current odd number followed by a comma and a space.
		        System.out.print(i + ", ");
		    }
		}
	}

}
