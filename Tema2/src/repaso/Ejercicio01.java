package repaso;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creamos el Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Declaramos las variables necesarias
		int ladoCuadrado;

		int alturaCuadrado;

		// Pedimos al usuario que introduzca el lado del cuadrado
		System.out.print("Introduce el lado del cuadrado: ");
		ladoCuadrado = scanner.nextInt();
		alturaCuadrado = ladoCuadrado;

		// Dibujamos el cuadrado utilizando bucles anidados
		// ----------------
		// Primera linea

		for (int i = 0; i < ladoCuadrado; i++) {
			System.out.print("* ");
		}
		System.out.println();

		// Lineas intermedias es lado -2 ya que solo pinta dos si el lado es 4
		
		for (int j = 0; j < alturaCuadrado - 2; j++) {
			System.out.print("* ");

			for (int k = 0; k < ladoCuadrado - 2; k++) {
				System.out.print("  ");
			}
			System.out.println("* ");

		}
		
		for (int i = 0; i < ladoCuadrado; i++) {
			System.out.print("* ");
		}
		System.out.println();
		// Cerramos el scanner
		scanner.close();

	}
}
