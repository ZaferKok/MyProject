package replit;

import java.util.Scanner;

public class Q88 {

	public static void main(String [] args) {

		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    word = word.toLowerCase().replace(" ", "");
		//String car = "racecar";
	    // 				0123456	
	 
		boolean result = false;
		int l = word.length();
		
		for (int i=0; i<=(l/2)-1; i++) {
			if (word.charAt(i)==word.charAt(l-1-i)) {
			result = true;
			System.out.println("1. " +result);
			}else {
			System.out.println("2. " +result);
			result = false;
			}
		}System.out.println("3. " +result);
	}
}
