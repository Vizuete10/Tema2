package diagramas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable edad
		int edad;
		
		// Pedimos al usuario su edad
		System.out.println("Introduce tu edad: ");
		edad = sc.nextInt();
		
		// Mediante una condición para saber si es mayor de edad
		if (edad>=18) {
			// imprimimos por pantalla el mensaje
			System.out.println("Eres mayor de edad.");
		}
	sc.close();
	}

}
