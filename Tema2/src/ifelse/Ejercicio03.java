package ifelse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable a
		int a;

		// Declaramos la variable b
		int b;

		// Declaramos la variable c
		int c;

		// Declaramos la variable x1 para la primera solución
		double x1;

		// Declaramos la variable x2 para la segunda solución
		double x2;

		// Imprimimos por pantalla la ecuación
		System.out.println("Según esta ecuación : ax^2 + bx + c = 0");

		// Pedimos al usuario que introduzca un valor a "a"
		System.out.println("Introduce el valor de a: ");
		a = sc.nextInt();

		// Pedimos al usuario que introduzca un valor a "b"
		System.out.println("Introduce el valor de b: ");
		b = sc.nextInt();

		// Pedimos al usuario que introduzca un valor a "c"
		System.out.println("Introduce el valor de c: ");
		c = sc.nextInt();

		if (a == 0) {
			// Tenemos ecuación de primer grado
			x1 = (-c / b);
			System.out.println("Como a = 0 : x = " + x1);

		} else if ((b * b - 4 * a * c) > 0) { // si a!=0 , Evaluamos las posibles soluciones

			// Dos soluciones reales diferentes
			x1 = (double) (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

			x2 = (double) (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

			System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);

		} else if ((b * b - 4 * a * c) == 0) {
			// Una sola solución real
			x1 = -b / (2 * a);
			System.out.println("La solución doble es: x = " + x1);

		} else {
			// No hay soluciones reales
			System.out.println("La ecuación no tiene soluciones reales.");

		}

		// Cerramos el Scanner
		sc.close();
	}
}
