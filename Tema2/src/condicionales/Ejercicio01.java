package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable para almacenar el número introducido
		int numero;
		
		// Declaramos variables para cada uno de los digitos del número
		int digito1;
		int digito2;
		int digito3;
		int digito4;

		// Pedimos al usuario que introduzca un número
		System.out.print("Introduce un número entre 0 y 9999: ");
		numero = sc.nextInt();

		if (numero < 0 || numero > 9999) { // Comprobamos si el número esta el rango
			System.out.println("El número introducido debe estar entre 0 y 9999.");

		} else if (numero < 10) {
			// Un solo dígito siempre es capicúa
			System.out.println("El número " + numero + " es capicúa.");

		} else if (numero < 100) {
			digito1 = numero / 10;
			digito2 = numero % 10;
			
			if (digito1 == digito2) {
				System.out.println("El número " + numero + " es capicúa.");

			} else {
				System.out.println("El número " + numero + " no es capicúa.");

			}
		} else if (numero < 1000) {
			digito1 = numero / 100;
			digito3 = numero % 10;
			
			if (digito1 == digito3) {
				System.out.println("El número " + numero + " es capicúa.");

			} else {
				System.out.println("El número " + numero + " no es capicúa.");

			}
		} else {
			digito1 = numero / 1000;
			digito2 = (numero / 100) % 10;
			digito3 = (numero / 10) % 10;
			digito4 = numero % 10;

			if ((digito1 == digito4) && (digito2 == digito3)) {
				System.out.println("El número " + numero + " es capicúa.");

			} else {
				System.out.println("El número " + numero + " no es capicúa.");
			}
		}

		// Cerramos el Scanner
		sc.close();
	}
}
