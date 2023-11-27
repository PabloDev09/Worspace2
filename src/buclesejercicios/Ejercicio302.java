package buclesejercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio302 {

	public static void main(String[] args) {
		DecimalFormat formato = new DecimalFormat("#.00");
		Scanner sc = new Scanner(System.in);
		
		double mediaEdades = 0, sumEdades = 0;
		int edad = 0, numAlumnos = 0, numMayorEdadAlumnos = 0;
		
		System.out.println("Si la edad es negativa el programa de detendrá");
		
		do {
			System.out.println("Introduzca la edad: ");
			edad = sc.nextInt();
			if(edad < 0) {
				;
			}else {
				if(edad >= 18) {
					// Contamos el numero de alumnos de mayores de edad
					numMayorEdadAlumnos++;
					}
			//Acumulamos edades sumando
			sumEdades += edad;
			//Contamos el numero de alumnos
			numAlumnos++;
			}
		}while(edad >= 0);
		//Los datos se obtienen despues del bucle
		mediaEdades = sumEdades/numAlumnos;
		
		System.out.println("La suma de las edades es de: " + sumEdades + " años");
		System.out.println("La media de las edades es de: " + formato.format(mediaEdades) + " años");
		System.out.println("Hay un total de: " + numAlumnos + " alumnos");
		System.out.println("Hay un total de: " + numMayorEdadAlumnos + " alumnos mayores de edad");
	}
}
