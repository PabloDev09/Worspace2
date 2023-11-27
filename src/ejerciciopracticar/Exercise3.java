package ejerciciopracticar;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise3 {

	public static void main(String[] args) {
		int entradasInfantil, entradasAdulto;
		double precioInfantil = 15.50;
		double precioAdulto = 20;
		double precioTotal, descuento;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Introduzca la cantidad de entradas infantiles a comprar: ");
			entradasInfantil = sc.nextInt();
		System.out.print("Introduzca la cantidad de entradas de adulto a comprar: ");
			entradasAdulto = sc.nextInt();
			
		precioTotal = (precioAdulto * entradasAdulto) + (precioInfantil * entradasInfantil);
		descuento = precioTotal >= 100 ? (precioTotal * 0.05) : 0;
		precioTotal = precioTotal - descuento;
		
		System.out.println("El descuento que se aplicara será de: " + df.format(descuento) + " €");
		System.out.println("El precio total de todas las entradas es de: " + df.format(precioTotal) + " €");

	}

}
