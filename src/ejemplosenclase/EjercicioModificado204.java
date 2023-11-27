package ejemplosenclase;

import java.util.*;

public class EjercicioModificado204 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US); 

      System.out.print("Introduzca un número real positivo o negativo: ");
      	double num = sc.nextDouble();
      
      if ((num > 0) && (num < 1)) {
         System.out.println("El número es casi-cero positivo");
      }
      	else if ((num < 0) && (num > -1)) {
      		System.out.println("El número es casi-cero negativo");
      }
      		else if (num == 0) {
      			System.out.println("El número es cero");
      }
      			else {
      				System.out.println("El número no es casi-cero");
      }
   }
}