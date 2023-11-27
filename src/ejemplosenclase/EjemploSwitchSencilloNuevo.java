package ejemplosenclase;

import java.util.Scanner;

public class EjemploSwitchSencilloNuevo {

	public static void main(String[] args) {
		int num;
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
			num = sc.nextInt();
			
		resultado = switch (num) {
		case 1 ->
			 num + 1;
		case 2 -> {
			System.out.println("Has introducido el 2");
			yield num+2;
		}
		
		default -> 
			7;
		};
	}
}
