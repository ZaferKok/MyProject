package replit;

import java.util.Scanner;

public class Q57 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name:");
		String user = scan.nextLine();
		
		if (user.equalsIgnoreCase("Mesut Unlu")) {
			System.out.println("User found!");
		}else if (user.equalsIgnoreCase("Ali Ahmet")) {
			System.out.println("User found!");
		}else {
			System.out.println("User not found!");
		}
	}

}
