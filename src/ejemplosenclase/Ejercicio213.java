package ejemplosenclase;

import java.util.Scanner;

public class Ejercicio213 {

	public static void main(String[] args) {
		double comidaDiaria, numAnimales, kiloReal, kiloSuficiente, kiloAnimales;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la comida diaria disponible para los animales: ");
			comidaDiaria = sc.nextDouble();
		System.out.print("Introduzca la cantidad de animales: ");
			numAnimales = sc.nextDouble();
		System.out.print("Introduzca la cantidad kilos por animal: ");
			kiloAnimales = sc.nextDouble();
		
		
		
		if(comidaDiaria/numAnimales >= kiloAnimales) {
			kiloReal = comidaDiaria / numAnimales;
			System.out.println("Hay suficiente comida por cada animal, habría una cantidad de: " + kiloReal + " kg para cada animal");
		}else {
			kiloReal = comidaDiaria / numAnimales;
			kiloSuficiente = kiloAnimales - kiloReal;
			System.out.println("No hay suficiente comida por cada animal, faltaría una cantidad de: " + kiloSuficiente + " kg");
		}
	}

}
