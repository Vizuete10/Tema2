package switchejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable para almacenar el valor
		int dia;
		
		// Pedimos al usuario un valor entre 1 y 7 
		System.out.println("Introduce un número entre 1 y 7 para saber el día de la semana al que se corresponde :");
		dia = sc.nextInt();
		
		// Mediante un switch vemos el valor asignado a dia y según su valor imprimimos un mensaje
		switch (dia) {
		case 1 -> System.out.println("Lunes");
		case 2 -> System.out.println("Martes");
		case 3 -> System.out.println("Miercoles");
		case 4 -> System.out.println("Jueves");
		case 5 -> System.out.println("Viernes");
		case 6 -> System.out.println("Sabado");
		case 7 -> System.out.println("Domingo");
		}
		
		// Cerramos el Scanner
		sc.close();
	}

}
