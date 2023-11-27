package buclesejercicios;

import java.util.Scanner;

public class MostraPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("Introduce el número para mostrar pares hasta el cero: ");
		n = sc.nextInt();
		
		for(int i = n; i >= 0; i--) {
			if(i % 2 == 0 && i != 0) {
				System.out.print(i + ", ");
			}
			if(i == 0) {
				System.out.print(i + ".");
			}
			}
	}

}
