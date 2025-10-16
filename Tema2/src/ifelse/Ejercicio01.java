package ifelse;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable num 
		int num;
		
		// Pedimos al usuario que introduzca un número
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		if (num%2 == 0) {// Bloque true
			System.out.println("El número es par");
		} else { // Bloque false
			System.out.println("El número es impar");
			}
	// Cerramos el Scanner
	sc.close();
	}

}
