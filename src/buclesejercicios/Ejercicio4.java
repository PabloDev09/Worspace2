package buclesejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int factorial, resultado, i; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el factorial: ");
		factorial = sc.nextInt();
		
		i = factorial;
		resultado = 1;
		while(factorial >= 1) {
			resultado *= factorial;
			System.out.println(resultado);
			factorial--;
		}
		System.out.println("El resultado del factorial de !" + i + " es: " + resultado );
	}

}
