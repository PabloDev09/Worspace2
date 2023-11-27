package ejemplosenclase;

import java.util.Scanner;

public class Ejercicio211 {

	public static void main(String[] args) {
		int num, c1, c2, c3, c4, d, d1;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un numero comprendido entre el 0 y 9999: ");
		num = sc.nextInt();
		
		double div = num / 10;
		if(div < 1) {
			System.out.println("El numero es capicua");
		}else if (div < 10) {
			System.out.println("El numero tiene 2 cifras");
			c1 = num / 10;
			c2 = num % 10;
			if(c1 == c2) {
				System.out.println("El numero es capicua");
			}else {
				System.out.println("El numero no es capicua");
			}
		}else if (div < 100) {
			System.out.println("El numero tiene 3 cifras");
			c1 = num / 100;
			d = num / 10;
			c2 = d % 10;
			c3 = num % 10;
			if(c1 == c3) {
				System.out.println("El numero es capicua");
			}else {
				System.out.println("El numero no es capicua");
				}
			}
		else if (div < 1000) {
			System.out.println("El numero tiene 4 cifras");
			c1 = num / 1000;
			d = num / 100;
			c2 = d % 10;
			d1 = num / 10;
			c3 = d1 % 10;
			c4 = num % 10;
			if(c1 == c4 && c2 == c3) {
				System.out.println("El numero es capicua");
			}else {
				System.out.println("El numero no es capicua");
			}
			
		}
		else{
		System.out.println("El numero introducido no está comprendido entre 0 y 9999");
			}
	}
}