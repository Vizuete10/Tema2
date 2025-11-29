package repaso;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos el Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);
		
		// Declaramos las variables necesarias
		int numero;
		
		int cifrasPares = 0;
		int cifrasImpares = 0;
		int cifra;
		
		// Pedimos al usuario que introduzca un numero
		System.out.print("Introduce un número entero: ");
		numero = scanner.nextInt();
		
		// Procesamos el numero para contar las cifras pares e impares
		while (numero != 0) {
			
			// Obtenemos la ultima cifra del numero
			cifra = numero % 10;
			
			if (cifra % 2 == 0) {
				cifrasPares++;
			} else {
				cifrasImpares++;
			}
			
			// Eliminamos la ultima cifra del numero
			numero = numero / 10;
		}
		// Mostramos los resultados
		System.out.println("Cifras pares: " + cifrasPares);
		System.out.println("Cifras impares: " + cifrasImpares);
		
		
		// Cerramos el scanner
		scanner.close();
		

	}

}
