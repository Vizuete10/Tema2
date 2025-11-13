package bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables para la hora
		int hora;
		
		// Declaramos las variables para los minutos
		int minuto;
		
		// Declaramos las variables para los segundos
		int segundo;
		
		// Declaramos las variables para los segundos a incrementar
		int segundosIncrementados;
		
		// Pedimos la hora al usuario
		System.out.print("Introduce la hora (0-23): ");
		hora = sc.nextInt();
		
		// Pedimos los minutos al usuario
		System.out.print("Introduce los minutos (0-59): ");
		minuto = sc.nextInt();
		
		// Pedimos los segundos al usuario
		System.out.print("Introduce los segundos (0-59): ");
		segundo = sc.nextInt();
		
		// Pedimos los segundos a incrementar al usuario
		System.out.print("Introduce los segundos a incrementar: ");
		segundosIncrementados = sc.nextInt();
		
		// Incrementamos los segundos
		segundo += segundosIncrementados;
		
		// Ajustamos los minutos y horas si es necesario
		if (segundo >= 60) {
			segundo -= 60;
			minuto++;
		}
		if (minuto >= 60) {
			minuto -= 60;
			hora++;
		}
		if (hora >= 24) {
			hora -= 24;
		}
		
		// Mostramos la nueva hora
		System.out.printf("La hora con los segundos incrementados es : " +  hora + ":" + minuto +":"+ segundo);
		
		// Cerramos el Scanner
		sc.close();
		
		
		
		
	}

}
