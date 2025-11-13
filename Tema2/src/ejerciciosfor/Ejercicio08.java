package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables para los números
		int a;
		int b;

		// creamos variables para el menor y mayor
		int menor;
		int mayor;

		// Pedimos los números al usuario
		System.out.print("Introduce el primer número entero (A): ");
		a = sc.nextInt();

		System.out.print("Introduce el segundo número entero (B): ");
		b = sc.nextInt();

// 
		menor = Math.min(a, b);
		mayor = Math.max(a, b);

		// Mostramos los números entre A y B
		for (int i = menor; i <= mayor; i++) {
			System.out.print(i + " ");
		}

		// Cerramos el Scanner
		sc.close();

	}

}
