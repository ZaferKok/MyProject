package tryings;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/* The Fibonacci numbers are the numbers in the following integers
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……...
 * Ask user to enter a number, print out all Fibonacci numbers up to the number that user typed
 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for Fibonacci");
		int f = scan.nextInt();
		
		int a = 0;
		int i = 0;
		int ii = 1;
		int sum;
		
		while (a<f) {
			sum = i + ii;
			i = ii;
			ii= sum;
			a++;
		System.out.println(sum);
		}
		
		
	}

}/* Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int n1 = 0, n2 = 1, result;
        for (int i = 0; i < num; i++) { // num--> 5
            result = n1 + n2; // 5
            n1 = n2; // n1=2
            n2 = result; // n2=3
            System.out.println(result);
        }
*/
