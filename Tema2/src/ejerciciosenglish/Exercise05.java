package ejerciciosenglish;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Import the Scanner class to read user input

		// Create a Scanner object to read from the console
		Scanner scanner = new Scanner(System.in);

		// Ask for the first piece of data
		System.out.print("Give me one type of data (D, T, or V): ");
		// Read the type (e.g., "V") and force it to uppercase
		String data1_type = scanner.next().toUpperCase();

		System.out.print("Give the value for that data: ");
		// Read the numeric value, using double for decimals
		double data1_value = scanner.nextDouble();

		// Ask for the second piece of data
		System.out.print("Give me another type of data (D, T, or V): ");
		String data2_type = scanner.next().toUpperCase();

		System.out.print("Give the value for that data: ");
		double data2_value = scanner.nextDouble();

		// Logic to find the missing variable using 'if' statements

		// Case 1: The user entered V and T, so we calculate D (Displacement)
		// D = V * T
		if ((data1_type.equals("V") && data2_type.equals("T")) || (data1_type.equals("T") && data2_type.equals("V"))) {

			double V, T;

			// Assign the values correctly no matter the order
			if (data1_type.equals("V")) {
				V = data1_value;
				T = data2_value;
			} else {
				V = data2_value;
				T = data1_value;
			}

			double D = V * T;
			System.out.println("RESULT: D = " + D);
		}

		// Case 2: The user entered D and T, so we calculate V (Velocity)
		// V = D / T
		else if ((data1_type.equals("D") && data2_type.equals("T"))
				|| (data1_type.equals("T") && data2_type.equals("D"))) {

			double D, T;

			if (data1_type.equals("D")) {
				D = data1_value;
				T = data2_value;
			} else {
				D = data2_value;
				T = data1_value;
			}

			double V = D / T;
			System.out.println("RESULT: V = " + V);
		}

		// Case 3: The user entered D and V, so we calculate T (Time)
		// T = D / V
		else if ((data1_type.equals("D") && data2_type.equals("V"))
				|| (data1_type.equals("V") && data2_type.equals("D"))) {

			double D, V;

			if (data1_type.equals("D")) {
				D = data1_value;
				V = data2_value;
			} else {
				D = data2_value;
				V = data1_value;
			}

			double T = D / V;
			System.out.println("RESULT: T = " + T);
		}

		// Error case: User entered the same type twice or invalid types
		else {
			System.out.println("Error: You must enter two DIFFERENT types from (D, T, V).");
		}

		// Close the scanner to prevent resource leaks
		scanner.close();

	}

}
