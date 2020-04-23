package tryings;

public class TipDonusum {

	public static void main(String[] args) {
		
		// First way;
		int num1 = 32;
		int num2 = 18;
        System.out.println("Toplam integer olarak : " + (num1+num2));
		
		String newNum1 = "" + num1;
		String newNum2 = "" + num2;
        	System.out.println(newNum1); // It writes as String
        	System.out.println(newNum2);
        	System.out.println(newNum1 + newNum2); // result is concatinating. not adding.    
        	
        // Second way;
        	
        String newNum3 = String.valueOf(num1);
        String newNum4 = String.valueOf(num2);


	}

}
