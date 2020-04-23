package tryings;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = scan.nextInt();
        String str = String.valueOf(num);

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (("" + str.charAt(i)).equals("7")) {
                counter++;
            }
            System.out.println("the number of 7 is = " + counter);
        }

	}

}
