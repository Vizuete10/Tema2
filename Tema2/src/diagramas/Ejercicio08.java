package diagramas;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos una nueva variable para el número 1
		int num1;
		
		//Creamos una nueva variable para el número 2
		int num2;
		
		//Creamos una nueva variable para el número 3
		int num3;
		
		//Pedimos al usuario que introduzca tres números
		System.out.println("Introduce tres números: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		//Hacemos una condición en caso de que número sea mayor
		if ((num1>num2) && (num1>num3)) {
		 
			//Imprimimos el mensaje correspondiente
			System.out.println("Número 1 es mayor que número 2 y 3");
			
		} else if ((num2>num1)&&(num2>num3)) {
		
			//Imprimimos el mensaje correspondiente
			System.out.println("Número 2 es mayor que número 1 y 3");
			
		} else {
			
			//Imprimimos el mensaje correspondiente
			System.out.println("Número 3 es mayor que número 1 y 2");
		}
	
		//Cerramos el Scanner
		sc.close();
	}
	
}