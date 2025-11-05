package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable para guardar la altura máxima
		int alturaMaxima = 0;

        // Variable para guardar la altura introducida en cada vuelta
        int alturaActual;

        // Pedimos al usuario que introduzca las alturas
		System.out.println("Introduce las alturas de los árboles en cm."); 
        alturaActual = sc.nextInt();
        
        // Bucle para pedir alturas indefinidamente
        while (alturaActual != -1) {
            
        	// Comprobar si la altura actual es mayor que la máxima registrada
            if (alturaActual > alturaMaxima) {
                alturaMaxima = alturaActual;
            }

           
            System.out.print("Introduce altura (en cm): ");
            alturaActual = sc.nextInt();
        }

 
        System.out.println("\n--- RESULTADO ---");
        // Mostrar la altura máxima si se ha introducido al menos una altura válida
        if (alturaMaxima > 0) {
             System.out.println("La altura del árbol más alto es: " + alturaMaxima + " cm.");
        } else {
 
             System.out.println("No se introdujeron alturas válidas.");
        }

        // Cerramos el Scanner
        sc.close();
	}

}
