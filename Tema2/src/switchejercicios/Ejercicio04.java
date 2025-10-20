package switchejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables para las cadenas de los dos valores
		String tirada1;
		String tirada2;
		
		// Declaramos las variables para asignarles los números
		int num1;
		int num2;
		
		// Pedimos al usuario que introduzca escrito el valor de la primera tirada
		System.out.println("Introduce el valor del dado en la primera tirada(UNO, DOS, etc): ");
		tirada1 = sc.next();
		
		// Pedimos al usuario que introduzca escrito el valor de la segunda tirada
		System.out.println("Introduce el valor del dado en la segunda tirada (UNO, DOS, etc): ");
		tirada2 = sc.next();
		
		// Comprobamos la cadena introducida por el usuario y le asignamos un valor
		num1 = switch (tirada1) {
		case "UNO","uno" -> {
			yield 1;
		}
		case "DOS", "dos" -> {
			yield 2;
		}
		case "TRES", "tres" -> {
			yield 3;
		}
		case "CUATRO","cuatro" -> {
			yield 4;
		}
		case "CINCO", "cinco" -> {
			yield 5;
		}
		case "SEIS", "seis" -> {
			yield 6;
		}
		default -> {
			System.out.println("La primera tirada no tiene un valor valido");
			yield 0;
		}
		};
		// Comprobamos la cadena introducida por el usuario y le asignamos un valor
		num2 = switch (tirada2) {
		case "UNO","uno" -> {
			yield 1;
		}
		case "DOS", "dos" -> {
			yield 2;
		}
		case "TRES", "tres" -> {
			yield 3;
		}
		case "CUATRO","cuatro" -> {
			yield 4;
		}
		case "CINCO", "cinco" -> {
			yield 5;
		}
		case "SEIS", "seis" -> {
			yield 6;
		}
		default -> {
			System.out.println("La segunda tirada no tiene un valor valido");
			yield 0;
		}
		};

		// Imprimimos la suma de ambos números
		System.out.println("La suma es: "+(num1+num2));
		
		// Cerramos el Scanner
		sc.close();
	}

}
