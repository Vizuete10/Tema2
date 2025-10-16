package diagramas;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos una variable para el número uno
		int num1;
		
		//Creamos una variable para el número dos
		int num2;
		
		//Pedimos al usuario que introduzca dos números
		System.out.println("Introduce dos números: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		//Hacemos una condición en caso de que numero sea más grande
		if (num1>num2) {
			
			//Imprimimos el mensaje correspondiente
			System.out.println("Número 1 es mayor que número 2");
			
		} else if (num1==num2){
			
			//Imrpimimos el mensaje correspondiente
			System.out.println("Son iguales");
			
		} else { 
			
			//Imprimimos el mensaje correspondiente
			System.out.println("Número 2 es mayor que número 1");
		}
	
		//Cerramos el Scanner
		sc.close();
		
		
	}

}