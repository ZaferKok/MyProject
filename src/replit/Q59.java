package replit;

import java.util.Scanner;

public class Q59 {

	public static void main(String[] args) {
		/*Instructions from your teacher:
			You have a word, do the following:

			If the word has odd number of characters
			and has 5 or more characters, print the middle three 
			characters of the word. 

			Otherwise print "invalid".

			fifteen ==> fte
			oranges==> ang
			bye ==> invalid
			java ==> invalid
			whatsup ==> ats
			# ==> invalid*/
		
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		word.toLowerCase();
		int s = word.length()/2;
		 
		//for (int i=0; i<word.length(); i++) {
		//	if (word.charAt(i)>='a' && word.charAt(i)<='z') {
				if (word.length()>=5 && word.length()%2==1) {
					System.out.print(word.charAt(s-1));
					System.out.print(word.charAt(s));
					System.out.print(word.charAt(s+1));
				}else {
				System.out.println("invalid");
					
			}
		//}	
		//}
	}
}
