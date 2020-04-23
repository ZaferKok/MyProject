package tryings;

import java.util.Scanner;

public class SubstringMethod {

	public static void main(String[] args) {
		/*				 01234567890123456789
		 * String dob = “January 24, 1968 (52 years)”;
		 * Print out as January 24, 1968
		 * But it should be dynamic. I mean if the date
		 *  is May 2, 1978 (42 years) it should print out
		 *   as May 2, 1978
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your birth date and age as in the example.Exp:January 24, 1968 (52 years)");
		String dob = scan.nextLine();
		
		
		int a = dob.lastIndexOf("(")-1;
		String d = dob.substring(0, a);
		System.out.println(d);
				
		
	}

}
