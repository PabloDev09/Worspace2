package funciones;

import java.util.Scanner;

public class Parametros {
	
	// Mensaje imprime la cadena
	public static void  Mensaje (String cad) {
	
		System.out.println(cad);
		
	}

	 // Suma(100, 200) Suma(x, y)
	
	public static void Suma(int A,int B) {  
	int resultado;
	
	    resultado = A+B;
	    A = A+4;
	    System.out.println("LA SUMA ES: " +resultado);
	}

	// Potencia(10, 2) Potencia(x, y)
	public static void Potencia(int A, int B) {   
		
		int resultado;
	     
		resultado = 1 ;    
	      for (int i=1;  i<=B ; i++) {
	          resultado = resultado * A;
	      }      
	      System.out.println("La potencia de " + A + " ELEVADO A " + B + " ES: " + resultado);
	}

	
	
	public static void LecturaRango (int A, int B) {
	
	int N;
	Scanner sc = new Scanner(System.in);
	
	 	if (A <= B) {
			do {
				
				System.out.println( "Introduce numero");
				
				N= sc.nextInt() ;
				
			}
			while (N >= A && N<=B);
		
			
			System.out.println( "Numero leído:  " + N);		
	 	}
					
		else
			System.out.println(A + " no es < = que  " + B);
		
	 	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1, n2 ,x, y;
		
		Suma(5, 2);
		Potencia(9, 4);
		System.out.println("Introduce un numero: " );
		n1= sc.nextInt() ;
		System.out.println("Introduce otro numero: " );
		n2= sc.nextInt() ;
		Suma (n1, n2);
		Potencia(n1, n2);
	    LecturaRango(1, 10);
		LecturaRango(20, 10);
		LecturaRango(1, 100);
		System.out.println("Introduce  numero de rango inicial: " );
		x= sc.nextInt() ;
		System.out.println("Introduce  numero de rango final: " );
		y= sc.nextInt() ;
	    
		LecturaRango(x, y);

	

	}

}
