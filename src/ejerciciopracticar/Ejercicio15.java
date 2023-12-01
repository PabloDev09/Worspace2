package ejerciciopracticar;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = 0;
		int n2 = 0;
		int operacion = 1;
		int resultado = 0;
		
		System.out.println("Introduzca el primer numero: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		n2 = sc.nextInt();
		
		while(operacion != 5) {
			System.out.println("Operaciones a realizar");
			System.out.println(" 1. Suma");
			System.out.println(" 2. Resta");
			System.out.println(" 3. Multiplicación");
			System.out.println(" 4. División");
			System.out.println(" 5. Salir");
			
			System.out.println("Introduzca la operación que quiere realizar: ");
			operacion = sc.nextInt();
		
			switch(operacion) {
			case 1:
				resultado = n1 + n2;
				System.out.println("Suma: " + n1 + " + " + n2 + " = " + resultado + "\n");
				break;
			case 2:
				resultado = n1 - n2;
				System.out.println("Resta: " + n1 + " - " + n2 + " = " + resultado + "\n");
				break;
			case 3:
				resultado = n1 * n2;
				System.out.println("Multiplación: " + n1 + " x " + n2 + " = " + resultado + "\n");
				break;
			case 4:
				resultado = n1 / n2;
				System.out.println("División: " + n1 + " : " + n2 + " = " + resultado + "\n");
				break;
			case 5:
				System.out.println("Has salido del bucle");
				break;
			default:
				System.out.println("El numero introducido no es correcto");
			}
		}	
	}

}
