package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos el número al usuario
		System.out.print("Ingrese un número entero positivo para calcular su factorial: ");
        int n = sc.nextInt();

        // Inicializamos la variable para el factorial
		int factorial = 1; 

        // Verificación inicial para 0! y números negativos
        if (n < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
            
        } else if (n == 0) {
            System.out.println("El factorial de 0 es: 1");
            
        } else {
            for (int i = 1; i <= n; i++) {
                
                factorial = factorial * i;
            }

            // Mostramos el resultado
            System.out.println("El factorial de " + n + " es: " + factorial);
        }

        // Cerramos el Scanner
        sc.close();
        
	}
}
