package buclesejercicios;

import java.util.Scanner;

public class Ejercicio13Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * 		 *  i=1 j=1 1
		 * 		*** i=2 j=1 3
		 * 	   ***** i=3 j=1 5
		 *    ******* i=4 j=1 7
		 * 1, 3, 5, 7 
		*/
		Scanner sc = new Scanner(System.in);
		
		int height = 0;
		int cont = 1;
		String tree = "";
		
		System.out.print("Enter the tree height: ");
			height = sc.nextInt();
			
		for(int i = 1; i <= height; i++) {
			for(int x = 1; x <= height - i; x++) {
				tree = tree + " ";
			}
			for(int j = 1; j <= i; j++) {
				if(j == i) {
					tree = tree + cont;	
				}else{
					tree = tree + cont + " ";
				}
				cont++;
			}
			tree = tree + "\n";
		}
		System.out.println(tree);
	}
		
		}

