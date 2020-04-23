package replit;

import java.util.Scanner;

public class Q29ConsoleMenu {

	public static void main(String[] args) {


		
		
		System.out.println("---------------");
	    System.out.println("select an option:");
	    System.out.println("1) option 1");
	    System.out.println("2) option 2");
	    System.out.println("3) option 3");
	    System.out.println("---------------");

	    Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
	    
	    if (a==1) {
	    	System.out.println("user selected " + a);
	    }
	    if (a==2) {
	    	System.out.println("user selected " + a);
	    }
	    if (a==3) {
	    	System.out.println("user selected " + a);
	    }
	    
	}

}
