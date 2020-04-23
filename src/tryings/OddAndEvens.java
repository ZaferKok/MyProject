package tryings;

public class OddAndEvens {

	public static void main(String[] args) {
		//   Write an array with the following elements{ 10, 23, 45, 13, 56, 34, 43, 76, 87 }
		//1) find the number of elements greater than 50
		//2) find the number of elements less than 50
		//3) find the number of odd elements
		//4) find the number of even elements		
		//5) find the sum of the even elements
		//6) find the sum of the odd elements
		//7) find the total sum

		int nums[] = { 10, 23, 45, 13, 56, 34, 43, 76, 87 };
		
		int count = 0;
		int oddCount = 0;
		int evenCount = 0;
		int sum = 0;
		int evenSum = 0;
		int oddSum =0;
		
		for (int i : nums) {
			if (i>50) {
				count++;
			}
		}System.out.println(count);
		
		System.out.println(nums.length-count); // ikinci sorunun pratik cevabı budur. asagıdaki uzun yolu
		
//		for (int i = 0; i<nums.length; i++) {
//			if (nums[i]<50) {
//				count++;
//			}
//		}System.out.println(count);
		
		for (int i : nums) {
			if (i%2==0) {
				evenCount++;
				evenSum += i;
				System.out.println("This is an even number in the array : " + i);
			}
		}System.out.println("The number of the even numbers count : " + evenCount);
		System.out.println("Total of even numbers : " + evenSum);
		
		
		
		for (int i : nums) {
			if (i%2!=0) {
				oddCount++;
				oddSum += i;
				System.out.println("This is an odd number in the array : " + i);
			}
		}System.out.println("The number of the odd numbers count : " + oddCount);
		System.out.println("Total of odd numbers : " + oddSum);
	
		for (int a : nums) {
			sum += a;
		}System.out.println("The total is : " + sum);
	}

}
/*
int[] nums = { 10, 23, 45, 13, 56, 34, 43, 76, 87 };
int count = 0;
int evenCount = 0;
int oddCount = 0;
int sumOfEvens = 0;
int sumOfOdds = 0;
for (int i = 0; i < nums.length; i++) {
    if (nums[i] > 50) {
        count++;
    }
    if (nums[i] % 2 == 0) {
        evenCount++;
        sumOfEvens += nums[i];
    } else {
        oddCount++;
        sumOfOdds += nums[i];
    }
}
System.out.println("The number of the elements greater than 50: " + count);
System.out.println("The number of the elements greater than 50: " + (nums.length - count));
System.out.println("The number of the even elements:" + evenCount);
System.out.println("The number of the odd elements:" + oddCount);
System.out.println("The sum of the evens: " + sumOfEvens);
System.out.println("The sum of the odds: " + sumOfOdds);
System.out.println("The total sum: " + (sumOfEvens + sumOfOdds));*/
