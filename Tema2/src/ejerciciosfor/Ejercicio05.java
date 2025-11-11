package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

    	//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para el número
		int num;
		
		//Creamos una variable para el factorial
		long factorial = 1; 
		
		//Pedimos al usuario que introduzca un número
			System.out.println("Introduce un número");
			num = sc.nextInt();
			
			//Creamos un bucle for para calcular el factorial
			for (int cont= num;  cont >=1; cont--) {
				System.out.println(cont);
				if (cont !=1) {
					//Mostramos el signo de multiplicación
					System.out.print(" x ");
				}
				//Calculamos el factorial
				factorial *= cont;
			}
		
			//Mostramos el factorial
			System.out.println("El factorial de " + num + " es: " + factorial);
			
			//Cerramos el Scanner
			sc.close();
    }
}

