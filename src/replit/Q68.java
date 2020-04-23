package replit;

import java.util.Scanner;

public class Q68 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String sentence = scan.nextLine();

		boolean result = false;
		
		if (sentence.contains(word)) {
		result = true;	
		
		}System.out.println(result);
	}

}
