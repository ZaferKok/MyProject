package replit;

public class Q79 {

	public static void main(String[] args) {
		System.out.println(hamletQuote(false, false));

	}
	public static boolean hamletQuote(boolean toBe,boolean notToBe){
		
		if (toBe==true && notToBe==true) {
			return true;
		}else if (toBe==false && notToBe==true) {
			return true;
		}else if (toBe==true && notToBe==false) {
			return true;
		}else {
			return false;
		}
	}
}
