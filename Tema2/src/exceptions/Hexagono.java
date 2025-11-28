package exceptions;

import java.util.Scanner;

public class Hexagono {

	public static void main(String[] args) {

		// Creacion del Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitar la longitud del lado del hexagono al usuario
		System.out.println("Introduce la longitud del lado del hexágono: ");
		int lado;
		lado = sc.nextInt();

		// ---------------------------
		// Parte superior del hexágono
		// ---------------------------
		
		for (int i = 0; i < lado; i++) {
			
			// Numero de espacios que se imprimen al principio de cada fila
			
			int espaciosPrincipio;
			
			espaciosPrincipio = lado -1 - i;
			
			// Numero de asteriscos que se imprimen en cada fila
			
			int asteriscos;
			
			asteriscos = lado + 2 * i ;
			
			// Imprimir los espacios al principio de la fila
			
			for (int espacioActual = 1; espacioActual <= espaciosPrincipio; espacioActual++) {
				System.out.print("  ");
			}
			
			// Imprimir los asteriscos de la fila
			
			for (int asteriscoActual = 1; asteriscoActual <= asteriscos; asteriscoActual++) {
				System.out.print("* ");
			}
			
			// Salto de linea al final de la fila
			System.out.println();
			
			
		}
		// ----------------------------------
		// Parte inferior del hexágono
		// ----------------------------------
		
		// Empezamos en (lado-2) porque la fila del medio ya la hemos impreso en la parte superior
		
		for (int j = lado -2; j >= 0; j--) {
			
			// Numero de espacios que se imprimen al principio de cada fila
			int espaciosPrincipio2;
			espaciosPrincipio2 = lado -1 - j;
			
			// Numero de asteriscos que se imprimen en cada fila
			int asteriscos2;
			asteriscos2 = lado + 2 * j ;
			
			// Imprimir los espacios al principio de la fila
			for (int espacioActual2 = 0; espacioActual2 < espaciosPrincipio2; espacioActual2++) {
				System.out.print("  ");
			}
			
			// Imprimir los asteriscos de la fila
			for (int asteriscoActual2 = 0; asteriscoActual2 < asteriscos2; asteriscoActual2++) {
				System.out.print("* ");
			}
			
			// Salto de linea al final de la fila
			System.out.println();
			
			
		}
		
	}
}
