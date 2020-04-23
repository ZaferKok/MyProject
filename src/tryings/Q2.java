package tryings;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*Ask the user for a word and print the word with each character doubled.
input = "abc"			output = "aabbcc" */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String w = scan.next();
		
		int l = w.length();
		
		for (int i=0; i<l; i++) {
			String j = w.substring(i, i+1); //w.charAt(i) + w.charAt(i)
		System.out.print(j+j);
		}
	}
}
