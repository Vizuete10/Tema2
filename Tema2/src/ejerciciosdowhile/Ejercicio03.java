package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable para la suma
		int suma = 0;

		// Contador para el bucle
		int contador = 1;
		
		// Número introducido por el usuario
		int num;
		// Pedimos al usuario que introduzca un número entero positivo
		System.out.println("Introduce un número entero positivo (0 para terminar): ");
		num = sc.nextInt();

		// Bucle do-while para sumar desde 1 hasta el número introducido
		do {
			suma += contador;
			contador++;

		} while (contador <= num);

		// Mostramos el resultado
		System.out.println("La suma desde 1 hasta " + num + " es: " + suma);

		// Cerramos el Scanner
		sc.close();

	}

}
