package replit;

import java.util.Scanner;

public class Q45 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter chicken or burger");
		String in = s.next();
				
		float a = 10.0f;
		float b = 2.0f;
		
		if (in.equals("chicken") || in.equals("burger")) {
			System.out.println(a);	
		}else if(in.equals("soda")) {
			System.out.println(b);
		}
		
	}

}
