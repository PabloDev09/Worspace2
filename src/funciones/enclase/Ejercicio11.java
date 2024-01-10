package funciones.enclase;

import java.util.Scanner;

public class Ejercicio11 {
	
	public static int countdigit(int num) {

        int digitCounter=0;

        while(num>0) {
            digitCounter++;
            num/=10;
        }
        return digitCounter;
    }
	
	static int quitarPorDetras(int num, int veces) { 
		
		return (int) (num / Math.pow(10, veces));
	}
	
	static int quitarPorDelante(int num, int veces) { 
		int numeroDigitos = countdigit(num);
		
		return (int)(num % Math.pow(10, numeroDigitos - veces));
	}
	
	static int pegarPorDetras(int num, int n) {
		int numeroDigitos = countdigit(n);
		
		return num = (int) (num * Math.pow(10, numeroDigitos)) + n;
	
	}
	
	static int pegarPorDelante(int num, int n) {
		int numeroDigitos = countdigit(num);
		
		n = (int) (n * (Math.pow(10, numeroDigitos)));
		
		return num = num + n;
	}
	
	static int trozoDeNumero(int num, int posicionInicial, int posicionFinal) {
		
		return resultado;
		
	}
	
	static int pasarASegundos(int horas, int minutos, int segundos) {
		
		return segundos = (horas * 3600) + (minutos * 60) + segundos;
		
	}
	
	static String pasarDeSegundos(int segundos) {
		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;
		
		return horas + " horas, " + minutos + " minutos, " + segundos + " segundos";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EL resultado de 534, con 2 digitos a la derecha menos es: " + pasarASegundos(15, 9, 15));
	}

}
