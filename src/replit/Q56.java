package replit;

import java.util.Scanner;

public class Q56 {

	public static void main(String[] args) {
		
		double price = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select screen size:");
		String screenType = scan.next();
		if (screenType.equals("12.1")) price += 150;
		if (screenType.equals("16.0")) price += 330;
		if (screenType.equals("17.3")) price += 400;
		
		
		System.out.println("Select CPU type:");
		String cpu = scan.next();
		if (cpu.equals("i3")) price += 150;
		if (cpu.equals("i5")) price += 250;
		if (cpu.equals("i7")) price += 350;
		
		System.out.println("Select RAM size:");
		int ram = scan.nextInt();
		price += 50 + (ram/4)*50;

		
		System.out.println("Select storage type:");
		String storageType = scan.next();
		System.out.println("Enter memory size:");
		int memo = scan.nextInt();
		if (storageType.equals("HDD")) price += (memo/500)*50;
		if (storageType.equals("SSD")) price += (memo/500)*100;
		
		System.out.println("Enter screen resolution:");
		String reso = scan.next();
		if (reso.equals("FULLHD")) 		price += 100;
		if (reso.equals("4K")) 			price += 200;
		
		System.out.println("Laptop price is: $"+price);
	}

}
