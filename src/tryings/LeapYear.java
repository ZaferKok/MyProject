package tryings;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		/* leap year*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year for checking it leap year or not");
		int y = scan.nextInt();
		
		if (y%4==0) {
			
			if (y%100==0) {
				System.out.println("Leap Year");
			}else if (y%400==0) {
				System.out.println("Leap Year");
			}else {
				System.out.println("Almost, but it is not");
			}
		}else {
			System.out.println("No, it is not a leap year");
		}
		
		
	}

}
