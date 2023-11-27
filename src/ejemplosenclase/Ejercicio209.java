package ejemplosenclase;

import java.util.Scanner;

public class Ejercicio209 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un numero comprendido entre el 0 y 99999: ");
		num = sc.nextInt();
		
		double div = num / 10;
		if(div < 1) {
			System.out.print("El numero tiene 1 cifra");
		}else if (div < 10) {
			System.out.print("El numero tiene 2 cifras");
		}else if (div < 100) {
			System.out.print("El numero tiene 3 cifras");
		}else if (div < 1000) {
			System.out.print("El numero tiene 4 cifras");
		}else if (div < 10000) {
			System.out.print("El numero tiene 5 cifras");
		}else{
			System.out.print("El numero introducido no está comprendido entre 0 y 99999");
		}
	}

}
