package enterprise02;

import java.util.Scanner;

public class P5_ClassroomEntry {
	 	
		private String name = "No Name";
	    private String classroom = "No Classroom";
	    private int studentNum = 0000;
	    String classroom_1A[] = new String[2];
	    int studentNumbers_1A[] = new int[2];
	
	    public P5_ClassroomEntry() {												//Bu bir constructor

	    }
	    public void ClassroomDataEntrySecond() {
	    	for (int i=0; i<classroom_1A.length; i++) {
	    		Scanner scan = new Scanner(System.in);
	    		System.out.println("Enter student name and lastname ");
	    		classroom_1A[i] = scan.nextLine();
	    		
	    		 System.out.println("Enter student number : ");
	             studentNumbers_1A[i] = scan.nextInt();
	    	}
	    }
	    public void ClassroomInfosSecond () { 												// Bu bir metoddur.
	           	System.out.println("============= The list of 1A classroom =============");
	            System.out.println("Name and Lastname <<<>>> Student Numbers");
	            System.out.println("====================================================");
	           
	            for(int i = 0; i<classroom_1A.length; i++) {
	                System.out.println((classroom_1A[i]) + "----------------" + (studentNumbers_1A[i]));
	            
	            }System.out.println("======================== End =======================");
	}
}
