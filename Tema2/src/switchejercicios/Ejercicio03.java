package switchejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables para el primer numero y el segundo numero
		int num1;
		int num2;

		// Declaramos la variable para la opción elegida
		String opcion;

		// Pedimos al usuario que introduzaca dos valores
		System.out.println("Introduce dos número enteros : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		// Imprimimos por pantalla las opciones y pedimos que eliga una
	
		System.out.println("Según este menu elige una de las 4 opciones escribiendo por pantalla la letra de la opción");
		System.out.println("A. SUMAR NÚMEROS");
		System.out.println("B. RESTAS NÚMEROS");
		System.out.println("C. MULTIPLICAR NÚMEROS");
		System.out.println("D. DIVIDIR NÚMEROS");
		opcion = sc.next();

		switch (opcion) {
		case "A", "a" -> System.out.println("La suma es : " + (num1 + num2));
		case "B", "b" -> System.out.println("La resta es : " + (num1 - num2));
		case "C", "c" -> System.out.println("La multiplicación es : " + (num1 * num2));
		case "D", "d" -> {
			if (num2 !=0) {
				System.out.println("La división es : " + (double) (num1 / num2));
			} else {
				System.out.println("No se puede dividir entre 0");
			}
		}
		default -> System.out.println("Las opciones son A,B,C o D no te las inventes");
		}
		// Cerramos el Scanner
		sc.close();
	}

}
