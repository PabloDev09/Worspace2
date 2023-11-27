package ejerciciosresueltoscarlos;

import java.util.Scanner;

/* Vamos a introducir por teclado un número (entero). Para distinguir si es par o 
 * impar comprobamos el resto de dividir por 2. */
public class Resuelto201 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num; //número introducido por el usuario

      System.out.print("Introduzca un número: ");
      num = sc.nextInt();

      if ((num % 2 == 0) || (num % 3 == 0)) { //si num es divisible por 2 o 3
         System.out.println("El numero es divisible por 2 o 3");
      } else { // si num no es divisible por 2 o 3
         System.out.println("Es impar");
      }
   }
}


