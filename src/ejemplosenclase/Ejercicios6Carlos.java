package ejemplosenclase;

import java.util.Scanner;

public class Ejercicios6Carlos {

	public static void main(String[] args) {
		int x, y;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el valor de x: ");
			x = sc.nextInt();
		System.out.print("Introduzca el valor de y: ");
			y = sc.nextInt();
		
		if((x > 0) && (y > 0)) {
			System.out.print("La coordenada (" + x + "," + y + ") está en el primer cuadrante");
		}
		else if ((x < 0) && (y > 0)) {
			System.out.print("La coordenada (" + x + "," + y + ") está en el segundo cuadrante");
		}
		else if ((x < 0) && (y < 0)) {
			System.out.print("La coordenada (" + x + "," + y + ") está en el tercer cuadrante");
		}
		else if ((x > 0) && (y < 0)) {
			System.out.print("La coordenada (" + x + "," + y + ") está en el cuarto cuadrante");
		}
		else if((x == 0 && y > 0)){
			System.out.print("La coordenada (" + x + "," + y + ") está entre primer y segundo cuadrante");
		}
		else if((x == 0 && y < 0)){
			System.out.print("La coordenada (" + x + "," + y + ") está entre tercer y cuarto cuadrante");
		}
		else if((y == 0 && x > 0)){
			System.out.print("La coordenada (" + x + "," + y + ") está entre primer y cuarto cuadrante");
		}
		else if((y == 0 && x < 0)){
			System.out.print("La coordenada (" + x + "," + y + ") está entre segundo y tercer cuadrante");
		}
		else {
			System.out.print("Está en el eje de coordenadas");
		}
	}

}
