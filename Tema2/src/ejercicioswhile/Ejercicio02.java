package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para el número
		int num;
		
		//Declaramos una variable para la suma
		int suma=0;
		
		//Pedimos al usuario que introduzca un número
		System.out.println("Introduce un número");
		num = sc.nextInt();
		
		//Mientras el número sea positivo
		while (num>=0) {
			
			//Suma un número a la cantidad de números contados
			suma++;
			
			//Seguimos pidiendo al usuario más números
			System.out.println("Introduce un número");
			num = sc.nextInt();
			
		}
		
		//Imprimimos la suma
		System.out.println("La suma es " + suma);
		
		//Cerramos el Scanner
		sc.close();

	}

}