package bucles;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        //Creamos un Scanner
        Scanner sc = new Scanner(System.in);

        //Declaramos una variable para el número
        int ultimodado;

        //Declaramos una variable para el contador de números
        int contador=0;

        //Declaramos una variable para el contador de números fallados
        int contadorfallados=0;

        //Declaramos una variable para el nuevo número
        int nuevoNumero=0;

        //Pedimos al usuario que introduzca un número
        System.out.println("Introduzca el primer número");
        ultimodado = sc.nextInt();

        //Iniciamos el bucle
        do {
            System.out.print("Dime un número: ");
            nuevoNumero = sc.nextInt();
            contador++;

            if (nuevoNumero == 0) {
                break;
            }

            if (nuevoNumero < ultimodado) {
                System.out.println("Fallo es menor.");
                contadorfallados++;
            }

            ultimodado = nuevoNumero;

        } while (nuevoNumero != 0);


        //Actualizamos el último número introducido
        ultimodado = nuevoNumero;

        //Introducimos el total de números introducidos y números fallados
        System.out.println("Total de números introducidos: " + contador );
        System.out.println("Números fallados: " + contadorfallados );

        //Cerramos el Scanner
        sc.close();

    }
}
