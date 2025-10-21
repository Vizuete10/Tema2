package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable para el número del dni
		int numeroDni;
		
		// Declaramos una variable para la letra del dni
		String letra;
		
		// Declaramos una variable para la longitud del número introducido
		int longitud;
		
		
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
			default ->{
				yield "E";
			}
			};
			
			
			
		}
		
		
	}

}
