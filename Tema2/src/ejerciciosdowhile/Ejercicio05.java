package ejerciciosdowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Creamos un random 
		Random rd = new Random();
		
		// Declaramos la variable para el minimo
		int min = 1;
		
		// Declaramos la variable para el maximo
		int max = 101;
		
		// Declaramos la variable para un nuúmero aleatorio
		int numAleatorio;
		
		// Declaramos la variable para el resultado
		String resultado;
		
		// Generamos el número aleatorio
		numAleatorio = rd.nextInt(min, max);
		
		// 
		System.out.println(numAleatorio);
		System.out.println("¿El número es mayor, menor o igual que " + numAleatorio + "?");
		
		do {
			// Pedimos al usuario que introduzca el resultado
			resultado = sc.nextLine();
			
			// Comprobamos el resultado
			if (resultado.equals("mayor")) {
				numAleatorio = rd.nextInt(numAleatorio + 1, max);
				System.out.println("¿El número es mayor, menor o igual que " + numAleatorio + "?");
			} else if (resultado.equals("menor")) {
				numAleatorio = rd.nextInt(min, numAleatorio);
				System.out.println("¿El número es mayor, menor o igual que " + numAleatorio + "?");
			} else if (resultado.equals("igual")) {
				System.out.println("¡He adivinado tu número!");
			} else {
				System.out.println("Por favor, introduce 'mayor', 'menor' o 'igual'.");
			}
			
		} while (!resultado.equals("igual"));
		
		// Cerramos el Scanner
		sc.close();
		
		
		

	}

}
