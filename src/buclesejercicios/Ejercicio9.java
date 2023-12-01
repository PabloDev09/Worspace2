package buclesejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			System.out.print("Externo: " + i);
			for(int j = 1; j<=2; j++) {
				System.out.print("\tInterno: " + j);
			}
			System.out.print("\n");
		}
	}

}
