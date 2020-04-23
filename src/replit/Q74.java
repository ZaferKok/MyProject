package replit;

import java.util.Scanner;

public class Q74 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);

	}

    public static void fib(int num){
        //WRITE YOUR CODE HERE
    	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144
    	int first = 0;
    	int temp = 0;
    	int second = 1;
    	for(int i = 0; i<num; i++) {
    	temp = first;
    	first = second; 
    	second = temp + first;
    	System.out.println(first);
    }System.out.println(first);
      
    }

}
