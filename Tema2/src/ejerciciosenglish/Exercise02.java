package ejerciciosenglish;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create the Scanner
		Scanner sc = new Scanner(System.in);

		double principalMonney;
		String accountType;
		double interestRate = 0.0;
		boolean isValidAccount = true;
		double interestEarned;

		System.out.println("Enter the amount of money: ");
		principalMonney = sc.nextDouble();

		System.out.println("Enter the bank account type (A, B, C or X):");
		System.out.println("A. 1,5 %" + "\n" + "B. 2 %" + "\n" + "C. 1,5 %" + "\n" + "X. 5 % ");
		accountType = sc.next().toUpperCase();

		switch (accountType) {
		case "A", "C" -> interestRate = 1.5;
		case "B" -> interestRate = 2;
		case "X" -> interestRate = 5;
		default -> {
			System.out.println("Error: Invalid account type.");
			isValidAccount = false;
			}
		}

		if (isValidAccount) {
			interestEarned = principalMonney * (interestRate / 100.0);

			System.out.println("The amount of interest earned in one year is: " + interestEarned);

		}
		// Close the scanner
		sc.close();

	}

}
