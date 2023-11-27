package buclesejemplosenclase;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		int max, min;
		
		Scanner sc = new Scanner(System.in);
		
		//Integer tenemos muchos fincionalizades como el valor máximo Integer.MAX_VALUE o mínimo Integer.MAX_VALUE
		// El MAX_VALUE lo ponemos porque al introducir el primer numero va coger el minimo, igual que el MIN_VALUE va a coger la máximo del numero
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		
		System.out.println("Si pones cero parará la suma");
		
		
		
		do {
			System.out.println("Introduce un número distinto de cero: ");
				num = sc.nextInt();
			
			if(num > max && num!=0) {
				max = num;
			}
			
			if(num < min && num!=0) {
				min = num;
			}
			
			sum += num;
		}while(num!=0);
		
		System.out.println("El resultado de la suma es: " + sum);
		System.out.println("El numero máximo es: " + max);
		System.out.println("El numero mínimo es: " + min);
	}
	
	
	
}
