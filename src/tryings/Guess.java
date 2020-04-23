package tryings;

import java.util.Random;
import java.util.Scanner;

// Generate a random number between 0-100 to be guessed use scanner and while loop
public class Guess {

	public static void main(String[] args) {
		Random random = new Random();

		Scanner scanner = new Scanner(System.in);

		int number = random.nextInt(100);
		int guess = -1;
		
		int i =0
				;
		while (guess != number) {
			
			i++;
			System.out.println(i + ". denemeniz!");
			
			System.out.print("Enter your guess: ");
			guess = scanner.nextInt();
				
					
			if (guess < number) {
				System.out.println("Too low, please try again");
			} else if (guess > number) {
				System.out.println("Too high, please try again");
			} else {
				System.out.println("Correct, the number was " + number);
			}
		}
	}
}
