package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		//  Declaramos las variables para contar suspensos
		int contSuspensos = 0;
		
		// Declaramos la variable para la nota
		int nota;

		for ( int i = 1; i <= 5; i++) {
			System.out.print("Introduce la nota del alumno : ");
			nota = sc.nextInt();
			if ( nota < 5 ) {
				contSuspensos++;
			}	
		}
		// Mostramos el número de suspensos
		System.out.println("El número de suspensos es: " + contSuspensos);
		
		// Cerramos el Scanner
		sc.close();
		
	}

}
