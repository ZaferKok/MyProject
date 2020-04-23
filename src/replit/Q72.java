package replit;

import java.util.Scanner;

public class Q72 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email = scan.next();

		// input: mesut_techproed@gmail.com
		// output: techproed_mesut@gmail.com
		
		int i = email.indexOf("_");
		int j = email.indexOf("@");
		if(email.contains("_")) {
			System.out.println(email.substring(i+1, j)+"_"+email.subSequence(0, i)+email.substring(j));

		}else {
			System.out.println(email);
		}
		
	}

}
