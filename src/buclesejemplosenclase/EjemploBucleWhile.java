package buclesejemplosenclase;

public class EjemploBucleWhile {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int max;
		int min;
		
		max = i;
		min = i;
		while(i < 10) {
			sum += i;
			i++;
			
			if(i>max) {
				max = i;
			}
			if(i<min) {
				min = i;
			}
		}
		System.out.println("Suma de los numeros de 0 a " + (i - 1) + " es " + sum);
		System.out.println("El máximo es: " + max);
		System.out.println("El minimo es: " + min);
	}

}
