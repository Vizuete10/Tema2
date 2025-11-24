package bucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable para la altura 
		int N;

		// Pedimos al usuario que introduzca la altura de la figura
		System.out.print("Introduce un número N: ");
		N = sc.nextInt();
		
		        for (int i = 1; i <= N; i++) {

		        	
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j);
		            }


		            for (int j = i - 1; j >= 1; j--) {
		                System.out.print(j);
		            }

		            // Salto de línea al terminar la fila
		            System.out.println();
		        }
				
				// Cerramos el Scanner
				sc.close();
			}
		
	}
