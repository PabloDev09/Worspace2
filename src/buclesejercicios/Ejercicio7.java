package buclesejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cifra = 0;
		int n = 0;
		int nReal = 0;
		int contador = 1;
		double numDecimal = 0;
		
		System.out.println("Introduzca el numero en binario para pasar a decimal: ");
		n = sc.nextInt();
		
		nReal = n;
		
		while(n / 10 != 0) {
			n = n / 10;
			contador ++;
		}
		for(int i = contador - 1; i >=0; i--) {
			cifra = (int)(nReal / (Math.pow(10, i)));
			
			if(i != 0) {
				cifra = cifra % 10 ;
					if(cifra == 1 || cifra == 0) {
						System.out.print(cifra + "x2^"+ i + " + ");
					}
			}
			else if(i == 0){
				cifra = cifra % 10 ;
				System.out.print(cifra + "x2^"+ i );
			}
			numDecimal += (cifra * Math.pow(2, i));
		}
		System.out.print(" = " + (int) numDecimal);
	}
}

