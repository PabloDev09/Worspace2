package ejerciciopracticar;

import java.util.Scanner;

public class Ejercicio313 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaActual = 0;
		int minutoActual = 0;
		int segundoActual = 0;
		int segundoIncrementar = 0;
		int segundoActualTotal = 0;
		int segundoIncrementadoTotal = 0;
		int horaIncrementado = 0;
		int minutoIncrementado = 0;
		int segundoIncrementado = 0;
		
		System.out.println("Introduzca la hora actual: ");
			horaActual = sc.nextInt();
		System.out.println("Introduzca el minuto actual: ");
			minutoActual = sc.nextInt();
		System.out.println("Introduzca el segundo actual: ");
			segundoActual = sc.nextInt();
		System.out.println("Introduzca los segundos a incrementar: ");
			segundoIncrementar = sc.nextInt();
		
		
		segundoActualTotal = (horaActual * 3600) + (minutoActual * 60) + (segundoActual);
		segundoIncrementadoTotal = segundoIncrementar + segundoActualTotal;
		horaIncrementado = segundoIncrementadoTotal / 3600;
		minutoIncrementado = ((segundoIncrementadoTotal % 3600) / 60);
		segundoIncrementado = ((segundoIncrementadoTotal % 3600) % 60);
		
		if(horaIncrementado > 23) {
			horaIncrementado = horaIncrementado % 24;
		}
		System.out.println("La hora actual-> " + horaActual + ":" + minutoActual + ":" + segundoActual);
		System.out.println("La hora incrementada-> " + horaIncrementado + ":" + minutoIncrementado + ":" + segundoIncrementado);
		
		
		
		
	}

}
