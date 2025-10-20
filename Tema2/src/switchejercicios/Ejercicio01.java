package switchejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable nota
		int nota;
		
		// Pedimos al usuario que introduzca un valor para nota
		System.out.println("Introduce su nota de forma entera: ");
		nota = sc.nextInt();
		
		// Utulizamos un switch para imprimir por pantalla un mensaje dependiendo del valor de nota
		switch (nota) {
		case 0,1,2,3,4 -> System.out.println("Insuficiente");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7,8 -> System.out.println("Notable");
		case 9,10 -> System.out.println("Sobresaliente");
		}
		// Cerramos Scanner
		sc.close();
	}

}
