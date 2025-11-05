package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos una variable para el número
		int num;
		
		// Declaramos una variable para el número
		int contador = 0;
		
		// Declaramos una variable para la suma de positivos
		int sumaPositivos = 0;
		
		// Declaramos una variable para la suma de negativos
		int sumaNegativos = 0;
		
		// Declaramos una variable para contar los negativos
		int contNegativos = 0;
		
		// Declaramos una variable para contar los ceros
		int contCeros = 0;
	
		// Declaramos una variable para la media de negativos
		double mediaNegativos;
		
		// Bucle para pedir 10 números
		while (contador < 10) {
			
			System.out.println("Introduce un número:");
			num = sc.nextInt();
			
			if (num > 0) {
				sumaPositivos += num;
			} else if (num < 0) {
				sumaNegativos += num;
				contNegativos++;
			} else {
				contCeros++;
			}
			
			contador++;
		}
		// Imprimimos la suma de los números positivos
		if (contNegativos > 0) {
            // Calculamos la media de los números negativos
            mediaNegativos = (double) sumaNegativos / contNegativos;
           
            // Imprimimos la media de los números negativos
            System.out.println("La media de los números negativos es: " + mediaNegativos);
        } else {
            System.out.println("No se introdujeron números negativos (media no calculable).");
        }
		
		// cerramos el Scanner
		sc.close();
		
	}

}
