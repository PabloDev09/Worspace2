package ejerciciopracticar;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hormigas, aranas, cochinillas, patasTotal;
		int patasHormigas = 6; 
		int patasAranas = 8;
		int patasCochinillas = 14;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de hormigas encontradas: ");
			hormigas = sc.nextInt();
		System.out.print("Introduzca la cantidad de arañas encontradas: ");
			aranas = sc.nextInt();
		System.out.print("Introduzca la cantidad de cochinillas encontradas: ");
			cochinillas = sc.nextInt();
			
		patasTotal = (hormigas * patasHormigas) + (aranas * patasAranas) + (cochinillas * patasCochinillas);
		
		System.out.println("La cantidad total de patas es de: " + patasTotal + " patas");
	}

}
