package funciones;

import java.util.Scanner;

public class ProgramaMedia {
	
							//	parámetros formales
	public static double media( int x , int y ) {
	
	double calculo;
	
	calculo = (double) (x + y)  / 2;    
	return calculo;
	//También se puede poner Return  ((x + y)  / 2)
	}

	public static double constanteSiete()
	{
		return 7.0;
	}
	
	public static double funcionPow(int base, int exponente) {
			double resultado = 1;
			
			for(int i = 1; i <= exponente ;i++) {
				resultado *= base;
			}
			return resultado;
	}
	
	public static double factorial(int n) {
		double resultado = 1;
		for(int i = 1; i<=n; i++) {
			resultado *= i; 
		}
		return resultado;
	}
	
	public static int sumaNumeroEnRango(int min, int max) {
		int resultado = 0;
			for(int i = min; i <= max; i++) {
				resultado += i;
			}
		return resultado;
	}
	
	public static int sumaNumeroParesEnRango(int min, int max) {
		int resultado = 0;
			for(int i = min+(min%2); i <= max; i = i + 2) {
				resultado += i;
			}
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2, factorial, min, max, resultSuma, min1, max1, resultSumaPares;
		double result, resultFactorial;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la base");
		num1= sc.nextInt();
		
		System.out.println( "Dame el exponente");
		num2= sc.nextInt();

		result=funcionPow(num1,num2);

	 //parámetros ACTUALES O REALES n1 y n2

		System.out.println( "El resultado es:" + result) ;

		System.out.println( "Introduce el factorial");
		factorial= sc.nextInt();
		
		resultFactorial = factorial(factorial);
		
		System.out.println( "El factorial es:" + resultFactorial) ;
		
		System.out.println("Dame el minimo");
		min= sc.nextInt();
		
		System.out.println( "Dame el maximo");
		max= sc.nextInt();
		
		resultSuma = sumaNumeroEnRango(min,max);
		
		System.out.println( "La suma es:" + resultSuma) ;
		
		System.out.println("Dame el minimo");
		min1= sc.nextInt();
		
		System.out.println( "Dame el maximo");
		max1= sc.nextInt();
		
		resultSumaPares = sumaNumeroParesEnRango(min1,max1);
		
		System.out.println( "La suma de pares es:" + resultSumaPares) ;
	}

}
