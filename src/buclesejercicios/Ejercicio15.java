package buclesejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int altura = 0;
		String tree = "";
		
		System.out.println("Introduzca la altura: ");
		altura = sc.nextInt();
		
		for(int i = 1; i <= altura; i++) {
			
			int contador = i;
			for(int j = 1; j <= i; j++) {
				if(contador % 2 == 1) {
					tree = tree + 1 ;
				}
				if(contador % 2 == 0) {
					tree = tree + 0;
				}
				contador ++;
			}
			tree = tree + "\n";
		}
		System.out.print(tree);
	}

}
