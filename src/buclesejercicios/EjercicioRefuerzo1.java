package buclesejercicios;

import java.util.Scanner;

public class EjercicioRefuerzo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombreAlumno = ""; 
		String nombreAlumnoMax = ""; 
		String nombreAlumnoMin = ""; 
		String nombreCurso = "";
		int notaAlumno = 0;
		double sumNotas = 0;//Acumulador
		double notaMedia;
		int minNota = 10;//Minimo
		int maxNota = 0;//Maximo
		int cantidadAlumnos = 0;//Contador
		
		System.out.print("Introduzca el curso: ");
		nombreCurso = sc.nextLine();
		
		System.out.println("Introduzca el nombre del alumno: ");
		nombreAlumno = sc.next();	
		
		System.out.println("Introduzca la nota del alumno: ");
		notaAlumno = sc.nextInt();
		
		while(!nombreAlumno.equals("fin")) {
			
			sumNotas += notaAlumno;
			cantidadAlumnos++;
			
			if(notaAlumno > maxNota) {
				maxNota = notaAlumno;
				nombreAlumnoMax = nombreAlumno;
			}
			if(notaAlumno < minNota) {
				minNota = notaAlumno;
				nombreAlumnoMin = nombreAlumno;
			}
			
			System.out.println("Introduzca el nombre del alumno: ");
			
			nombreAlumno = sc.next();	
			
			if(nombreAlumno.equals("fin")) {
				break;
			}
		
			System.out.println("Introduzca la nota del alumno: ");
			
			notaAlumno = sc.nextInt();
			
		}
		if(cantidadAlumnos - 1 > 0) {
		notaMedia = (sumNotas)/cantidadAlumnos - 1;
		System.out.println("Curso: " + nombreCurso);
		System.out.println("Alumno con máxima nota: " + nombreAlumnoMax + " Nota: " + maxNota);
		System.out.println("Alumno con mínimo nota: " + nombreAlumnoMin + " Nota: " + minNota);
		System.out.println("Nota media del curso: " + notaMedia);
		}
	}
}
