package ejemplosenclase;

import java.util.Scanner;

public class Ejercicio3Carlos {

	public static void main(String[] args) {
		int fecha;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el año: ");
			fecha = sc.nextInt();
			
		if ((fecha % 4 == 0) && (fecha % 100 != 0) 
				|| (fecha % 100 == 0) && (fecha % 400 == 0)){	
			System.out.println(fecha + " es un año bisiesto");
		}else {
			System.out.println(fecha + " no es un año bisiesto");
		}
	}
}
