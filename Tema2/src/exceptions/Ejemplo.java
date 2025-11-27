package exceptions;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		
		// Creacion del Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitar edad al usuario
		System.out.println("Introduce tu edad: ");
		
		
		try {
			// Bloque try
			// Aqui se coloca el codigo que puede generar un fallo
			// si el usuario introduce un valor no numerico
			// Java va a saltar al bloque catch
						
			
		int edad = sc.nextInt(); // Esta linea puede generar una excepcion ImputMismatchException, si el usuario introduce un valor no numerico
		
		// ASERCION
		// Comprobar que la edad es un valor que tiene sentido
		// Las aserciones son comprobaciones internas que hacemos en el codigo. Se activan con -ea
		// Si la asercion falla, se lanza una excepcion --> AssertionError
		
		assert (edad >= 0 && edad< 130 ) : "Edad no valida ";
		
		// Si no a fallado nada, mostramos la edad
		
		System.out.println("Registro completado correctamente");
		System.out.println("Edad: " + edad);
		
		} catch (InputMismatchException e) {
			// Bloque catch
			// Aqui se maneja la excepcion tipo InputMismatchException, es decir, 
			// cuando el usuario introduce un valor no numerico
			
			System.out.println("Error: Debes introducir un valor numerico para la edad.");
			
		} catch (AssertionError e) {
			// Bloque catch
			// Aqui se maneja la excepcion tipo AssertionError, es decir,
			// cuando la asercion de la edad no valida falla
			
			System.out.println("Error: " + e.getMessage());
			
		} catch (Exception e) {
			// Bloque catch generico
			// Aqui se maneja cualquier otra excepcion no prevista
			
			System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
			
		} finally {
			// Bloque finally
			// Este bloque se ejecuta siempre, haya o no excepcion
			System.out.println("Gracias por usar el sistema de registro de edades.");
			
			// Cierre del Scanner
			sc.close();
		}
		
	}

}
