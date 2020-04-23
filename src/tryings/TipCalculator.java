package tryings;

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		//Tip Calculator
		Scanner scan = new Scanner(System.in);
		System.out.println("Split the Tip? ");
		String split = scan.next();
		System.out.println("Enter the Number of people");
		int np = scan.nextInt();
		System.out.println("Enter the total of money");
		double total = scan.nextDouble();
		System.out.println("Enter the persentage of tip");
		int tip = scan.nextInt();
	
	switch (tip) {
	case 10:
		total *=1.1;
		break;
	case 15:
		total *=1.15;
		break;
	case 25:
		total *=1.25;
		break;
	}
	if (split.equals("Yes")) {
		Double eachPerson = total/np;
		System.out.println("The total amount is : " + Math.round(eachPerson));
		System.out.println("The amount for each person to pay is : " + eachPerson);
	}else {
		System.out.println("The total amount is : " + Math.round(total));
		System.out.println("You did not seleck to split the amount");
	}
	
	}

}
