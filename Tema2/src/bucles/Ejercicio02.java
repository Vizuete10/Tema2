package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables para el número
		int n;

		// Declaramos la variable para contar los números primos
		int contadorPrimos = 0;

		// Pedimos al usuario que introduzca un número
		System.out.print("Introduce un número entero positivo: ");
		n = sc.nextInt();

		// Declaramos la variable para indicar si el número es primo
		boolean esPrimo = true;

		for (int numero = 1; numero <= n; numero++) {
			esPrimo = true;
			// Comprobamos si el número es primo

			if (numero == 1) {
				esPrimo = false;
			} else {
				for (int cont = 2; cont < numero; cont++) {
					if (numero % cont == 0) {
						esPrimo = false;
					}
				}
			}

			// Mostramos el resultado
			if (esPrimo) {
				contadorPrimos++;

			}

		}
		// Mostramos el resultado final
		System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + n);

		// Cerramos el Scanner
		sc.close();
	}

}
