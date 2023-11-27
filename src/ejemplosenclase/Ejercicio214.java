package ejemplosenclase;

import java.util.Scanner;

public class Ejercicio214 {

	public static void main(String[] args) {
		int num, div, u, d;
		String unidades, decenas, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número comprendido entre el 1 y 99: ");
		num = sc.nextInt();
		
		div = num / 10;
		u = num % 10;
		d = num / 10;
		
		unidades = switch(u) {
		case 0 -> "cero";
		case 1 -> "uno";
		case 2 -> "dos";
		case 3 -> "tres";
		case 4 -> "cuatro";
		case 5 -> "cinco";
		case 6 -> "seis";
		case 7 -> "siete";
		case 8 -> "ocho";
		case 9 -> "nueve";
		default -> "";
		};
		
		decenas = switch(d) {
		case 1 -> "diez ";
		case 2 -> "veinti ";
		case 3 -> "treinta ";
		case 4 -> "cuarenta ";
		case 5 -> "cincuenta ";
		case 6 -> "sesenta ";
		case 7 -> "setenta ";
		case 8 -> "ochenta ";
		case 9 -> "noventa ";
		default -> "";
		};
		
		if(d!=0) {
			if(u == 0) {
				resultado = decenas;
			}else {
			resultado = decenas + " y " + unidades;
			}
		}else if (u == 0 && d == 0) {
			unidades = "cero";
			resultado = unidades;
		}else {
			resultado = unidades;
		}
		System.out.println(num + " es: " + resultado);
		}
	
	}

