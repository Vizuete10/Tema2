package bucles;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Declaramos una variable para el número
        //Declaramos una variable para el número
        int numero;

        //Declaramos una variable para el número con las cifras invertidas
        int numeroInvertido=0;

        //Declaramos una varibale para el número auxiliar oara realizar las operaciones
        int numeroAuxiliar;

        //Declaramos una variable para la última cifra
        int ultimaCifra;

        //Pedimos un número al usuario
        System.out.print("Introduzca un número: ");
        numero = sc.nextInt();

        //Almacenaos en la variable auxiliar el número introducido por el usuario
        numeroAuxiliar = numero;

        while (numeroAuxiliar > 0) {
            ultimaCifra = numeroAuxiliar % 10;
            numeroInvertido = numeroInvertido * 10 + ultimaCifra;
            numeroAuxiliar = numeroAuxiliar / 10;
        }

        System.out.println(numeroInvertido==numero ? "Es capicúa" : "No es capicúa");

        //Cerramos el Scanner
        sc.close();
    }
}
