package replit;

public class Q75 {

	public static void main(String[] args) {


	}
	public int  count_appearance(String[] arr,String t){
	int count = 0;   
	for (int i = 0; i<arr.length; i++)
		if (t.contentEquals(arr[i])) {
			count++;
		}
	
	return count;
	} //end  count_appearance
	
	
	
	
}
