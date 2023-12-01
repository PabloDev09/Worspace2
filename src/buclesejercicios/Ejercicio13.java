package buclesejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura = 0;
		
		System.out.println("Introduzca la altura: ");
		altura = sc.nextInt();
		
		for(int i = 1; i <= altura; i++) {
				
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
