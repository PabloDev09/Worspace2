package ejemplosenclase;

import java.util.Scanner;

public class Ejercicio202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
			num1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
			num2 = sc.nextInt();
			
		if(num1 == num2) {
			System.out.println("Los dos números son iguales");
		}else {
			System.out.println("Los dos números no son iguales");
		}
	}

}
