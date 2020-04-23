package replit;

import java.util.Scanner;

public class Q58 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the text:");
		String input = scan.nextLine();
	
		System.out.println("Length is: " + input.length());
		System.out.println(input.charAt(0));
	}

}
