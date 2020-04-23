package tryings;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "AABBCDD";
		
		int count = 0;
		int t = 0;
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='C'){
				count++;
				
				System.out.println("'C' is "+ (i+1) +". place in "+str);
				System.out.println("There "+count+" 'C' in "+str);
			}
		}
		
	}

}
