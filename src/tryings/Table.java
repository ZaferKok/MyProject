package tryings;

public class Table {

	public static void main(String[] args) {
		/*Write a program that finds the multiplication table from a start value to the end value
		 For example if start value=5 and end value=10, then you will get the all the tables from 5 to 10
		
		Hint: use 2 for loops*/

		int start = 1, end = 10;
        
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);

            }
        }
	}

}
