package ifelse;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las constantes, PIERDA, PAPEL o TIJERA
		final String TIJERA = "TIJERA";
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";

		// Declaramos las variables para la jugada 1 y la jugada 2
		String jugada1;
		String jugada2;

		// Pedimos al usuario
		System.out.println("Introduzca el movimineto del jugador 1 (PIEDRA, PAPEL o TIJERA: ");
		jugada1 = sc.next();

		System.out.println("Introduzca el movimineto del jugador 2 (PIEDRA, PAPEL o TIJERA: ");
		jugada2 = sc.next();

		if (!jugada1.equals(PIEDRA) && !jugada1.equals(PAPEL) && !jugada1.equals(TIJERA)) {
			System.out.println("Jugada 1 incorrecta");

		} else if (!jugada2.equals(PIEDRA) && !jugada2.equals(PAPEL) && !jugada2.equals(TIJERA)) {
			System.out.println("Jugada 2 incorrecta");

		} else if (jugada1.equals(jugada2)) { // Si coinciden empatan
			System.out.println("Empate : " + jugada1 + " Y " + jugada2);

		} else if (jugada1.equals(PIEDRA) && jugada2.equals(TIJERA) 
				|| jugada1.equals(PAPEL) && jugada2.equals(PIEDRA)
				|| jugada1.equals(TIJERA) && jugada2.equals(PAPEL)) {

			// Si gana el jugador 1
			System.out.println("Gana el jugador 1");
		} else {
			// Gana el jugador 2
			System.out.println("Gana el jugador 2");
		}
		
		sc.close();
	}

}
