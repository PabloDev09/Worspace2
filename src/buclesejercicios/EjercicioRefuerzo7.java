package buclesejercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class EjercicioRefuerzo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int multiplicador = 1;
		int numero;
		int resultado;
		
		
		System.out.print("Introduce el numero a multiplicar: ");
		
		numero = sc.nextInt();
		
		System.out.println("La tabla del " + numero + " es: ");
		while(multiplicador <= 10) {
			resultado = numero * multiplicador;
			System.out.println(numero + " x " + multiplicador + " = " + resultado);
			multiplicador++;	
		}
	}
}
