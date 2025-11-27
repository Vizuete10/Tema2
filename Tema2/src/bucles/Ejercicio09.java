package bucles;

import java.util.Scanner;

public class Ejercicio09 {
	
    public static void main(String[] args) {
    	// Creamos un nuevo Scanner
    	 Scanner sc = new Scanner(System.in);
    	// Pedimos al usuario que introduzca un número
		System.out.print("Introduce una hora: ");
		int horas = sc.nextInt();
		
		assert horas >= 0 && horas < 24 : "La hora debe estar entre 0 y 23";
		
		sc.close();
    	
    }
}
