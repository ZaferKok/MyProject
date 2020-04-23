package tryings;

import java.util.Arrays;

public class SortingArrayDifficultWay {
	
	public static void main(String[] args) {
		
		//Sorting Arrays using traditional for loop
		
		int[] nums = {4,11,13,12,17,35,15,7,19,3,45};
		
		int temp;
		
		for (int i = 0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				if (nums[i]>nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}System.out.println(Arrays.toString(nums));
		}System.out.println(Arrays.toString(nums));
			
	}
	
	
}
