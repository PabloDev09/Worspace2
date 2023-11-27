package buclesejercicios;

import java.util.Scanner;

public class Ejercicio304 {
/*
* El programa termina cuando se introduce -1 
* Mostrar el arbol mas alto 
* Crear contador de la etiqueta de cada arbol
*/	
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alturaArbol = 0; 
		int etiquetaArbol = 0; 
		int etiquetaArbolAlto = 0;
		int maxAltura = 0;
		
		do{
			System.out.println("Introduzca la altura del arból " + etiquetaArbol + ": ");
			alturaArbol = sc.nextInt();
			
			if(alturaArbol < 0) {
				;
			}
			else{
				
					if(alturaArbol > maxAltura ) {
						maxAltura = alturaArbol;
						etiquetaArbolAlto = etiquetaArbol;
				}
			}
			etiquetaArbol += 1;
		}	
		while(alturaArbol != -1);
		
		System.out.println("La altura máxima es de: " + maxAltura + " cm, del arbol " + etiquetaArbolAlto );

	}

}
