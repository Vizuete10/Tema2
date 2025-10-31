package loops;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para el número
		int num;
		
		//Declaramos una variable para la suma
		int suma=0;
		
		System.out.println("Introduce un número");
		num = sc.nextInt();
		
		//Mientras el número sea positivo
		while (num>=0) {
			
			//Sumamos el número a la suma
			suma+=num;
			
			//Pedimos otro número al usuario
			System.out.println("Introduce un número");
			num = sc.nextInt();
		}
		
		//Imprimimos la suma
		System.out.println("La suma es " + suma);
		
		//Cerramos el Scanner
		sc.close();
		

	}

}