package ifelse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int x1;
		int x2;
		
		System.out.println("Según esta ecuación : ax^2 + bx + c = 0");
		System.out.println("Introduce el valor de a: ");
		a = sc.nextInt();
		System.out.println("Introduce el valor de b: ");
		b = sc.nextInt();
		System.out.println("Introduce el valor de c: ");
		c = sc.nextInt();
		
		// Calculamos las posibles soluciones
		
		// Evaluamos las posibles soluciones
        if (discriminante > 0) {
            // Dos soluciones reales diferentes
            x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            // Una sola solución real
            x1 = -b / (2 * a);
            System.out.println("La solución doble es: x = " + x1);
        } else {
            // No hay soluciones reales
            System.out.println("La ecuación no tiene soluciones reales.");
        }

        sc.close();
    }
}
				}

}
