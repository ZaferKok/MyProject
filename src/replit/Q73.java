package replit;

import java.util.Scanner;

public class Q73 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
		 
	}
		  
	public static void isPalindrome(int num){
		boolean isTrue = false;
		int i = 0;
		int num2 = num;
		
		while (num>0) {
		num = num/10;	
		i++;	
		}
		
		if (i==4) {
			if(num2%10 == num2/1000 && (num2/10)%10 == (num2/100)%10 ) {
				isTrue = true; 
		
			}System.out.println(isTrue);
		}else if (i==6) {
			if(num2%10 == num2/100000 && (num2/10)%10 == (num2/10000)%10 && (num2/100)%10 == (num2/1000)%10 ) {
				isTrue = true; 
		
			}System.out.println(isTrue);
		}else if (i==3) {
			if(num2%10 == num2/100) {
				isTrue = true; 
		
			}System.out.println(isTrue);
		}
		
		
		
		
		
//		for (int j=0; j<i; j++) {
//			int s1 = num2%10;
//			System.out.print(s1);
//			num2 = num2/10;
//		}
	}
}
