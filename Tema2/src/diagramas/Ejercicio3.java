package diagramas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Declararamos la variables numero 1
		int num1;
		
		// Declararamos la variables numero 2
		int num2;
		
		// Declararamos la variables suma, resta, multiplicación y división
		int suma;
		int resta;
		double multi;
		double divi;
		
		// Solicitamos al usuario que introduza un número
		System.out.println("Introduce un número : ");
		num1 = sc.nextInt(); 
		
		// Solicitamos al usuario que introduza un número
		System.out.println("Introduce un número : ");
		num2 = sc.nextInt(); 

		// Creamos un condicional para saber si num2 es igual a 0
		if (num2 == 0) {
			// Calculamos la suma, resta y multiplicación de ambos números
			suma = num1 + num2;
			resta = num1 - num2;
			multi = num1 * num2;
			
			// Imprimimos el resultado de suma, resta y multiplicación
			System.out.println("El resultado de la suma es: "+ suma);
			System.out.println("El resultado de la resta es: "+ resta);
			System.out.println("El resultado de la multiplicación es: "+ multi);
			
			// Imprimimos por pantalla el mensaje 
			System.out.println("No se puede dividir entre 0");
			} 
		else {
			// Calculamos la suma, resta, multiplicación y división de ambos números
			suma = num1 + num2;
			resta = num1 - num2;
			multi = num1 * num2;
			divi = (double)num1 / num2;
			
			// Imprimimos el resultado de suma, resta, multiplicación y división
			System.out.println("El resultado de la suma es: "+ suma);
			System.out.println("El resultado de la resta es: "+ resta);
			System.out.println("El resultado de la multiplicación es: "+ multi);
			System.out.println("El resultado de la división es: "+ divi);		
		}
		// Cerramos el Scanner 
		sc.close();
	}
}
