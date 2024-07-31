
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int lowerBound = 1;
		int upperBound = 100; // You can adjust the range as needed
		int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
		int maxAttempts = 10; // Set the maximum number of attempts

		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I've chosen a number between " + lowerBound + " and " + upperBound + ".");
		System.out.println("Try to guess it within " + maxAttempts + " attempts.");

		for (int attempt = 1; attempt <= maxAttempts; attempt++) {
			System.out.print("Attempt #" + attempt + ": Enter your guess: ");
			int userGuess = scanner.nextInt();

			if (userGuess == targetNumber) {
				System.out.println("Congratulations! You guessed it correctly.");
				break;
			} else if (userGuess < targetNumber) {
				System.out.println("Try a higher number.");
			} else {
				System.out.println("Try a lower number.");
			}
		}

		System.out.println("The correct number was: " + targetNumber);
		scanner.close();
	}
}

