package ejemplosenclase;

import java.util.Scanner;

public class EjercicioSwitchTradicional {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número del 1 al 7(días de la semana): ");
			num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("Es lunes");
			break;
		case 2 : 
			System.out.println("Es martes");
			break;
		case 3 : 
			System.out.println("Es miércoles");
			break;
		case 4 : 
			System.out.println("Es jueves");
			break;
		case 5 : 
			System.out.println("Es viernes");
			break;
		case 6 : 
			System.out.println("Es sabado");
			break;
		case 7 : 
			System.out.println("Es domingo");
			break;
		default:
			System.out.println("El número no esta comprendido entre el 1 y 7");
		}
	}

}
