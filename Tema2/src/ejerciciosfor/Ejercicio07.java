package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Declaramos la variable para almacenar el número introducido por el usuario
		int numero;
		
		// Pedimos al usuario que introduzca un número
		System.out.print("Introduce un número entero positivo: ");
		numero = scanner.nextInt();
		
		// Declaramos la variable para indicar si el número es primo
		boolean esPrimo = true;
		
		// Comprobamos si el número es primo

		if ( numero <= 1) {
			System.out.println(numero + " no es un número primo.");
		} else {
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo) {
				System.out.println(numero + " es un número primo.");
			} else {
				System.out.println(numero + " no es un número primo.");
			}
		}
		
		// Cerramos el Scanner
		scanner.close();
		
	}

}
