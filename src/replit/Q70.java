package replit;

import java.util.Scanner;

public class Q70 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
	
		int i = word.length();
		
		if ((word.charAt(0)=='x'|| word.charAt(0)=='X') && (word.charAt(i-1)=='x'|| word.charAt(i-1)=='X')) {
			System.out.println(word.substring(1, i-1));
		}else if (word.charAt(i-1)=='x'|| word.charAt(i-1)=='X') {
			System.out.println(word.subSequence(0, i-1));
		}else if (word.charAt(0)=='x'|| word.charAt(0)=='X') {
			System.out.println(word.substring(1));
		}else {
			System.out.println(word);
		}
	}

}
