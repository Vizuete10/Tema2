package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);


		// Declaramos las variables para la jugada 1 y la jugada 2
		String jugada1;
		String jugada2;
		
		do {
			// Pedimos al usuario el primer movimiento
			System.out.println("Introduzca el movimiento del jugador 1 (PIEDRA, PAPEL o TIJERA): ");
			jugada1 = sc.next().toUpperCase();
		} while (!jugada1.equals("PIEDRA") && !jugada1.equals("PAPEL") && !jugada1.equals("TIJERA"));
		
		do {
			// Pedimos al usuario el segundo movimiento
			System.out.println("Introduzca el movimiento del jugador 2 (PIEDRA, PAPEL o TIJERA): ");
			jugada2 = sc.next().toUpperCase();
		} while (!jugada2.equals("PIEDRA") && !jugada2.equals("PAPEL") && !jugada2.equals("TIJERA"));
		
		if (jugada1.equals(jugada2)) { // Si coinciden empatan
			System.out.println("Empate : " + jugada1 + " Y " + jugada2);

		} else if (jugada1.equals("PIEDRA") && jugada2.equals("TIJERA") 
				|| jugada1.equals("PAPEL") && jugada2.equals("PIEDRA")
				|| jugada1.equals("TIJERA") && jugada2.equals("PAPEL")) {

			// Si gana el jugador 1
			System.out.println("Gana el jugador 1");
		} else {
			// Gana el jugador 2
			System.out.println("Gana el jugador 2");
		}
		
		// Cerramos el Scanner
		sc.close();
	}

}
