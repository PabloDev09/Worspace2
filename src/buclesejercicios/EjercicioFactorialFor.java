package buclesejercicios;

import java.util.Scanner;

public class EjercicioFactorialFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int factorial;
		int resultado = 1;
		int resultado2 = 1;
		
		System.out.print("Introduzca el numero factorial: ");
		factorial = sc.nextInt();
		
		//Primera manera
		for (int i = factorial; i >= 1; i--){
			resultado *= i;
			System.out.println("Primera manera: " + resultado);
		}
		System.out.println("El resultado de la primera manera del factorial " + factorial + " es: " + resultado);
		
		//Segunda manera
		for(int j = 1; j <= factorial; j++) {
			resultado2 *= j;
			System.out.println("Segunda manera: " + resultado2);
		}
		System.out.println("El resultado de la segunda manera del factorial " + factorial + " es: " + resultado2);
	}

}
