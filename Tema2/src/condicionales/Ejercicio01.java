package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		
		/*
		 *  Puebas minimas a realizar:
		 *  
		 *  1. Introducir un número fuera del rango; -1
		 *  	Resultado esperado: "El número introducido debe estar entre 0 y 9999."
		 *  	Resultado obtenido: "El número introducido debe estar entre 0 y 9999."
		 *  
		 *  2. Introducir un número en el rango y menor que 10; 8
		 *  	Resultado esperado: "El número 8 es capicúa."
		 *  	Resultado obtenido: "El número 8 es capicúa."
		 * 
		 * 	3. Introducir un número entre 10 y 100 y que sea capicúa; 11
		 * 		Resultado esperado: "El número 11 es capicúa."
		 * 		Resultado obtenido: "El número 11 es capicúa."
		 * 
		 * 	4. Introducir un número entre 10 y 100 y que no sea capicúa; 24
		 * 	 	Resultado esperado: "El número 24 no es capicúa."
		 * 		Resultado obtenido: "El número 24 no es capicúa."
		 * 
		 *  5. Introducir un número entre 100 y 1000 y que sea capicúa; 121
		 *      Resultado esperado: "El número 121 es capicúa."
		 *      Resultado obtenido: "El número 121 es capicúa."
		 * 
		 *  6. Introducir un número entre 100 y 1000 y que no sea capicúa; 123
		 *      Resultado esperado: "El número 123 no es capicúa."
		 *      Resultado obtenido: "El número 123 no es capicúa."
		 * 
		 *  7. Introducir un número entre 1000 y 9999 y que sea capicúa; 1221
		 *      Resultado esperado: "El número 1221 es capicúa."
		 *      Resultado obtenido: "El número 1221 es capicúa."
		 * 
		 *  8. Introducir un número entre 1000 y 9999 y que no sea capicúa; 1234
		 *      Resultado esperado: "El número 1234 no es capicúa."
		 *      Resultado obtenido: "El número 1234 no es capicúa."
		 * 
		 */
		
		
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
			// Calculamos para obtener los digitos
			digito1 = numero / 10;
			digito2 = numero % 10;
			
			if (digito1 == digito2) {
				System.out.println("El número " + numero + " es capicúa.");

			} else {
				System.out.println("El número " + numero + " no es capicúa.");

			}
		} else if (numero < 1000) {
			// Calculamos para obtener los digitos
			digito1 = numero / 100;
			digito3 = numero % 10;
			
			if (digito1 == digito3) {
				System.out.println("El número " + numero + " es capicúa.");

			} else {
				System.out.println("El número " + numero + " no es capicúa.");

			}
		} else {
			// Calculamos para obtener los digitos
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
