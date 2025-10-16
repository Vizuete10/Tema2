package diagramas;

import java.util.Scanner; // Importamos la clase Scanner para entrada de datos

public class Ejercicio04 {

	public static void main(String[] args) {

		// Creamos un objeto Scanner para leer datos desde el teclado
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables para los dos números
		int num1;
		int num2;

		// Pedimos al usuario que introduzca el primer número
		System.out.println("Introduce un primer número: ");
		num1 = sc.nextInt(); // Leemos el primer número

		// Pedimos al usuario que introduzca el segundo número
		System.out.println("Introduce un segundo número: ");
		num2 = sc.nextInt(); // Leemos el segundo número

		// Comparamos los dos números
		if (num1 < num2) {
			// Si el primer número es menor que el segundo
			System.out.println("El número dos es mayor que el número uno.");
		} else {
			// Si el primer número es mayor que el segundo
			System.out.println("El número uno es mayor que el número dos.");
		}
		// Cerramos el Scanner
		sc.close();
	}
}
