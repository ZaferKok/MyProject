package tryings;

public class ArrayQ1 {

	public void print() {
		int a = 8;
		System.out.println(a + " ");
	}
	
	public static void main(String[] args) {
		//Write an array with weekdays in it. Then find respectively: 
		//1)find the longest day of the week (use for each loop) 
		//2) print the these elements in reverse order (use for loop)

		String w[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int b[] = {1};
		int a[] = {1,2,3,4};
		System.out.println(a instanceof Object);
		System.out.println(" " + (b[0]==a[1]));
		new ArrayQ1().print();
		
		String theLongest = "";
		
		for (String i : w) {
			if (i.length() > theLongest.length()) {
				theLongest = i;
			}
		}
		System.out.println(theLongest);	
	
		for (int z = w.length-1 ; z>=0; z--) {
			System.out.println(w[z]);
		}
	}
}
