package buclesejercicios;

import java.util.Scanner;

public class EjercicioMultiploDe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int contador = 0;
				
		System.out.println("Introduzca el numero mayor de 3 desde donde empezar:");
		n = sc.nextInt();
		
		for(int i = n - (n%3) ; i >= 3; i = i - 3) {
			if(i != 3) {
				System.out.print(i + ", ");
				contador++;
			}
			else {
				System.out.print(i + ". \n");
				contador++;
			}
		}
		System.out.println("Desde " + n + " hasta 3 hay: " + contador + " múltiplos");	
	}
		
}

