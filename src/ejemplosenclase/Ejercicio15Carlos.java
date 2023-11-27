package ejemplosenclase;

import java.util.Scanner;

public class Ejercicio15Carlos {

	public static void main(String[] args) {
		int alumnos, costo, costoTotal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de alumnos: ");
			alumnos = sc.nextInt();
		
		if(alumnos >= 100) {
				costo = 65;
				costoTotal = alumnos * costo;
				
				System.out.print("Su costo total es de " + costoTotal + " € y tienes un costo por cada alumno de " + costo + " €");
			}
		else if((alumnos >= 50) && (alumnos <= 99)) {
				costo = 65;
				costoTotal = alumnos * costo;
				
				System.out.print("Su costo total es de " + costoTotal + " € y tienes un costo por cada alumno de " + costo + " €");
				
			}
			else if ((alumnos >= 30) && (alumnos <= 49)){
				costo = 65;
				costoTotal = alumnos * costo;
				
				System.out.print("Su costo total es de " + costoTotal + " € y tienes un costo por cada alumno de " + costo + " €");
			}
			else {
				System.out.print("El costo total es de : 4000 €");
			}


	}

}
