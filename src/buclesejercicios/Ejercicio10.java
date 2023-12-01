package buclesejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fila = 0;
		int columna = 0;
		
		System.out.print("Introduzca el numero de filas: ");
			fila = sc.nextInt();
			
		System.out.print("Introduzca el numero de columnas: ");
			columna = sc.nextInt();
		
		for(int i = 1; i<=fila; i++) {
			for(int j = 1; j<=columna; j++) {
				System.out.print("#\t");
			}
			System.out.print("\n");
		}

	}

}
