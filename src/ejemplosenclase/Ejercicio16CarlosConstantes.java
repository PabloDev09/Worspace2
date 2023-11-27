package ejemplosenclase;

import java.util.Scanner;

public class Ejercicio16CarlosConstantes {

    private static final double PRECIO_CINCO_MIN=1;
    private static final double PRECIO_CINCO_OCHO_MIN=0.8;
    private static final double PRECIO_OCHO_DIEZ_MIN=0.7;
    private static final double PRECIO_DIEZ_MIN=0.6;
    
    private static final int RESTA_CINCO_MIN= 5;
    private static final int RESTA_OCHO_MIN= 8;
    private static final int RESTA_DIEZ_MIN= 10;
    
    private static final int CINCO_MIN= 5;
    private static final int OCHO_MIN= 8;
    private static final int DIEZ_MIN= 10;
   public static void main(String[] args) {
       // TODO Auto-generated method stub
	   
       
	    int min,minaux; //número introducido por el usuario
        double precio= 0.0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca los minutos de llamada: ");
        min = sc.nextInt();
   
   
	    if (min<=CINCO_MIN) {
	       
	        precio = min *PRECIO_CINCO_MIN;
	    }
	    else if ( min <= OCHO_MIN) {
	       
	        precio = 5 * PRECIO_CINCO_MIN + (min - RESTA_CINCO_MIN) * PRECIO_CINCO_OCHO_MIN;
	       
	       
	    } else if (min <= DIEZ_MIN) {
	       
	        precio = 5 * PRECIO_CINCO_MIN + 3 * PRECIO_CINCO_OCHO_MIN
	                + (min - RESTA_OCHO_MIN) * PRECIO_OCHO_DIEZ_MIN;
	    } else {
	       
	        precio = 5 * PRECIO_CINCO_MIN +
	                3 * PRECIO_CINCO_OCHO_MIN
	                + 2 * PRECIO_OCHO_DIEZ_MIN
	                + (min - RESTA_DIEZ_MIN)*PRECIO_DIEZ_MIN;
	    }
	   
	   
	    System.out.println("El precio para " + min + " minutos es :" + precio);
	
	   }

}