package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		
		/*
		 * Pruebas mínimas a realizar:
		 * 
		 *  1. El usuario introduce la suma CORRECTA:
		 * Números aleatorios generados (ejemplo): num1=35, num2=12. (sumaAleatoria = 47)
		 * Entrada del usuario: 47
		 * Resultado esperado: "¡¡¡¡Correcto!!!!"
		 * Resultado obtenido: "¡¡¡¡Correcto!!!!"
		 * 
		 *  2. El usuario introduce una suma INCORRECTA (menor):
		 * Números aleatorios generados (ejemplo): num1=60, num2=20. (sumaAleatoria = 80)
		 * Entrada del usuario: 75
		 * Resultado esperado: "¡NOOO!, la suma es: 80"
		 * Resultado obtenido: "¡NOOO!, la suma es: 80"
		 * 
		 *  3. El usuario introduce una suma INCORRECTA (mayor):
		 * Números aleatorios generados (ejemplo): num1=1, num2=99. (sumaAleatoria = 100)
		 * Entrada del usuario: 101
		 * Resultado esperado: "¡NOOO!, la suma es: 100"
		 * Resultado obtenido: "¡NOOO!, la suma es: 100"
		 * 
		 *  4. El usuario introduce una respuesta CERO:
		 * Números aleatorios generados (ejemplo): num1=5, num2=15. (sumaAleatoria = 20)
		 * Entrada del usuario: 0
		 * Resultado esperado: "¡NOOO!, la suma es: 20"
		 * Resultado obtenido: "¡NOOO!, la suma es: 20"
		 * 
		 */
		
		// Creamos un Random
		Random rd = new Random();
		
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos dos variables num1 y num2 para dos números aleatorios
		int num1 = rd.nextInt(1,100);
		int num2 = rd.nextInt(1,100);
		
		// Creamos una variable para la suma de ambos números
		int sumaAleatoria = num1 + num2;
		
		// Declaramos una variable para el valor introducido por el usuario
		int sumaUsuario;
		

		// Imprimimos por pantalla la suma de los números aleatorios
		System.out.println("Número 1 : " + num1);
		System.out.println("Número 2 : " + num2);
		System.out.println("¿Cuánto es la suma de ambos números?");
		sumaUsuario = sc.nextInt();
		
		if (sumaUsuario == sumaAleatoria) {
			System.out.println("¡¡¡¡Correcto!!!!");
		} else {
			System.out.println("¡NOOO!, la suma es: "+ sumaAleatoria);
		}
		// Cerramos el Scanner
		sc.close();
	}

}
