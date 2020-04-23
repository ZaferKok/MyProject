package tryings;

public class FizzBuzz {

	public static void main(String[] args) {
		/*Write a program that prints each number from 1 to 100
		on a new line.
		 For each divisible of 3, print "Fizz" instead of the number
		For each divisible of 5, print "Buzz" instead of the number
		For numbers divisible by both 3 and 5 print "FizzBuzz" instead */
	
		int n = 100;
        for(int i = 1; i <= n; i++){
            String output = "";
            if(i % 3 == 0) output += "Fizz"; 
            if(i % 5 == 0) output += "Buzz"; 
            if(output == "") output += i; // output = output + i; 
            System.out.println(output);
        }
		
	}

}
