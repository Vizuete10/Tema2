package bucles;

import java.util.Scanner;

public class Ejercicio09 {
	
    public static void main(String[] args) {
    	// Creamos un nuevo Scanner
    	 Scanner sc = new Scanner(System.in);
    
    	 // Declaramos una variable para el número
    	 int numero;
    	 
    	 // Pedimos un número al usuario
    	 System.out.print("Introduce un número entero positivo: ");
    	 numero = sc.nextInt();
    	 
    	 // Contamos cuántos dígitos tiene el número
    	 int contadorDigitos = 0;
    	 
    	 int numeroAuxiliar = numero;
    	 
    	 while (numeroAuxiliar > 0) {
			 numeroAuxiliar /= 10;
			 contadorDigitos++;
		 }
    	 
    	 // Mostramos el resultado
    	 System.out.println("El número " + numero + " tiene " + contadorDigitos + " dígitos.");
		 
    	 
		 // Cerramos el Scanner
		sc.close();
    	
    }
}
