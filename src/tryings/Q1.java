package tryings;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		/*
		 * Ask the user for a string and 
		 * print a new string made of 3 copies of the last 2 chars of the original string.
		 * The string length will be at least 2.
		 * input = "Hello"				output = "lololo"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string:");
		String input = scan.nextLine();
		
		String lastTwoLetters = input.substring(input.length()-2);
		System.out.println(lastTwoLetters+lastTwoLetters+lastTwoLetters);		
	}
}
