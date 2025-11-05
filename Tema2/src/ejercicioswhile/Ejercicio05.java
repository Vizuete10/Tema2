package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		// Inicializamos una variable suma de las edades
		int sumaEdades = 0;
		
		// Inicializamos una variable media de las edades
		int mediaEdades = 0;
		
		// Inicializamos una variable número de alumnos
		int numAlumnos = 0;
		
		// Inicializamos una variable mayores de edad
		int mayorEdad = 0;
		
		// Declaramos la variable edad
		int edad;
		
		System.out.println("Introduce las edades de los alumnos.");
        System.out.println("Escribe un número negativo (ej: -1) para terminar y ver los resultados.");

        // Bucle para pedir edades indefinidamente
        while (true) {

            System.out.print("Introduce una edad: ");
            edad = sc.nextInt();

			// Comprobar si el dato de salida se ha introducido
            if (edad < 0) {
                break; 
            }

            // Procesar el dato 
            
            // Acumulamos la suma
            sumaEdades = sumaEdades + edad;
            
            // Contamos un alumno más
            numAlumnos = numAlumnos + 1;

            // Comprobamos si es mayor de edad
            if (edad >= 18) {
                mayorEdad = mayorEdad + 1;
            }
        }

        // Mostrar los resultados
        System.out.println("ESTADÍSTICAS FINALES");

      
        if (numAlumnos > 0) {
            
			// Calculamos la media de edades
            mediaEdades = (int) ((double) sumaEdades / numAlumnos);

            System.out.println("Suma de todas las edades: " + sumaEdades);
            System.out.println("Número total de alumnos: " + numAlumnos);
            System.out.println("Media de edad: " + mediaEdades);
            System.out.println("Alumnos mayores de edad (>= 18): " + mayorEdad);
        
        } else {
            // Mensaje si el usuario salió sin meter datos
            System.out.println("No se introdujo ninguna edad válida.");
        }

        // Cerrar el scanner 
        sc.close();	
	}

}
