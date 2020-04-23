package enterprise02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7_ClassroomEntry {

	static List<String> nameList = new ArrayList<String>();
	static List<String> classroom = new ArrayList<String>();
	static List<String> studentNum = new ArrayList<String>();

	public P7_ClassroomEntry() { // Bu bir constructor
	}

	public void studentDataEntryOldVersion() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter student name and lastname : ");
			this.nameList.add(scan.nextLine());

			System.out.println("Enter classroom : ");
			this.classroom.add(scan.nextLine());

			System.out.println("Enter student number : ");
			this.studentNum.add(scan.nextLine());
		}
	}

	public void classroomInfosOldVersion() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter classroom which you want its information");
		String info = scan.next();
		System.out.println("============= The list of " + info + " classroom =============");
		System.out.println("Name and Lastname <<<>>> Student Classroom<<<>>>>Student Number");
		System.out.println("====================================================");
		for (int i = 0; i < nameList.size(); i++) {
			if (classroom.get(i).equalsIgnoreCase(info)) {
				System.out.println((nameList.get(i)) + "--------------------" + (classroom.get(i)) + "-----------------"
						+ (studentNum.get(i)));
			}
//          while (classroom.get(i).equals("1A")) {
//          System.out.println((nameList.get(i)) + "----------------" + (classroom.get(i)) + "-------------" + (studentNum.get(i)));
//          break;
//          }

		}
		System.out.println("======================== End =======================");
	}

}