package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos una variable num para el número introducido por el usuario
		int num;
		
		// Declaramos una variable multiplicacion
		int multiplicacion = 1;
		
		// Pedimos al usuario un nuúmero
		System.out.println("Intruduce un número del 1 al 10");
		num = sc.nextInt();
		
		// Hacemos un bucle do while para mostrar la tabla de multiplicar
		do {
			System.out.println(num + "x" + multiplicacion + ":" + num*multiplicacion);
			multiplicacion ++;
		} while(multiplicacion<=10);
		
		// Cerramos el Scanner
		sc.close();
	}

}
