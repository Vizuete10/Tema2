package diagramas;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		// Crear un objeto Scanner para leer datos de entrada
		Scanner sc = new Scanner(System.in);

		// Número de horas trabajadas
		int numHoras;

		// Tarifa por hora de trabajo
		double tarifaHora;

		// Salario bruto antes de impuestos
		double salBruto;

		// Salario neto después de impuestos
		double salNeto;

		// Impuestos o tasas aplicadas
		double tasas = 0;

		// Nombre del trabajador
		String nombre;

		// Solicitar y leer el nombre del trabajador
		System.out.println("Introduce su nombre: ");
		nombre = sc.nextLine();

		// Solicitar y leer el número de horas trabajadas
		System.out.println("Introduce el número de horas que trabaja: ");
		numHoras = sc.nextInt();

		// Solicitar y leer la tarifa por hora
		System.out.println("Introduce el valor de la tarifa por hora: ");
		tarifaHora = sc.nextDouble();

		// Calcular el salario bruto
		if (numHoras <= 35) {
			// Si trabaja 35 horas o menos, se multiplica directamente
			salBruto = numHoras * tarifaHora;
		} else {
			// Si trabaja más de 35 horas, las horas extra se pagan a 1.5 veces la tarifa
			salBruto = 35 * tarifaHora + (numHoras - 35) * tarifaHora * 1.5;
		}

		// Calcular el salario neto aplicando impuestos según el salario bruto
		if (salBruto <= 500) {
			// Si el salario bruto es menor o igual a 500, no se aplican impuestos
			salNeto = salBruto;
		} else if (salBruto <= 900) {
			// Si está entre 501 y 900, se aplica un impuesto del 25%
			tasas = salBruto * 0.25;
			salNeto = salBruto - tasas;
		} else {
			// Si es mayor a 900, se aplica un impuesto del 45%
			tasas = salBruto * 0.45;
			salNeto = salBruto - tasas;
		}

		// Mostrar los resultados
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario Neto: " + salNeto);
		System.out.println("Salario Bruto: " + salBruto);
		System.out.println("Tasas: " + tasas);

		// Cerrar el Scanner
		sc.close();
	}
}
