package buclesejercicios;

import java.util.Scanner;

public class Ejercicio122 {

	public static void main(String[] args) {
		/*
		 * El programa pide una altura y te imprime:
		 * 1 i = 1 j = 1
		 * 23 i = 2 j = 2
		 * 456 i = 3 j = 3
		 * 78910 i = 4 j = 4
		 * 
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		
		int height = 0;
		String tree = "";
		
		System.out.print("Enter the tree height: ");
			height = sc.nextInt();
			
		for(int i = 1; i <= height; i++) {
		
			for(int j = 1; j <= i; j++) {
				tree =  tree + i + " ";
				
			}
			tree = tree + "\n";
		}
		System.out.println(tree);
	}

}
