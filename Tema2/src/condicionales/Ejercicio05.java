package condicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * Pruebas mínimas a realizar:
		 * 
		 *  1. Ambos criterios CUMPLEN (Aplicación de Descuento):
		 * Datos de entrada: Distancia = 1000 km, Días = 10
		 * Precio Base: 1000 * 2.5 = 2500.0€
		 * Descuento Aplicado: 2500.0 * 0.30 = 750.0€
		 * Resultado esperado: 
		 * Mensaje: "¡ENHORABUENA! Cumple con los requisitos para la tarifa especial. Se ha aplicado una reducción del 30% al billete."
		 * Precio Final: 1750.0€
		 * Resultado obtenido: 1750.0€
		 * 
		 *  2. Criterio de Distancia NO CUMPLE (No hay Descuento):
		 * Datos de entrada: Distancia = 700 km, Días = 10
		 * Precio Base: 700 * 2.5 = 1750.0€
		 * Resultado esperado: 
		 * Mensaje: "No cumple con los requisitos para la reducción del 30%."
		 * Precio Final: 1750.0€
		 * Resultado obtenido: 1750.0€
		 * 
		 *  3. Criterio de Días NO CUMPLE (No hay Descuento):
		 * Datos de entrada: Distancia = 900 km, Días = 5
		 * Precio Base: 900 * 2.5 = 2250.0€
		 * Resultado esperado: 
		 * Mensaje: "No cumple con los requisitos para la reducción del 30%."
		 * Precio Final: 2250.0€
		 * Resultado obtenido: 2250.0€
		 * 
		 *  4. Ambos criterios NO CUMPLEN (No hay Descuento):
		 * Datos de entrada: Distancia = 100 km, Días = 3
		 * Precio Base: 100 * 2.5 = 250.0€
		 * Resultado esperado: 
		 * Mensaje: "No cumple con los requisitos para la reducción del 30%."
		 * Precio Final: 250.0€
		 * Resultado obtenido: 250.0€
		 * 
		 *  5. Criterios en el LÍMITE (No hay Descuento, ya que es ">" y no ">= "):
		 * Datos de entrada: Distancia = 800 km, Días = 7
		 * Precio Base: 800 * 2.5 = 2000.0€
		 * Resultado esperado: 
		 * Mensaje: "No cumple con los requisitos para la reducción del 30%."
		 * Precio Final: 2000.0€
		 * Resultado obtenido: 2000.0€
		 * 
		 */
		
		
		
		// Objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Definición de constantes y variables
		// Precio por kilometro
		final double PRECIO_POR_KM = 2.5;

		// Porcentaje de descuento
		final double PORCENTAJE_DESCUENTO = 0.30;

		// Dias minimos
		final int DIAS_MINIMOS = 7;

		// Distancia minima
		final int DISTANCIA_MINIMA = 800;

		// Declaramos una variable para la distancia
		double distancia;

		// Declaramos una variable para los dias de estancia
		int diasEstancia;

		// Declaramos una variable para el precio base sin descuento
		double precioBase;

		// Declaramos una variable para el descuento
		double descuentoAplicado = 0;

		// Declaramos una variable para el precio final
		double precioFinal;

		// Solicitar datos al usuario
		System.out.print("Ingrese la distancia a recorrer en kilómetros (km): ");
		distancia = scanner.nextDouble();

		System.out.print("Ingrese el número de días de estancia: ");
		diasEstancia = scanner.nextInt();

		// Calcular el precio base
		precioBase = distancia * PRECIO_POR_KM;

		if ((diasEstancia > DIAS_MINIMOS) && (distancia > DISTANCIA_MINIMA)) {
			// Aplicamos descuento
			descuentoAplicado = precioBase * PORCENTAJE_DESCUENTO;
			precioFinal = precioBase - descuentoAplicado;

			System.out.println("¡ENHORABUENA! Cumple con los requisitos para la tarifa especial.");
			System.out.println("Se ha aplicado una reducción del 30% al billete.");
		} else {
			// No hay descuento
			precioFinal = precioBase;

			System.out.println("No cumple con los requisitos para la reducción del 30%.");
		}

		// Mostramos los resultados
		System.out.println("PRECIO FINAL DEL BILLETE:" + precioFinal);

		// Cerrar el objeto Scanner
		scanner.close();
	}
}
