package ejerciciopracticar;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		int edad;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la edad: ");
		edad = sc.nextInt();
		
		if (edad >= 18){
			System.out.println("La persona es adulta");
		}
			if (edad >= 65){
			System.out.println("Además es jubilado");
		}
		else {
			System.out.println("La persona es menor de edad");
				if (edad > 13) {
				System.out.println("Además es un adolescente");
			}
				else if (edad > 3){
				System.out.println("Además es un niño");
			}
				else {
				System.out.println("Además es un bebe");
			}
		}
	}

}
