package buclesejercicios;

public class TablaMultiplicar10 {

	public static void main(String[] args) {
		int resultado = 0;
		
				for (int i = 1; i <= 10; i++) {
					System.out.println("\nTabla de multiplicar del " + i);
					resultado = 0;
					for(int j = 1; j <= 10; j++) {
						resultado = i * j;
						System.out.println(i + " x " + j + " = " + resultado);
					}

				}
	}

}
