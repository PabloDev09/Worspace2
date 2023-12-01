package buclesejercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio5Ingles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		DecimalFormat df = new DecimalFormat(".##");
		
		int n = 0;
		
		System.out.print("Introduzca hasta que numero quieres hacer el cubo: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			System.out.println("Number is: " + i + " and the cube of the " + i + " is: " + (int) Math.pow(i, 3));
		}

	}

}
