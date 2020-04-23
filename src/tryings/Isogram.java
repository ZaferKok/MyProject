package tryings;

import java.util.Scanner;

public class Isogram {

	public static void main(String[] args) {
		/*Hi All, I have come across an interview
question. I just wanted to share it with you. Question: Given a string S of 
lowercase aplhabets, check if it is isogram or not.
An Isogram is a string in which no letter occurs more than once. Print 1 if
string is Isogram else print 0. if you are interest in challenge question, you
can try it out. (edited)*/
		
		//saneki
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Isogram");
		String iso = scan.nextLine();
		
		boolean isTrue = true;
		int l = iso.length();
		int i = 0;
		int j = 0;
		
		for (i=0; i<l; i++) {
			for(j=1; j<l; j++) {
			if (iso.charAt(i) == iso.charAt(j) && i!=j) {
				isTrue = false;
				break;
			}
			}
		}
	
	if (isTrue) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
}
}


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     /*   Scanner scan = new Scanner(System.in);
        System.out.print("Type something: ");
        String str = scan.nextLine(); // dervis isogram muhammed not isogram
        
        boolean isIsogram = true;
        Nilgun: for (int i = 0; i < str.length(); i++) {
            for (int n = 1; n < str.length(); n++) { // length=6
                if (str.charAt(i) == str.charAt(n) && i != n) {
                    isIsogram = false;
                    break Nilgun;
                }
            }
        }
        if (isIsogram) {
            System.out.println("it is an Isogram");
        } else {
            System.out.println("it is not an Isogram");
        }
    }
}
*/