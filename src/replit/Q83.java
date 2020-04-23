package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Q83 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String arr[] = new String [t];
		for(int i = 0; i<t; i++) {
			arr[i] = scan.next();
		}
		
		//String arr[] = {"Ali", "Veli", "Ayse", "Fatma"};
		System.out.println(Arrays.toString(reverse(arr)));
	
		}
		
	   /**
	   * Reverses the order of the elements in the specified array
		 * @param arr
		 * @return array of strings
		 */
	public static String[] reverse(String[] arr) {
		int l = arr.length;	
		String arr2[] = new String[l]; 
		for (int i = l-1 ; 0<=i; i--) {

			arr2[i] = arr[l-i-1];
			
		}		  
		return arr2;
		
	}
	
}
