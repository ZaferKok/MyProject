package replit;

import java.util.Scanner;

public class Q69 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int l = word.length()/2;
		String sum = "";
		for (int i=0; i<l; i++) {
		sum += word.charAt(i);
		
		}System.out.print(sum);System.out.println(sum);
	}

}
