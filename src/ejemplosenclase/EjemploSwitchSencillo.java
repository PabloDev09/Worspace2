package ejemplosenclase;

import java.util.Scanner;

public class EjemploSwitchSencillo {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
			num = sc.nextInt();
			
		switch(num) {
		case 1 : 
			System.out.println("Has introducido el 1");
			break;
			
		case 2 : 
			System.out.println("Has introducido el 2");
			break;
			
		default: 
			System.out.println("El número introducido no es correcto");
		}
	}

}
