package replit;

import java.util.Scanner;

public class Q46 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		int n = scan.nextInt();
		int num, digit1, digit2, digit3, digit4, digit5;
		num = n;
		digit5 = num%10;
		digit4 = (num/10)%10;
		digit3 = (num/100)%10;
		digit2 = (num/1000)%10;
		digit1 = (num/10000);
		System.out.println(digit1);
		System.out.println(digit2);
		System.out.println(digit3);
		System.out.println(digit4);
		System.out.println(digit5);
	
	}

}
