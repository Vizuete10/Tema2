package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		/* Pruebas mínimas a realizar:
		 *  1. Introducir un número válido de 8 dígitos (Longitud correcta); 50570889
		 * (El módulo 50570889 % 23 = 19, que corresponde a la letra 'L')
		 * Resultado esperado: "50570889L"
		 * Resultado obtenido: "50570889L" 
		 * 
		 *  2. Introducir un número de 7 dígitos (Longitud incorrecta); 1234567
		 * Resultado esperado: "El número debe de ser de 8 cifras"
		 * Resultado obtenido: "El número debe de ser de 8 cifras" 
		 * 
		 *  3. Introducir un número de 9 dígitos (Longitud incorrecta); 123456789
		 * Resultado esperado: "El número debe de ser de 8 cifras"
		 * Resultado obtenido: "El número debe de ser de 8 cifras" 
		 * 
		 *  4. Introducir un número que dé un módulo '0' (Caso extremo switch); 12345674
		 * (El módulo 12345674 % 23 = 0, que corresponde a la letra 'T')
		 * Resultado esperado: "12345674T"
		 * Resultado obtenido: "12345674T"
		 * 
		 *  5. Introducir un número que dé un módulo '22' (Valor por defecto "E", aunque no debería ocurrir con un DNI válido); 50570894
		 * (El módulo 50570894 % 23 = 22, que corresponde a la letra 'E' por 'default')
		 * Resultado esperado: "50570894E"
		 * Resultado obtenido: "50570894E"
		 * 
		 *  6. Introducir el valor máximo posible para un 'int' con 8 dígitos; 99999999
		 * (El módulo 99999999 % 23 = 22, que corresponde a la letra 'E' por 'default')
		 * Resultado esperado: "99999999E"
		 * Resultado obtenido: "99999999E"
		 */
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable para el número del dni
		int numeroDni;
		
		// Declaramos una variable para la letra del dni
		String letra = null;
		
		// Declaramos una variable para la longitud del número introducido
		int longitud;
		
		// Declaramos una variable para el modulo del DNI
		int moduloDni;
		
		// Pedimos al usuario que introduzca los números del DNI
		System.out.println("Introduce una combinación de 8 digitos del DNI ");
		numeroDni = sc.nextInt();
		
		// Vemos la longitud del número
		longitud = String.valueOf(numeroDni).length();
		
		if ( longitud != 8) {
			
			System.out.println("El número debe de ser de 8 cifras");
			
		} else {
			
			moduloDni = numeroDni %23;
			
			letra = switch (numeroDni % 23) {
			case 0 ->{ 
				yield "T";
			}
			case 1 ->{ 
				yield "R";
			}
			case 2 ->{ 
				yield "W";
			}
			case 3 ->{ 
				yield "A";
			}
			case 4 ->{ 
				yield "G";
			}
			case 5 ->{ 
				yield "M";
			}
			case 6 ->{ 
				yield "Y";
			}
			case 7 ->{ 
				yield "F";
			}
			case 8 ->{ 
				yield "P";
			}
			case 9 ->{ 
				yield "D";
			}
			case 10 ->{ 
				yield "X";
			}
			case 11->{ 
				yield "B";
			}
			case 12 ->{ 
				yield "N";
			}
			case 13 ->{ 
				yield "J";
			}
			case 14 ->{ 
				yield "Z";
			}
			case 15 ->{ 
				yield "S";
			}
			case 16 ->{ 
				yield "Q";
			}
			case 17 ->{ 
				yield "V";
			}
			case 18 ->{ 
				yield "H";
			}
			case 19 ->{ 
				yield "L";
			}
			case 20 ->{ 
				yield "C";
			}
			case 21 ->{ 
				yield "K";
			}
			default ->{
				yield "E";
			}
			};	
		}
		
		// Imprimimos el DNI junto a la letra 
		System.out.println(numeroDni + letra);

		
		// Cerramos el Scanner
		sc.close();
	}

}
