package ejemplosenclase;

import java.util.Scanner;

public class Ejercicio16Carlos {

	public static void main(String[] args) {
		double tiempo, impuesto, precioTotal; 
		double precio1 = 1;
		double precio2 = 0.8;
		double precio3 = 0.7;
		double precio4 = 0.5;
		int dia;
		String momentoDia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el tiempo de llamada: ");
			tiempo = sc.nextInt();
		System.out.print("Introduzca el día de la semana (1 al 7): ");
			dia = sc.nextInt();
		System.out.print("Introduzca si fue mañana o tarde: ");
			momentoDia = sc.next();
		
		if((tiempo > 0) && (tiempo <=5)){
			if((dia == 7)) {
				impuesto = 0.03;
				precioTotal = tiempo * precio * impuesto;
				System.out.println("El precio total es: " + precioTotal + " €");
			}
		}
		
	}

}
