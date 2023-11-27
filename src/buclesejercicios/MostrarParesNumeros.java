package buclesejercicios;

import java.util.Scanner;

public class MostrarParesNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Initialize an integer variable n to 0.
		int n = 0;

		// Prompt the user to input the number of pair numbers desired.
		System.out.print("Enter the number of pair numbers you want: ");
		// Take user input and assign it to the variable n.
		n = sc.nextInt();

		// Use a for loop to iterate through pair numbers up to 2n - 1.
		for(int i = 0; i <= (n * 2 - 1); i = i + 2) {
		    // Check if the next odd number (i + 2) is greater than the last odd number in the sequence (2 * n - 1).
		    if((i + 2) > (2 * n - 1)) {
		        // If true, print the current pair number followed by a period because it is the last number in the sequence.
		        System.out.print(i + ".");
		    } else {
		        // If false, print the current pair number followed by a comma and a space.
		        System.out.print(i + ", ");
		    }
		}
	}

}
