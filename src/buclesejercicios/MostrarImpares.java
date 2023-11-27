package buclesejercicios;

import java.util.Scanner;

public class MostrarImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("Introduce el numero hasta que ha que mostrar impares: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i = i + 2) {
			if(n - 1 != i && i != n ) {
				System.out.print(i + ",");
			}
			
			if(n - 1 == i || i == n) {
				System.out.print(i);
			}
			}
	}

}
