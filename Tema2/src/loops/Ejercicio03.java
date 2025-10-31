package loops;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
	
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para el número
		int num;
		
		//Declaramos una variable para la suma
		int suma=0;
		
		//Declaramos una variable para la cantidad de números
		int cantNum=0;
		
		//Declaramos una variable para la media
		int media=0;
		
		//Pedimos al usuario que introduzca un número
		System.out.println("Introduce un número");
		num = sc.nextInt();
		
		//Mientras el número sea positivo
		while (num>=0) {
			
			//Sumamos el número a la suma
			suma+=num;
			
			//Sumamos un número a la cantidad de números
			cantNum++;
			
			//Pedimos al usuario otro número
			System.out.println("Introduce un número");
			num = sc.nextInt();
			
		}
		
		//Calculamos la media 
		media = suma / cantNum;
		
		//Imprimimos la media
		System.out.println("La media es " + media);
		
		//Cerramos el Scanner
		sc.close();
	
	}

}