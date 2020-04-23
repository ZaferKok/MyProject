package tryings;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		/*Write a program that gets a string input from the user
        If the string starts with a letter exit the program
        Then delete everything in the string except digits and negative sign
        Lastly turn the string into an integer and print it to the console.*/

		Scanner scan = new Scanner(System.in);
        System.out.println("> ");
        String input = scan.nextLine();
        if(Character.isLetter(input.charAt(0))) System.exit(0);
        String mod = input.replaceAll("[^\\d-]", ""); //
        int i = Integer.parseInt(mod);
        System.out.println("The final result is: " + i);
		
		
	}

}
