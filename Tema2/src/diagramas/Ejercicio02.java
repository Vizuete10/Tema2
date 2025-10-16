package diagramas;

import java.util.Scanner; // Importamos la clase Scanner para leer datos desde el teclado

public class Ejercicio02 {
	public static void main(String[] args) {
		
		// Creamos un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable 'edad' para almacenar la edad introducida por el usuario
		int edad;
		
		// Solicitamos al usuario que introduzca su edad
		System.out.println("Introduce tu edad: ");
		edad = sc.nextInt(); // Leemos la edad introducida por el usuario
		
		// Usamos una estructura condicional para determinar si es mayor de edad
		if (edad >= 18) {
			// Si la edad es 18 o mayor, mostramos que es mayor de edad
			System.out.println("Eres mayor de edad.");
		} else {
			// Si la edad es menor que 18, mostramos que es menor de edad
			System.out.println("Eres menor de edad.");
		}
		
		// Cerramos el Scanner para liberar recursos
		sc.close();
	}
}

