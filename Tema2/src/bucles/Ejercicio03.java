package bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables para el número
		int num1;

		// Declaramos las variables para el número
		int num2;

		// Declaramos la variable para el máximo común divisor
		int mcd = 0;

		// Declaramos la variable para el menor de los dos números
		int min;
		
		// Declaramos la variable para el divisor
		int divisor;

		// Pedimos al usuario que introduzca el primer número
		System.out.print("Introduce el primer número entero positivo: ");
		num1 = sc.nextInt();

		// Pedimos al usuario que introduzca el segundo número
		System.out.print("Introduce el segundo número entero positivo: ");
		num2 = sc.nextInt();

		// Miramos cual es el menor de los dos números
		min = Math.min(num1, num2);
		// Bucle for para recorrer desde el más pequeño de los dos números hasta 1,
		// restando 1 en cada vuelta
		for (int i = min; i >= 1; i--) {
			// Comprobamos si i divide a ambos números
			if (num1 % i == 0 && num2 % i == 0) {
				mcd = i;
			}
		}

		// Inicializamos el divisor al mínimo de ambos números
		divisor = min;
		// Mientras no lleguemos a 1 y el mcd siga siendo 1, es decir, no hemos
		// encontrado un divisor distinto de 1
		while (divisor > 1 && mcd == 1) {
			// Comprobamos si i divide a ambos números
			if (num1 % divisor == 0 && num2 % divisor == 0) {
				// Establecemos el valor para el mcd con el divisor común
				mcd = divisor;
			}

			// Decrementamos en 1 el divisor
			divisor--;
		}

		// Mostramos el resultado del mcd
		System.out.println("El m.c.d. de " + num1 + " y " + num2 + " es: " + mcd);
		// Cerramos el Scanner
		sc.close();

	}

}
