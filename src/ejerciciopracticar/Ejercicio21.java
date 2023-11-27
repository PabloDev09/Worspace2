package ejerciciopracticar;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
		
		double sumaTotal = 0;
		int n = 0;
		
		System.out.println("Introduce the number: ");
		n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			if(i == n) {
				System.out.println(df.format((5*i - 3)) + ".");
			}
			else {
				System.out.print(df.format((5*i - 3)) + ", ");
			}
			sumaTotal += (5*i - 3);
		}
		System.out.println("The total addition of " + n + " is: " + df.format(sumaTotal));
	}

}
