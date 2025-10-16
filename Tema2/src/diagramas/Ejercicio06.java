package diagramas;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
	
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		//Creamos una nueva variable para el número uno
		int num1;
		
		//Creamos una nueva variable para el número dos
		int num2;
		
		//Pedimos al usuario que introduzca dos números
		System.out.println("Introduce dos números: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		//Hacemos una condición para saber que número es más grande 
		if (num1<num2) {
			
			//Imprimimos el mensaje correspondiente
			System.out.println(num1 + "<" + num2);
		
		} else {
			
			//Imprimimos el mensaje correspondiente
			System.out.println(num2 + "<" + num1);
			
		}
		
		//Cerramos el Scanner
		sc.close();
		
		
	}

}