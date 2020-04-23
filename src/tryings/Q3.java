package tryings;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/*	Ask the user for a word and print the number of 'hi' in the expression.
		input = "hihihi"			output = "There are 3 'hi's in hihihi"
		input = "cloud"			output = "There is no 'hi' in cloud"		*/
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter many 'hi' words together");
	String w = scan.next();
	w.toLowerCase();
	
	
	int l = w.length();
	int count = 0;	
	String result = ""; // This is also String counter!!!!!!!!!!!

	
	for (int i = 0; i<l-1; i++)
		if (w.charAt(i) == 'h' && w.charAt(i+1) == 'i') { 
			count++; 
			result = result + w.charAt(i) + w.charAt(i+1);
			//w.substring(i, i+2).equalsIgnoreCase("hi")
			//w.substring(i, i+2).toLowerCase().equals("hi");
		}
		
	if (count==0) {
		System.out.println("There is no 'hi' in " + w );
	}else {
		System.out.println("There are " + count + " " + result + " in " + w);
	}
}
}
