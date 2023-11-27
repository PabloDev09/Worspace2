package ejerciciopracticar;

// Import the java utilities for use the Scanner
import java.util.Scanner;

public class PracticeProblemOfTheDay3Nov {

	public static void main(String[] args) {
		// Create the variables
		float firstScore, secondScore, thirdScore, average;
		int wholeAverage;
		
		// Create the scanner
		Scanner sc = new Scanner(System.in);
		
		// Obtain the three numbers with the scanner
		System.out.print("Insert the first score: ");
			firstScore = sc.nextFloat();
		
		System.out.print("Insert the second score: ");
			secondScore = sc.nextFloat();
		
		System.out.print("Insert the third score: ");
			thirdScore = sc.nextFloat();
			
		// Calculate the result from the three scores with decimals
		average = (firstScore + secondScore + thirdScore) / 3;
		
		// Print the result with decimals 
		System.out.println("The half score with decimals is: " + average);
		
		// Conversion from the result with decimals to without decimals
		wholeAverage = (int) average;
		
		// Print the result without decimals 
		System.out.println("The half score without decimals is: " + wholeAverage);
	}

}
