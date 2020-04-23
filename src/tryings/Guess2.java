package tryings;

import java.util.Scanner;

public class Guess2 {

	public static void main(String[] args) {
		// Random random = new Random();

		// int number = random.nextInt(101);

		Scanner input = new Scanner(System.in);

		System.out.println("Guess a magic number between 0 to 100");
		int number = (int) (Math.random() * 101);
		int guess = 0;
		while (guess != number) {
			System.out.println("Enter your guess: ");
			guess = input.nextInt();
			if (guess == number) {
				System.out.println("Yes the number is " + number);
			} else if (guess > number) {
				System.out.println("Your guess is too high");
			} else if (guess < number) {
				System.out.println("Your guess is too low");

			}
		}
	}
}