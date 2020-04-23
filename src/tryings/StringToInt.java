package tryings;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		/*
		 * Write a program that gets a string input from the user
		 * If the string starts with a letter exit the program
		 * then delete everything in the string except digits an negative sign
		 * lastly turn the string into an integer and print it to the console
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter> ");
		String input = scan.nextLine();
		
		if (Character.isLetter(input.charAt(0))) System.exit(0); //1.section is finished here
		
		String mod = input.replaceAll("[^\\d-]", ""); // meali şöyle anlatayım. digit ve negatif 
		//2.section is finished here				// dışındakileri yok et!!!!
		
		
		
		int i = Integer.parseInt(mod); //3.section finished here
		
		System.out.println("The final result is : " + i);
		
//		String a = "12345678";
//		int b= Integer.parseInt(a);
//		int c= b/12345678;
//		System.out.println(c);
		
		
	}

}
