package diagramas;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable num
		int num;
		
		// Pedimos un número al usuario
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		if (num>=0) {
			System.out.println("El número es positivo");
		}
		else {
			System.out.println("El numero es negativo");
		}
		// Cerramos el Scanner
		sc.close();
	}

}
