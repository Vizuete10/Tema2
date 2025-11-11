package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables para los números
		int a;
		int b;
		
		// Pedimos los números al usuario
		System.out.print("Introduce el primer número entero (A): ");
		a = sc.nextInt();
		
		System.out.print("Introduce el segundo número entero (B): ");
		b = sc.nextInt();
		
		// Mostramos los números entre A y B
		if ( a < b ) {
			for ( int i = a; i <= b; i++ ) {
				System.out.print(i + " ");
			}
		} else {
			for ( int i = b; i <= a; i++ ) {
				System.out.print(i + " ");
			}
		}
		
		// Cerramos el Scanner
		sc.close();
		
		
		

	}

}
