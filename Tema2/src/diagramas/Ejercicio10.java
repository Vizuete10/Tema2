package diagramas;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer datos de entrada

		// Variable para almacenar los segundos
		int segundos;

		// Variable para almacenar los minutos
		int minutos;

		// Variable para almacenar las horas
		int horas;

		// Solicitar y leer las horas
		System.out.println("Introduce el valor de horas: ");
		horas = sc.nextInt();

		// Solicitar y leer los minutos
		System.out.println("Introduce el valor de minutos: ");
		minutos = sc.nextInt();

		// Solicitar y leer los segundos
		System.out.println("Introduce el valor de segundos: ");
		segundos = sc.nextInt();

		// Incrementar el tiempo en un segundo, manejando el desbordamiento
		if (segundos < 59) {
			// Si segundos son menos de 59, solo sumamos uno
			segundos++;
		} else {
			// Si segundos son 59, se reinician a 0 y se incrementan minutos
			segundos = 0;

			if (minutos < 59) {
				// Si minutos son menos de 59, sumamos uno
				minutos++;
			} else {
				// Si minutos son 59, se reinician a 0 y se incrementan horas
				minutos = 0;
				if (horas < 23) {
					// Si horas son menos de 23, sumamos uno
					horas++;
				} else {
					// Si horas son 23, se reinician a 0 (nuevo día)
					horas = 0;
				}
			}
		}

		// Mostrar la hora actualizada
		System.out.println(horas + ":" + minutos + ":" + segundos);

		// Cerrar el Scanner
		sc.close();
	}

}
