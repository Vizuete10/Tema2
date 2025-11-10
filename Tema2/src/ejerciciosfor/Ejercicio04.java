package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable para la suma
		int suma = 0;

		// Calculamos la suma de los 10 primeros números impares
		for (int i = 1; i <= 10; i++) {
			int numeroImpar = (2 * i) - 1;
			suma += numeroImpar;
		}
		// Mostramos la suma de los 10 primeros números impares
		System.out.println("La suma de los 10 primeros números impares es: " + suma);

		// Cerramos el Scanner
		sc.close();

	}

}
