package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable para la opción elegida
		String opcion;

		// Declaramos las variables para el primer numero y el segundo numero
		int num1;
		int num2;

		// Pedimos al usuario que introduzaca dos valores
		System.out.println("Introduce dos número enteros : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		// Menú de opciones
		System.out.println("A. Sumar números");
		System.out.println("B. Restar números");
		System.out.println("C. Multiplicar números");
		System.out.println("D. Dividir números");
		System.out.println("E. Salir");

		do {
			System.out.println("Elige una opción (A, B, C, D, E): ");
			opcion = sc.next();

			switch (opcion) {
			case "A", "a" -> System.out.println("La suma es: " + (num1 + num2));
			case "B", "b" -> System.out.println("La resta es: " + (num1 - num2));
			case "C", "c" -> System.out.println("La multiplicación es: " + (double) num1 * num2);
			case "D", "d" -> {
				if (num2 != 0) {
					System.out.println("La división es: " + (double) num1 / num2);
				} else {
					System.out.println("No se puede dividir entre 0");
				}
			}
			case "E", "e" -> System.out.println("Saliendo del programa...");
			default -> System.out.println("Las opciones son A, B, C, D o E. No te las inventes.");
			}
		} while (!opcion.equalsIgnoreCase("E"));
		
		// Cerramos el Scanner
		sc.close();
		
	}

}
