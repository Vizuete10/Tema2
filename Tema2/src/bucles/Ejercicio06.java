package bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable para la altura y altura
		int N;

		// Pedimos al usuario que introduzca la altura de la figura
		System.out.print("Introduce un número N para la altura y base del triángulo: ");
		N = sc.nextInt();

		// Comprobamos que la altura y la base son mayores que 1
		if (N < 1 ) {
			System.out.println("La altura y la base deben ser números enteros positivos mayores que 0.");
			} else {
				// Bucle para las filas
				for (int i = 1; i <= N; i++) {
					
					// Bucle para los espacios en blanco
					for (int espacios = 0; espacios < N - i; espacios++) {
		                System.out.print(" ");
		            }
					// Bucle para los asteriscos
					for (int asterisco = 0; asterisco < i; asterisco++) {
		                System.out.print("* ");
		            }

		            // Salto de línea para pasar a la siguiente fila
		            System.out.println();
		        }
				
				// Cerramos el Scanner
				sc.close();
			}

		}
	}

