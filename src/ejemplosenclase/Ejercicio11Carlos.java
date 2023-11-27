package ejemplosenclase;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio11Carlos {

	public static void main(String[] args) {
		double renta, rentaAnual, impositivo;
		
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la renta: ");
			renta = sc.nextInt();
			
		if(renta < 10000) {
			impositivo = 0.05;
			rentaAnual = renta * impositivo;
			
			System.out.print("Su renta anual es de " + rentaAnual + " € y tienes un impositivo del 5%");
		}else if((renta >=10000) && (renta < 20001)) {
			impositivo = 0.15;
			rentaAnual = renta * impositivo;
			
			System.out.print("Su renta anual es de " + rentaAnual + " € y tienes un impositivo del 15%");
		}else if ((renta >= 20001) && (renta < 35001)){
			impositivo = 0.20;
			rentaAnual = renta * impositivo;
			
			System.out.print("Su renta anual es de " + rentaAnual + " € y tienes un impositivo del 20%");
		}else if ((renta >= 35001) && (renta < 60001)){
			impositivo = 0.30;
			rentaAnual = renta * impositivo;
			
			System.out.print("Su renta anual es de " + rentaAnual + " € y tienes un impositivo del 30%");
		}else {}
		impositivo = 0.45;
		rentaAnual = renta * impositivo;
		
		System.out.print("Su renta anual es de " + rentaAnual + " € y tienes un impositivo del 45%");
	}

}
