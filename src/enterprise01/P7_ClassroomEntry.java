package enterprise01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7_ClassroomEntry {
	
	List<String> nameList = new ArrayList<String>();
	List<String> classroom = new ArrayList<String>();
	List<String> studentNum = new ArrayList<String>();
	
	public P7_ClassroomEntry() {												//Bu bir constructor

	}

	public void ClassroomDataEntryFirst() {
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<2; i++) {
		System.out.println("Enter student name and lastname : ");
		this.nameList.add(scan.nextLine());
		
		System.out.println("Enter classroom : ");
		this.classroom.add(scan.nextLine());
		
		System.out.println("Enter student number : ");
		this.studentNum.add(scan.nextLine());	
		}
	}
		public void ClassroomInfosFirst (String classname) { 												// Bu bir metoddur.
		System.out.println("============= The list of 1A classroom =============");
		System.out.println("Name and Lastname <<<>>> Student Numbers");
		System.out.println("====================================================");
		for(int i = 0; i<nameList.size(); i++) {
			if (classroom.get(i).equals(classname)) {
				System.out.println((nameList.get(i)) + "----------------" + (classroom.get(i)) + "-------------" + (studentNum.get(i)));
			}				
//			while (classroom.get(i).equals("1A")) {
//			System.out.println((nameList.get(i)) + "----------------" + (classroom.get(i)) + "-------------" + (studentNum.get(i)));
//			break;
//			}
	
		}System.out.println("======================== End =======================");		
	}
}

