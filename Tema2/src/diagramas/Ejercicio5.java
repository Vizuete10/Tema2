package diagramas;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		if (num>=0) {
			System.out.println("El número es positivo");
		}
	}

}
