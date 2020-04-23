package replit;

import java.util.Scanner;

public class Q47 {

	public static void main(String[] args) {
		int propertyPrice = 0;

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
		// WRITE YOUR CODE HERE
		System.out.println("Enter your property type:");
		String houseType = scan.nextLine();
		System.out.println("How many bedrooms do you have?");
		int numberOfBedrooms = scan.nextInt();
		System.out.println("Do you have a backyard?");
		boolean backyard = scan.nextBoolean();							//true
		
		if (houseType.equals("Condo") && backyard==true) {
		
		}else if ((houseType.equals("Townhouse") || houseType.equals("Single Family Home") && backyard==true)) {
		System.out.println("");
		
		}
		else {
			System.out.println("Backyard is not available for condo!");
		}
		
		System.out.println("Do you have garage?");
		boolean garage = scan.nextBoolean(); 							//true
		System.out.println("How many spots?");
		int garageSpots = scan.nextInt();
		
		
		if (garageSpots>10) System.out.println("Pardon,  it's not a public parking!");
	
		
		System.out.println("How close is metro station?");
		float metroAccessibility = scan.nextFloat();					//1
		System.out.println("How close is highway?");
		float highwayAccessibility = scan.nextFloat();					 //1
		System.out.println("What's the rating of nearest school?");
		float schoolScore = scan.nextFloat();							//1
		System.out.println("Does any of your family members smoking?");
		boolean smoking = scan.nextBoolean(); 							//false
		
		
		if (houseType.equals("Condo")) propertyPrice += 120000;
		
		if (houseType.equals("Townhouse")) propertyPrice += 75000;
		if (houseType.equals("Single Family Home")) propertyPrice += 5000;
		
		propertyPrice = (propertyPrice + (numberOfBedrooms*30000));
				
		if (backyard==true && (houseType.equals("Townhouse") || houseType.equals("Single Family Home"))) propertyPrice +=5000;
		if (garage==true) propertyPrice +=20000;
		
		if (metroAccessibility<=1.0f) propertyPrice +=10000;
		if (metroAccessibility>1.0f && metroAccessibility<3.0f) propertyPrice +=5000;
		if (highwayAccessibility<=1.0f) propertyPrice +=15000;
		if (highwayAccessibility>1.0f && highwayAccessibility<5.0f) propertyPrice +=8000;
		if (highwayAccessibility>5.0f && highwayAccessibility<=20.0f) propertyPrice +=4000;
		if (schoolScore>8.0f && schoolScore<=10.0f) propertyPrice +=45000;
		if (schoolScore>4.0f && schoolScore<8.0f) propertyPrice +=20000;
		if (schoolScore>0.0f && schoolScore<4.0f) propertyPrice += 5000;
		if (smoking==true) propertyPrice -=5000;
		
		propertyPrice +=70000;
		
		System.out.println("Market report has been generated.");
		System.out.println("Your estimate market price is:  " + propertyPrice + "$");
	}
}
