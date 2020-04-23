package tryings;

public class CharFinder {

	public static void main(String[] args) {
		String str = "Aa Bb Cc D E";
		
		str.toUpperCase();
		System.out.println(str); // You will see no changes on the console. 
									//After changing an string you need to asssing it 
									//to other string name. or you directly print in syso.
		System.out.println(str.toUpperCase());  //<======== like that 
		
		
		System.out.println(str.replace(" ", "")); //As you see it make changes on beginning str.
		
		// If you want to make it permanent assign it.
		
		String newStr = str.toUpperCase().replace(" ", "").toLowerCase(); // Burada biraz fantazi oldu.
		System.out.println(newStr);
		
		for (int i = 0; i<newStr.length(); i++) {
				String ch = Character.toString(newStr.charAt(i));
				String trimmed = newStr.replace(ch, "");
				int dublicate = newStr.length()-trimmed.length();
		if (dublicate==1) {
			System.out.println(ch + " is unique. because it repeated "+ dublicate + " time" );
		}else {
			System.out.println(ch + " is not unique. because it repeated "+ dublicate + " times" );
		}
		}
		int i = 123;
		String s = "" + i; //intiger i string yapma.
		
		double d = Double.MIN_VALUE;
		System.out.println(d);
		int a = Integer.MAX_VALUE;			
	}
}
