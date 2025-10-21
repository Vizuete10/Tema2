package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		 /* 
		 * Pruebas mínimas a realizar:
		 * 
		 * 1. Introducir un número positivo; 25
		 *    Resultado esperado: "El valor absoluto del valor introducido es: 25"
		 *    Resultado obtenido: "El valor absoluto del valor introducido es: 25"
		 * 
		 * 2. Introducir cero; 0
		 *    Resultado esperado: "El valor absoluto del valor introducido es: 0"
		 *    Resultado obtenido: "El valor absoluto del valor introducido es: 0"
		 * 
		 * 3. Introducir un número negativo; -42
		 *    Resultado esperado: "El valor absoluto del valor introducido es: 42"
		 *    Resultado obtenido: "El valor absoluto del valor introducido es: 42"
		 * 
		 * 4. Introducir un número negativo grande; -9999
		 *    Resultado esperado: "El valor absoluto del valor introducido es: 9999"
		 *    Resultado obtenido: "El valor absoluto del valor introducido es: 9999"
		 * 
		 * 5. Introducir un número positivo grande; 9999
		 *    Resultado esperado: "El valor absoluto del valor introducido es: 9999"
		 *    Resultado obtenido: "El valor absoluto del valor introducido es: 9999"
		 */
		
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable para guardar el número
		int numero;
		
		// Declaramos la variable para guardar el valor absoluto del número
		int valorAbso;
		
		// Pedimos al usuario que introduzca un número
		System.out.println("Introduce un número");
		numero = sc.nextInt();
		
		// Utilizamos un ternario para hallar el valor del valor absoluto
		valorAbso = (numero>=0)? numero : -(numero);
		
		// Imprimimos por pantalla el valor abosulto
		System.out.println("El valor absoluto del valor introducido es: " + valorAbso);
		
		// Cerramos el Scanner
		sc.close();
	}

}
