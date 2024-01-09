package funciones.enclase;

import java.util.Scanner;

public class Ejercicio9 {
	
	public static int countdigit(int num) {

        int digitCounter=0;

        while(num>0) {
            digitCounter++;
            num/=10;
        }
        return digitCounter;
    }
	
	static int mcd(int a, int b){
		int max = (a >= b)? a : b;
		int min = (a < b)? a : b;
		int mcd = 0;
		while(min != 0) {
			mcd = min;
			min = max%min;
			max = mcd;
		}
		return mcd = max;
	}
	
	static String simplificar(int numerador, int denominador) {
		int divisor = mcd(numerador, denominador);
		numerador = numerador / divisor;
		denominador = denominador / divisor;
		return numerador + "/" + denominador;
	}
	
	static int rotarderecha(int number){
		int numdigits = countdigit(number);
		int digit = 0;
		int result = 0;
		
		digit = number%10;
		
		result = (int) (digit*Math.pow(10, numdigits-1));
		
		number = number/10;
		
		result = result + number;
		
		number = result;
		
		return result;
	}
	
	static int rotarNderecha(int number, int n){
		if(n > countdigit(number)) {
			n = n % countdigit(number);
		}
		for(int i = 0; i < n ; i++) {
			number = rotarderecha(number);
		}
		return number;
	}
	
	static int rotarNizquierda(int number, int n){
		int numdigits = countdigit(number);
		int digit = 0;
		int result = 0;
		
		if(n > countdigit(number)) {
			n = n % countdigit(number);
		}
		for(int i = 0; i < n ; i++) {
		digit = (int) (number / Math.pow(10, numdigits - 1));
		
		result = digit;
		
		number = (int) (number - (digit * Math.pow(10, numdigits - 1)))* 10;
		
		result = result + number;
		
		number = result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number, n;
		
		System.out.println("Introduzca el numero: ");
		number = sc.nextInt();
		
		System.out.println("Introduzca las veces que los quieras rotar: ");
		n = sc.nextInt();
		
		System.out.println(number + " rotado a la derecha " + n + " veces es: " + rotarNderecha(number, n));
		
		System.out.println(number + " rotado a la izquierda " + n + " veces es: " + rotarNizquierda(number, n));
		
	}

}
