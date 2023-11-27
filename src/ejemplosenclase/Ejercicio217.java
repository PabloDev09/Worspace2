package ejemplosenclase;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio217 {

	public static void main(String[] args) {
		int num1, num2, resultadoReal, resultadoUsuario;
		
		Random aleatorio = new Random();
		Scanner sc = new Scanner(System.in);
	
		num1 = aleatorio.nextInt(1, 99);
		num2 = aleatorio.nextInt(1, 99);
		
		resultadoReal = num1 + num2;
		
		System.out.println("Cual es el resultado de la suma de " + num1 + " y " + num2 + ":");
		resultadoUsuario = sc.nextInt();
		
		if(resultadoReal == resultadoUsuario) {
			System.out.println("Enhorabuena has acertado el resultado");
		}else {
			System.out.println("Has fallado, lo de sumar no es lo tuyo");
		}
	
		
		
	}

}
