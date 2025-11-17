package bucles;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables para el números
        int num1;
        
        // Declaramos las variables para el número
        int num2;

        // Declaramos la variable para el mínimo común múltiplo
        int mcm = 0;

        // Declaramos la variable para el mayor de los dos números (punto de partida)
        int max;

        // Declaramos la variable para el múltiplo
        int multiplo;

        // Pedimos al usuario que introduzca el primer número
        System.out.print("Introduce el primer número entero positivo: ");
        num1 = sc.nextInt();

        // Pedimos al usuario que introduzca el segundo número
        System.out.print("Introduce el segundo número entero positivo: ");
        num2 = sc.nextInt();

        // Miramos cuál es el mayor de los dos números
        max = Math.max(num1, num2);

        // Inicializamos el mcm con 0 (aún no encontrado)
        mcm = 0;

        // Bucle for para buscar el primer múltiplo común (ineficiente)
        for (int i = max; mcm == 0; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                mcm = i;  // Guardamos el primer múltiplo común
            }
        }

        // Inicializamos el múltiplo al mayor de los dos números
        multiplo = max;

        // Mientras no encontremos un múltiplo común (mcm == 0)
        while (mcm == 0) {
            if (multiplo % num1 == 0 && multiplo % num2 == 0) {
                // Establecemos el valor del mcm
                mcm = multiplo;
            }

            // Incrementamos el múltiplo
            multiplo++;
        }

        // Mostramos el resultado del mcm
        System.out.println("El m.c.m. de " + num1 + " y " + num2 + " es: " + mcm);

        // Cerramos el Scanner
        sc.close();
    }
}