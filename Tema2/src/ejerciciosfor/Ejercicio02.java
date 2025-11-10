package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable para el contador de múltiplos de 3
		int multiplo3 = 0;

		// Declaramos la variable para el número
		int n;

		// Pedimos el número al usuario
		System.out.println("Introduce un número entero positivo: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				multiplo3++;
			}
		}

		// Mostramos la cantidad de múltiplos de 3 entre 1 y n
		System.out.println("Cantidad de múltiplos de 3 entre 1 y " + n + ": " + multiplo3);

		// Cerramos el Scanner
		sc.close();

	}
}
