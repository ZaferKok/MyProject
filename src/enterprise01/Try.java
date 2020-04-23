package enterprise01;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ");
		String classroom_1A[] = new String[2];
		int studentNumbers_1A[] = new int[2];
		
		
		for (int i = 0; i<classroom_1A.length; i++) {
			
			System.out.println("Enter student name and lastname : ");
		
			classroom_1A[i]= scan.nextLine();
			
			System.out.println("Enter student number : ");
			studentNumbers_1A[i] = scan.nextInt();

		}
		
		
	
	
	
	
	}
}
