package ejemplosenclase;

import java.util.Scanner;

public class Ejercicios18Carlos {

	public static void main(String[] args) {
		int grados;
		int medidaReal, medidaTransformar, centigrados, fahrenheit, kelvin;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca los grados que deseas transformar: ");
		grados = sc.nextInt();
		System.out.print("Indica en que medida están los grados(Celsius: 1, Kelvin: 2 o Fahrenheit: 3): ");
		medidaReal = sc.nextInt();
		System.out.print("Indica el número según a la medida que lo quieras pasar(Celsius: 1, Kelvin: 2 o Fahrenheit: 3): ");
		medidaTransformar = sc.nextInt();
		
		switch(medidaReal) {
		case 1->{
			switch(medidaTransformar){
			case 2 ->{
				kelvin = grados + 273;
				System.out.println(grados + " Cº son: " + kelvin + " grados Kelvin");
			}
			case 3 ->{
				fahrenheit = (grados * 9/5) +32;
				System.out.println(grados + " Cº son: " + fahrenheit + " grados Fahrenheit");
			}
			}
		}
		case 2->{
			switch(medidaTransformar){
			case 1 ->{
				centigrados = grados - 273;
				System.out.println(grados + " grados Kelvin son: " + centigrados + " Cº");
			}
			case 3 ->{
				fahrenheit = 2 * (grados - 273) + 32;
				System.out.println(grados + " grados Kelvin son: " + fahrenheit + " grados Fahrenheit");
			}
			}
		}
		case 3->{
			switch(medidaTransformar){
			case 1 ->{
				centigrados = (grados - 32) * 5/9;
				System.out.println(grados + " grados Fahrenheit son: " + centigrados + " Cº");
			}
			case 2 ->{
				kelvin = (grados - 32) * 5 / 9 + 273;
				System.out.println(grados + " grados Fahrenheit son: " + kelvin + " grados Kelvin");
			}
			}
		}
		}
	}

}
