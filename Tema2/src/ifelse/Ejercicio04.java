package ifelse;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Introduce un número: ");
		numero = sc.nextInt();

		// Verificamos primero que el número esté en el rango permitido
		if (numero < 0 || numero > 99999) {
			System.out.println("El número debe estar entre 0 y 9999");
		} else if (numero < 10) {
			System.out.println("El número tiene 1 cifra");

		} else if (numero < 100) {
			System.out.println("El número tiene 2 cifras");

		} else if (numero < 1000) {
			System.out.println("El número tiene 3 cifras");

		} else if (numero < 10000) {
			System.out.println("El número tiene 4 cifras");

		} else {
			System.out.println("El número tiene 5 cifras");

		}

		sc.close();
	}
}
