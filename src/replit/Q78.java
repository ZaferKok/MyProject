package replit;

import java.util.Scanner;

public class Q78 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		System.out.println(c_profits(a,b));

	}
	 public static String c_profits(int buyPrice, int sellPrice){
		 String prof = ""; 
		 int a = buyPrice-sellPrice;
		 if (a==0) {
			 prof = "no loss";
		 }
		 else if (a>0) {
			 prof = "loss";
		 }
		 else {
			 prof = "profit";
		 }
		 return prof;
		 
//	
//	if (buyPrice>sellPrice) {
//		prof = "loss";
//	}
//	if (buyPrice<sellPrice) {
//		prof = "profit";
//	}
//	if (buyPrice==sellPrice) {
//		prof = "no loss";
//	}
//	return prof;
	
	}
}
