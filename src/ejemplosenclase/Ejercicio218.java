package ejemplosenclase;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio218 {

	public static void main(String[] args) {
		int num1, num2, resultadoReal, resultadoUsuario, operacion;
		
		Random aleatorio = new Random();
		Scanner sc = new Scanner(System.in);
	
		num1 = aleatorio.nextInt(1, 99);
		num2 = aleatorio.nextInt(1, 99);
		operacion = aleatorio.nextInt(1,3);
		
		switch(operacion) {
		case 1 ->{
			System.out.print("Di cual es la suma entre " + num1 + " y " + num2 + ": ");
			resultadoReal = num1 + num2;
		}
		case 2 ->{
			System.out.print("Di cual es la resta entre " + num1 + " y " + num2 + ": ");
			resultadoReal = num1 - num2;
		}
		case 3 ->{
			System.out.print("Di cual es la multiplación entre " + num1 + " y " + num2 + ": ");
			resultadoReal = num1 * num2;
		}
		default->{
			resultadoReal = 0;
		}
		}
		resultadoUsuario = sc.nextInt();
		
		if(resultadoReal == resultadoUsuario) {
			System.out.println("Enhorabuena has acertado el resultado");
		}else {
			System.out.println("Has fallado, lo de las matemáticas no es lo tuyo");
			System.out.println("La solución es: " + resultadoReal);
		}
	
		
		
	}

}
