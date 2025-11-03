package ejerciciosdowhile;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Inicializamos la variable num para los números
		int num = 1;

		// Hacemos un bucle para escribir los números pares entre 1 y 200
		do {
			// Comprobamos los números pares
			if (num % 2 == 0) {
				System.out.println("Número par: " + num);
			}

			num++;

		} while (num <= 200);

	}

}