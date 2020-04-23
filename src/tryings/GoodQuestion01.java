package tryings;

import java.util.Scanner;

public class GoodQuestion01 {

	public static void main(String[] args) {
		/*Ask user for 3 int values, a b c, return their sum.
However, if one of the values is the same as another of the values,
it does not count towards the sum*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 integer");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a==b && a==c) {
			System.out.println("Total is 0");
		}else if (a==b) {
			System.out.println("Total is : " + c);
		}else if (a==c) {
			System.out.println("Total is : " + b);
		}else if (b==c) {
			System.out.println("Total is : " + a);
		}else {
			System.out.println("Total is : " + (a+b+c));
		}
		
	}

}



