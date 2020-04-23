package replit;

import java.util.Scanner;

public class Q64 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int l = word.length();
		if (l>=3 && l%2==1) {
			System.out.println(word.charAt(l/2));
		}if(l==1) {
			System.out.println(word+word+word);
		}if(l>=4 && l%2==0) {
			System.out.println(word.charAt((l/2)-1)+""+word.charAt(l/2));
		}if (l==2) {
			System.out.println(word+word);
		}
		
		
	}

}
