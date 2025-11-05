package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables para las cadenas de los dos valores
		String tirada1;
		String tirada2;

		// Declaramos las variables para asignarles los números
		int num1;
		int num2;

		do {
			// Pedimos al usuario que introduzca escrito el valor de la primera tirada
			System.out.println("Introduce el valor del dado en la primera tirada(UNO, DOS, etc): ");
			tirada1 = sc.next();

		} while (!tirada1.equalsIgnoreCase("UNO") && !tirada1.equalsIgnoreCase("DOS")
				&& !tirada1.equalsIgnoreCase("TRES") && !tirada1.equalsIgnoreCase("CUATRO")
				&& !tirada1.equalsIgnoreCase("CINCO") && !tirada1.equalsIgnoreCase("SEIS"));

		do {
			// Pedimos al usuario que introduzca escrito el valor de la segunda tirada
			System.out.println("Introduce el valor del dado en la segunda tirada (UNO, DOS, etc): ");
			tirada2 = sc.next();

		} while (!tirada2.equalsIgnoreCase("UNO") && !tirada2.equalsIgnoreCase("DOS")
				&& !tirada2.equalsIgnoreCase("TRES") && !tirada2.equalsIgnoreCase("CUATRO")
				&& !tirada2.equalsIgnoreCase("CINCO") && !tirada2.equalsIgnoreCase("SEIS"));

		// Comprobamos la cadena introducida por el usuario y le asignamos un valor
		num1 = switch (tirada1) {
		case "UNO", "uno" -> {
			yield 1;
		}
		case "DOS", "dos" -> {
			yield 2;
		}
		case "TRES", "tres" -> {
			yield 3;
		}
		case "CUATRO", "cuatro" -> {
			yield 4;
		}
		case "CINCO", "cinco" -> {
			yield 5;
		}
		case "SEIS", "seis" -> {
			yield 6;
		}
		default -> {
			yield 0;
		}
		};
		// Comprobamos la cadena introducida por el usuario y le asignamos un valor
		num2 = switch (tirada2) {
		case "UNO", "uno" -> {
			yield 1;
		}
		case "DOS", "dos" -> {
			yield 2;
		}
		case "TRES", "tres" -> {
			yield 3;
		}
		case "CUATRO", "cuatro" -> {
			yield 4;
		}
		case "CINCO", "cinco" -> {
			yield 5;
		}
		case "SEIS", "seis" -> {
			yield 6;
		}
		default -> {
			yield 0;
		}
		};
		
		// Imprimimos la suma de ambos números
		System.out.println("La suma es: " + (num1 + num2));
		
		// Cerramos el Scanner
		sc.close();
		
	}
}
