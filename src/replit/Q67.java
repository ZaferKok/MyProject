package replit;

import java.util.Scanner;

public class Q67 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
	

	if (word.length()>5) {
		System.out.println("Too long!");
	}
	else if (word.length()<5) {
		System.out.println("Too short!");
	}
	else{
		for (int i=0; i<word.length(); i++) {
			System.out.print(word.charAt(word.length()-1-i));
		}
	}
	}

}
