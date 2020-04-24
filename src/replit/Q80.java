package replit;

import java.util.Scanner;

public class Q80 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean a = scan.nextBoolean();
		boolean b = scan.nextBoolean();
		boolean c = scan.nextBoolean();
		
		System.out.println(threeLocks(a, b, c));
		
		
	}
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
	      // Code Here
	    if (a==true && b ==true || c ==true){
	      return true;
	    }else {
	      return false;
	    }
	    
	  }//end threeLocks
	}
