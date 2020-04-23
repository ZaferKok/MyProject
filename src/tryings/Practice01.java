package tryings;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/* ask user to create a user name 
         * it should have at least 
         * 1 special char
         * 1 uppercase letter
         * 1 lower case letter 
         * 1 digit
         * the length of the username should be 8 */
        

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 8 length username. Username must contains"
				+ " at least 1 special char, 1 uppercase, 1 lowercas, and 1 digit");
		String u = scan.next();
		
		int l = u.length();
		String sp = "!@#$%^&*(),'._+\"";
		int upCount = 0;
		int lowCount = 0;
		int digCount = 0;
		int spCount =0;
		
		int i;
		
		for (i=0; i<l; i++) {
			if (u.substring(i, i+1).charAt(0)>='A' && u.substring(i, i+1).charAt(0)<= 'Z') {
				upCount++;
			}else if (u.substring(i, i+1).charAt(0)>='a' && u.substring(i, i+1).charAt(0)<= 'z') {
				lowCount++;
			}else if (Character.isDigit(u.charAt(i))) {
				digCount++; //u.substring(i, i+1).charAt(0)>='0' && u.substring(i, i+1).charAt(0)<= '9'
			}else if (sp.contains(u.substring(i, i+1))){
				spCount++;
			}
		}
		if (l!=8) {
			System.out.println("Enter 8 length user name");
		}else {
			System.out.println("There " + upCount +" uppercase in " + u);
			System.out.println("There " + lowCount +" lowercase in " + u);
			System.out.println("There " + digCount +" digit in " + u);
			System.out.println("There " + spCount +" special character in " + u);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a user name that has at least " + 
//                "       * 1 special char    " + 
//                "       * 1 uppercase letter  " + 
//                "       * 1 lower case letter     " + 
//                "       * 1 digit    ");
//        
//        String specChars = "!@#$%^&*()_+";
//        String nums = "0123456789";
//        int countChar =0;
//        int countUpperCase =0;
//        int countLowerCase =0;
//        int countDigit =0;
//        String userName = scan.next();
//        
//        for(int i=0; i<userName.length();i++) {
//            if(specChars.contains(userName.substring(i,i+1))) {
//                System.out.println("We fount special char");
//                countChar++;
//            }
//            if(userName.charAt(i) >= 'A' && userName.charAt(i ) <= 'Z') {
//                countUpperCase++;
//            }
//            
//            if(Character.isDigit(userName.charAt(i))) {
//                countDigit++;
//            }
//            if(userName.charAt(i) >= 'a' && userName.charAt(i) <= 'z') {
//                countLowerCase++;
//            }
//        }
//        
//        if(userName.length() == 8) {
//            
//            if(countChar >0 && countUpperCase > 0 && countLowerCase > 0 && countDigit>0) {
//                System.out.println("You have created your user name successfully!");
//            }else {
//                System.out.println("You should check your user name one more time ");
//            }
//            
//            
//        }else {
//            System.out.println("The length of your user name should change");
//        }
}}