package buclesejercicios;

import java.util.Scanner;

public class Ejercicio301 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para parar el proceso indique cero");
		do {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			
			if(num % 2 == 0 && num != 0) {
				System.out.println("Es par");
				}
			else if(num == 0) {
					;
					}
			else {
				System.out.println("Es impar");
				}
			
			if(num > 0 && num != 0) {
				System.out.println("Es positivo");
				}
			else if(num == 0) {
				;
				}
			else {
				System.out.println("Es negativo");
			}
			 
			if(num != 0) {
				System.out.println("El número introducido al cuadrado es: " + Math.pow(num, 2));
			}
			}while(num != 0);
	}

}
