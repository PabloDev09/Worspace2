package ejerciciopracticar;

import java.util.Scanner;


public class censusConse {

		public static String revert(int num) {
		
		String nReverse = ""; 
		
		while(num > 0) {
			nReverse = nReverse + "" + (num % 10);
			num = num / 10;
		}
		return nReverse;
	}
		
		public static String deleteNID(int num, int n) {
			
			String nDeleteId = ""; 
			int counter = 0;
			int numAux = num;
			int figure = 0;
			
			while(num > 0) {
				num = num / 10;
				counter++;
			}
			
			for(int i = 1; i<=counter; i++) {
				figure = numAux / (int) Math.pow(10, i - 1);
				figure = figure % 10;
				if(i != n) {
					nDeleteId = figure + "" + nDeleteId;
				}
			}
			return nDeleteId;
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int nDigit = 0;
		String nDelete = "";
		
		System.out.println("Introduce a number: ");
		n = sc.nextInt();
		System.out.println("Introduce a digit to delete: ");
		nDigit = sc.nextInt();
		
		nDelete= deleteNID(n, nDigit );
		
		System.out.println("The number without the " + nDigit + " digit is: " + nDelete);
	}

}

