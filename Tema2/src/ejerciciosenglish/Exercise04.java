package ejerciciosenglish;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		// Create a Scanner object to read from the console
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the data
        System.out.print("Enter the cost (in cents): ");
        int cost = scanner.nextInt();
        
        System.out.print("Enter the amount paid (in cents): ");
        int paid = scanner.nextInt();

        // Calculate the total change
        int totalChange = paid - cost;

        // Prepare the result string
        StringBuilder result = new StringBuilder();
        int count;

        // Calculation logic using only 'if'
        
        // Coin 1: 200 cents (2 Euro)
        count = 0; // Reset count for the new coin
        if (totalChange >= 200) {
            count = totalChange / 200;      
            totalChange = totalChange % 200;  
        }
        result.append(count).append(" ");

        // Coin 2: 100 cents (1 Euro) 
        count = 0;
        if (totalChange >= 100) {
            count = totalChange / 100;
            totalChange = totalChange % 100;
        }
        result.append(count).append(" ");

        // Coin 3: 50 cents
        count = 0;
        if (totalChange >= 50) {
            count = totalChange / 50;
            totalChange = totalChange % 50;
        }
        result.append(count).append(" ");

        // Coin 4: 20 cents 
        count = 0;
        if (totalChange >= 20) {
            count = totalChange / 20;
            totalChange = totalChange % 20;
        }
        result.append(count).append(" ");

        // Coin 5: 10 cents 
        count = 0;
        if (totalChange >= 10) {
            count = totalChange / 10;
            totalChange = totalChange % 10;
        }
        result.append(count).append(" ");

        // Coin 6: 5 cents
        count = 0;
        if (totalChange >= 5) {
            count = totalChange / 5;
            totalChange = totalChange % 5;
        }
        result.append(count).append(" ");

        // Coin 7: 2 cents
        count = 0;
        if (totalChange >= 2) {
            count = totalChange / 2;
            totalChange = totalChange % 2;
        }
        result.append(count).append(" ");

        // Coin 8: 1 cent
        // Whatever is left in 'totalChange' is the count of 1-cent coins.
        count = totalChange;
        result.append(count);

        //Print the final result
        System.out.println("The change to give (coins for 2E, 1E, 50c, 20c, 10c, 5c, 2c, 1c) is:");
        System.out.println(result.toString());

        //Close the scanner to prevent resource leaks
        scanner.close();

		        
		      

	}

}
