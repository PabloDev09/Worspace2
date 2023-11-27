package buclesejercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class EjercicioRefuerzo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String modeloCoche = "";
		String modeloCocheMasBarato = "";
		String modeloCocheMasCaro = "";
		
		int precioCoche = 0;
		int cantidadCoches = 0;
		int masBarato = Integer.MAX_VALUE;
		int masCaro = Integer.MIN_VALUE;
		
		double sumPrecios = 0;
		double mediaPrecios = 0;
		
		System.out.print("Introduzca el precio del coche: ");
		
		precioCoche = sc.nextInt();
		
		System.out.print("Introduzca el modelo del coche: ");
		
		modeloCoche = sc.next();
	
		
		while(precioCoche != 0) {
			if(precioCoche > masCaro) {
				masCaro = precioCoche;
				modeloCocheMasCaro = modeloCoche;
			}
			
			if(precioCoche < masBarato) {
				masBarato = precioCoche;
				modeloCocheMasCaro = modeloCoche;
			}
			
			cantidadCoches ++;
			sumPrecios += precioCoche;
			
			System.out.print("Introduzca el precio del coche: ");
			
			precioCoche = sc.nextInt();
			
			if(precioCoche == 0) {
				break;
			}
			
			System.out.print("Introduzca el modelo del coche: ");
			
			modeloCoche = sc.next();
			
		}
		if(cantidadCoches > 0) {
			mediaPrecios = sumPrecios/cantidadCoches;
			System.out.println("El modelo de coche mas caro es: " + modeloCocheMasCaro + " Precio: " + masCaro + " €");
			System.out.println("El modelo de coche mas caro es: " + modeloCocheMasBarato + " Precio: " + masBarato + " €");
			System.out.println("La media de precios es: " + df.format(mediaPrecios) + " €");
		}
	}

}
