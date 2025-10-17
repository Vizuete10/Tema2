package ifelse;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que intriduzca un primer número
		System.out.print("Introduce el primer número entero: ");
		int num1 = sc.nextInt();

		// Pedimos al usuario que intriduzca un segundo número
		System.out.print("Introduce el segundo número entero: ");
		int num2 = sc.nextInt();

		// Pedimos al usuario que intriduzca un tercer número
		System.out.print("Introduce el tercer número entero: ");
		int num3 = sc.nextInt();

		if (num1 + num2 == num3) { // Vemos si la suma de los dos primeros números suman el tercer número
			System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + num3);

		} else if (num1 + num3 == num2) { // Vemos si la suma del primer y tercer número suman el segundo número
			System.out.println("La suma de " + num1 + " y " + num3 + " es igual a " + num2);

		} else if (num2 + num3 == num1) { // Vemos si la suma del segundo y tercer número suman el primer número
			System.out.println("La suma de " + num2 + " y " + num3 + " es igual a " + num1);

		} else { // Si no se cumplen niguna de las condiciones imprimimos por pantalla el siguiente mensaje
			System.out.println("Ninguna suma de dos números da como resultado el otro.");

		}

		// Cerramos el Scanner
		sc.close();

	}

}
