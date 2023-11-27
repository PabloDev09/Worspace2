package ejerciciopracticar;

import java.util.Scanner;
import java.text.DecimalFormat;

public class EjercicioEnClase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
		
		int contador = 1;
		int n = 0;
		int cifra;
		
		
		System.out.println("Introduce the number: ");
		n = sc.nextInt();
		
		// Esto es una variable auxiliar que sirve para no perder datos de una variable que va a ser modificada en un futuro
		int nReal = n;
		
		while(n / 10 != 0) {
			n = n / 10;
			contador ++;
		}
		for(int i = contador; i > 0; i--) {
			
			cifra = (int) (nReal / Math.pow(10, i - 1));
			
			if(cifra >= 10) {
				cifra %= 10;
			}
			if(i > 1) {
				System.out.print(cifra + ", ");
			}
			else {
				System.out.print(cifra + ". \n");
			}
		}
		if(contador == 1) {
			System.out.println("The numbers " + nReal + " has: " + contador + " digit");
		}else{
			System.out.println("The numbers " + nReal + " has: " + contador + " digits");
		}
	}

}
