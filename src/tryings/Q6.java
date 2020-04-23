package tryings;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = scan.nextInt(); // 127 it is an integer
        String str = String.valueOf(num); // 127 it is a string
     
       
        
        int counter = 0, i = 0;
        
               
        
        while (num != 0) { // num = 127
            if (str.charAt(i) == '7') {
                counter++;
                }
            // num 127
            num = num / 10; // num = 12
            i++;
        }
        System.out.println("the number of 7 is = " + counter);
    }

}
