package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable para la suma
		int suma = 0;
		
		// Declaramos la variable para la media
		double media;

		// Pedimos 10 números al usuario y los sumamos
		for (int i = 1 ; i <=10 ; i++ ) {
			System.out.println("Introduce un número entero: ");
			suma += sc.nextInt();
		}
		// Calculamos la media
		media =  (double) suma / 10;

		// Mostramos la media
		System.out.println("La media de los números introducidos es: " + media);
		
		// Cerramos el Scanner
		sc.close();
		
	}

}
