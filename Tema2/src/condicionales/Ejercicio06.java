package condicionales;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		
		/*
		 * Pruebas mínimas a realizar:
		 *  1. Mes con 31 días (Ejemplo: Enero - 1):
		 * Datos de entrada: Año = 2024 (bisiesto), Mes = 1
		 * Resultado esperado: "El mes tiene 31 dias"
		 * Resultado obtenido: "El mes tiene 31 dias"
		 * 
		 *  2. Mes con 30 días (Ejemplo: Abril - 4):
		 * Datos de entrada: Año = 2023 (no bisiesto), Mes = 4
		 * Resultado esperado: "El mes tiene 30 dias"
		 * Resultado obtenido: "El mes tiene 30 dias"
		 * 
		 *  3. Febrero en un año BISIESTO (Ejemplo: Febrero - 2, Año 2024):
		 * NOTA: Para que esta prueba funcione, la lógica de 'esBisiesto' debe ser corregida.
		 * Datos de entrada: Año = 2024, Mes = 2
		 * Resultado esperado: "El mes tiene 29 dias"
		 * Resultado obtenido: "El mes tiene 29 dias"
		 * 
		 *  4. Febrero en un año NO BISIESTO (Ejemplo: Febrero - 2, Año 2023):
		 * NOTA: Para que esta prueba funcione, la lógica de 'esBisiesto' debe ser corregida.
		 * Datos de entrada: Año = 2023, Mes = 2
		 * Resultado esperado: "El mes tiene 28 dias"
		 * Resultado obtenido: "El mes tiene 28 dias"
		 * 
		 *  5. Mes INVÁLIDO (Default):
		 * Datos de entrada: Año = 2023, Mes = 13
		 * Resultado esperado: 
		 * Mensaje: "ERROR: Número de mes inválido. Debe estar entre 1 y 12."
		 * Salida final: "El mes tiene 0 dias" (debido a la inicialización 'dias=0')
		 * Resultado obtenido: ---
		 */
		
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos una variable para el número de mes
		int numMes;
		
		// Declaramos una variable para el año
		int numAno = 0;
		
		// Declaramos una variable para el número de dias
		int dias = 0;
		
		// Definimos una variable para saber si es bisiesto
		boolean esBisiesto = numAno % 4 == 0;
		
		// Pedimos al usuario el año
		System.out.println("Ingrese el año: ");
		numAno = sc.nextInt();
		// Pedimos al usuario el mes
		System.out.println("Ingrese el número del mes: ");
		numMes= sc.nextInt();
		
		switch (numMes) {
        case 1-> dias = 31; 
        case 3-> dias = 31;
        case 5-> dias = 31;
        case 7-> dias = 31;
        case 8-> dias = 31;
        case 10-> dias = 31;
        case 12-> dias = 31;
        case 4-> dias = 30;
        case 6-> dias = 30;
        case 9-> dias = 30;
        case 11-> dias = 30;
        case  2 -> {
        	if ( esBisiesto) {
        		dias =29;
        	}else {
        		dias = 28;
        	}
        }
        default->
            // Si el mes no es 1-12
            System.out.println("ERROR: Número de mes inválido. Debe estar entre 1 y 12.");
    }
		
	System.out.println("El mes tiene "+ dias +" dias");	
		
	// Cerramos el Scanner
	sc.close();
		
	}

}
