package funciones;

public class EjemploFuncionEsPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//listaPrimosEntreDosyN(10);
		listaPrimosTotal(6);
		
	}
	
	// Hacer la función esPrimo( int numero)
	// Y luego la probamos en main con 
	// esPrimo(23);

	public static boolean esPrimo(int numero) {
		int contador = 2;
		
		boolean esprimo = true;
		while ((contador<=numero/2) && (esprimo)){
			
			if (numero % contador==0) {
				
				esprimo=false;
			}
			
			contador++;
		
		}
		
		
		return esprimo;
				
	}

	
	//Procedimiento -> cuando no devolvemos nada
	//En java para no devolver nada hay que poner void
	//No tengo que hacer return
	
	// en este procedimiento dado un numero n
	// tenemos que escribir en pantalla los numeros
	// primos que hay entre 2 y n
	// por ejemplo entre 2 y 10 escribiriamos
	// los primos entre 2 y 10 son: 2,3,5,7
	// listaPrimosEntreDosYN(10)
	public static void listaPrimosEntreDosyN (int n) {
				
		for (int i=2; i<=n ; i++) {
			int contador = 2;
			int numero=i;
			boolean esprimo = true;
			while ((contador<=numero/2) && (esprimo)) {
				
				if (numero % contador==0) {
					
					esprimo=false;
				}
				
				contador++;
			
			}
			
			if (esprimo)
				System.out.println(numero);
		}
		
	}
	
	

	
	// En este procedimiento dado un numero totalprimos
	// tenemos que escribir en pantalla los numeros
	// primos que pasamos como parametro
	// dame lo primeros 5 primos
	// los primos primeros será : 2,3,5,7,11
	// listaPrimosTotal(5)
	public static void listaPrimosTotal(int totalprimos) {
				
		int contadortotalprimos=0;
		int siguientenumero=2;
		while(contadortotalprimos<totalprimos) {
			int contador = 2;
			int numero=siguientenumero;
			boolean esprimo = true;
			while ((contador<=siguientenumero/2) && (esprimo)) {
				
				if (numero % contador==0) {
					
					esprimo=false;
				}
				
				contador++;
			
			}
			siguientenumero++;
			
			
			
			if (esprimo) {
				System.out.println(numero);
				contadortotalprimos++;
			}
		}
		
	}
	
	
	
	// En este procedimiento dado un numero totalprimos
	// tenemos que escribir en pantalla los numeros
	// primos que pasamos como parametro
	// dame lo primeros 5 primos
	// los primos primeros será : 2,3,5,7,11
	// listaPrimosTotalUsandoEsPrimo(5)
	// Reutilizar codigo con los modulos
	public static void listaPrimosTotalUsandoEsPrimo(int totalprimos) {
				
		int contadortotalprimos=0;
		int siguientenumero=2;
		while(contadortotalprimos<totalprimos) {
								
			if (esPrimo(siguientenumero)) {
				System.out.println(siguientenumero);
				contadortotalprimos++;
			}
			
			siguientenumero++;
			
			
		}
		
	}
	
	
	
}
