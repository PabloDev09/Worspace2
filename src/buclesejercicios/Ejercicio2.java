package buclesejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número de vueltas: ");
		num = sc.nextInt();
		
		while(i <= num) {
			System.out.println("Vuelta " + i);
			i++;
		}
	}

}
