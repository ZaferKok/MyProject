package tryings;

public class RunTimeError {

	public static void main(String[] args) {
		
		// What is the result?
		
		System.out.println(exceptions());

	}
	public static String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			}catch (NullPointerException e) {
				result += "catch";
				throw new Exception();
			}
		}catch (Exception e) {
			result += "done";
		}
		return result;
	}
}
