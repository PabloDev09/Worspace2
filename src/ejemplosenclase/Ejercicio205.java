package ejemplosenclase;

import java.util.Scanner;

public class Ejercicio205 {

	public static void main(String[] args) {
		// Inicializamos las variables de numero
		int num1, num2;
		
		// Inicializamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Obtenemos los dos numeros 
		System.out.print("Introduzca el primer número: ");
			num1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
			num2 = sc.nextInt();
		
		// Condicion para mostrar cual es mayor
		if (num1 > num2) {
			System.out.println(num1 + " - " + num2);
		}else if (num2 < num1) {
			System.out.println(num2 + " - " + num1);
		}else {
			System.out.println(num2 + " - " + num1);
		}
	}

}
