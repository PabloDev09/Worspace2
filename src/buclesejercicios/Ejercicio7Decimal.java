package buclesejercicios;

import java.util.Scanner;

public class Ejercicio7Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String cadena = "";
		int num = 0;
		int numAux = 0;
		int cifra = 0;
		
		System.out.println("Introduzca el numero decimal para pasar a binario: ");
		num = sc.nextInt();
		
		numAux = num;
		while(numAux != 0){
			cifra = numAux % 2;
			numAux = numAux/2;
			cadena = cifra + cadena;
		}
		System.out.println("El numero decimal" + num + " en binario es: " + cadena);
	}

}
