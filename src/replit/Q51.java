package replit;

import java.util.Scanner;

public class Q51 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Split:");
		String split = scan.next();
		System.out.println("Number of people:");
		int numberOfPeople = scan.nextInt();
		System.out.println("Check amount:");
		double checkAmount = scan.nextDouble();
		System.out.println("Service quality:");
		String serviceQuality = scan.next();
		
		double checkNet = checkAmount;
		
		
		
		switch (serviceQuality) {
		case "Poor":		
			checkAmount = 1.05*checkAmount;
			break;
		case "Fair":		
			checkAmount = 1.10*checkAmount;
			break;
		case "Good":		
			checkAmount = 1.15*checkAmount;
			break;
		case "Great":		
			checkAmount = 1.20*checkAmount;
			break;
		case "Excellent":		
			checkAmount = 1.25*checkAmount;
			break;
		default:
		}
		
		if (split.equals("Yes")) {
		System.out.println("Number of people entered: " + numberOfPeople);
		System.out.println("Total to pay: " + checkAmount);
		System.out.println("Total tip: " + (checkAmount-checkNet));
		System.out.println("Total per person: " + (checkAmount/numberOfPeople));
		System.out.println("Tip per person: " + (checkAmount-checkNet)/numberOfPeople);
	}
}

}
