package ifelse;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable num
		double num;

		// Pedimos al usuario que introduzca un número
		System.out.println("Introduce un valor decimal: ");
		num = sc.nextDouble();

		if ((num > -1 && num < 0) || (num > 0 && num < 1)) {
			System.out.println("El número  es casi-cero");
		} else {

			System.out.println("El número  no es casi-cero");
		}

		// Cerramos el Scanner
		sc.close();
	}

}
