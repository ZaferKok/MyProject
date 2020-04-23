package tryings;

import java.util.Scanner;

public class Vovels {

	public static void main(String[] args) {
		/*Vovels*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an alphabet character");
		String s = scan.next();
		s.toUpperCase();
		char c = s.charAt(0);
		boolean isV=false;
		
		
		switch (c) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isV=true;
			
		}if (true) {
			System.out.println(c + " is Vovel of the alphabet");
		}else {
			if (c>='A' && c<='Z') {
				System.out.println(c + " is a Consonant");
			}else {
				System.out.println("It is not a alphabet character");
			}
		}
	}

}
