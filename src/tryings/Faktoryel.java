package tryings;

import java.util.Scanner;

public class Faktoryel {

	public static void main(String[] args) {
		/*Faktoryel-*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for factoryal");
		int n = scan.nextInt();
		
		int f = 1;
		int i = 1;
		
		while (n>=i) {
			f = f * i;
			
			i++;
		}System.out.println(f);
	}

}
