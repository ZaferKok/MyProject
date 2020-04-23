package replit;

import java.util.Scanner;

public class Q28ShoppingList2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Item1, count and its price:");	
		
		String item1 = scan.next();
		int 	count1 = scan.nextInt();
		double price1 = scan.nextDouble();
		System.out.println("Enter Item2, count and its price:");
		String item2 = scan.next();
		int 	count2 = scan.nextInt();
		double price2 = scan.nextDouble();
		System.out.println("Enter Item3, count and its price:");
		String item3 = scan.next();
		int 	count3 = scan.nextInt();
		double price3 = scan.nextDouble();
		scan.close();
	
		
	
	

		if (count1>0 && count2>0 && count3>0) {
			String report ="Item1: "+item1+" Price: "+count1*price1+", "+
						   "Item2: "+item2+" Price: "+count2*price2+", "+
						   "Item3: "+item3+" Price: "+count3*price3;
			System.out.println(report);
			double totalPrice = count1*price1 + count2*price2 + count3*price3;
			System.out.println("Total price: "+ totalPrice);
		}
		else if (count1==0 && count2>0 && count3>0) {
			String report ="Item2: "+item2+" Price: "+count2*price2+", "+
						   "Item3: "+item3+" Price: "+count3*price3;
			System.out.println(report);
			double totalPrice =count2*price2 + count3*price3;
			System.out.println("Total price: "+ totalPrice);
		}
		else if (count1>0 && count2==0 && count3>0) {
			String report ="Item1: "+item1+" Price: "+count1*price1+", "+
						   "Item3: "+item3+" Price: "+count3*price3;
			System.out.println(report);
			double totalPrice = count1*price1 + count3*price3;
			System.out.println("Total price: "+ totalPrice);
		}
		else if (count1>0 && count2>0 && count3==0) {
			String report ="Item1: "+item1+" Price: "+count1*price1+", "+
						   "Item2: "+item2+" Price: "+count2*price2;
			System.out.println(report);
			double totalPrice = count1*price1 + count2*price2;
			System.out.println("Total price: "+ totalPrice);
		}
		if (count1==0 && count2==0 && count3>0) {
			String report ="Item3: "+item3+" Price: "+count3*price3;
			System.out.println(report);
			double totalPrice = count3*price3;
			System.out.println("Total price: "+ totalPrice);
		}
		if (count1==0 && count2>0 && count3==0) {
			String report ="Item2: "+item2+" Price: "+count2*price2;
			System.out.println(report);
			double totalPrice = count2*price2;
			System.out.println("Total price: "+ totalPrice);
		}
		if (count1>0 && count2==0 && count3==0) {
			String report ="Item1: "+item1+" Price: "+count1*price1;
			System.out.println(report);
			double totalPrice = count1*price1;
			System.out.println("Total price: "+ totalPrice);
		}
		
		
	}

}
