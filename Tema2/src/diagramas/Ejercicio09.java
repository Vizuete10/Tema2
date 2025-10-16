package diagramas;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		//Creamos una variable para la calificación
		int nota;
		
		//Pedimos al usuario que introduzca su calificación
		System.out.println("Introduzca su calificación");
		nota = sc.nextInt();
		
		//Hacemos una condición para transformar esa nota en calificación alfabética
		if ((nota>=0)&&(nota<3)) {
			
			//Imprimimos el mensaje correspondiente
			System.out.println("Muy decente");
			
		} else if ((nota>=3)&&(nota<5)) {
			
			//Imprimimos el mensaje correspondiente
			System.out.println("Insuficiente");
			
		} else if ((nota>=5)&&(nota<7)) {
		
			//Imprimimos el mensaje correspondiente
			System.out.println("Bien");
		
		} else if ((nota>=7)&&(nota<9)) {
			
			//Imprimimos el mensaje correspondiente
			System.out.println("Notable");
			
		} else if ((nota>=9)&&(nota<10)) {
		
			//Imprimimos el mensaje correspondiente
			System.out.println("Sobresaliente");
			
		} else {
			
			//Imprimimos el mensaje correspondiente
			System.out.println("La nota debe ser entre 0 y 10");
		}
		
		//Cerramos el Scanner
		sc.close();
	
	} 

}