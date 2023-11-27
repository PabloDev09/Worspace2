package ejerciciopracticar;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int segundos, minutos, horas, restante;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca los segundos: ");
			segundos = sc.nextInt();
		
		horas = segundos / 3600;
		restante = segundos % 3600;
		minutos = restante / 60;
		restante = restante % 60;
		segundos = restante;
		
		System.out.println("Son " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
	}

}
