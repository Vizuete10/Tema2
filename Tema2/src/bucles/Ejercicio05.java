package bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable para el número
		int num;
		
        // Pedir un número entre 0 y 20
        do {
            System.out.print("Introduce un número entero entre 0 y 20: ");
            num = sc.nextInt();
        } while (num < 0 || num > 20);
		
		for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
		
		// Cerramos el Scanner
		sc.close();
		
	}

}
