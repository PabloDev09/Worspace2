package buclesejemplosenclase;

import java.util.Scanner;

public class EjemploBucleSuma {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		int max;
		int min;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Si el número es cero acaba el programa.");
		System.out.println("Introduce un número distinto de cero para sumar: ");
		num = sc.nextInt();
		max = num;
		min = num;
		
		while(num != 0) {
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
			sum = sum + num;
			System.out.print("Introduce otro número: ");
			num = sc.nextInt();
		}
		System.out.println("La suma total es: " + sum);
		System.out.println("El máximo es: " + max);
		System.out.println("El minimo  es: " + min);
		}

}
