package enterprise02;

import java.util.Scanner;

public class P8_FindStudent extends P7_ClassroomEntry {

	public void findStudentByNumberOldVersion() { // Bu bir metoddur.
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter student number who you are looking for : ");
		String studentNum = scan.next();
		System.out.println("===================== Student Information =====================");
		System.out.println("Name and Lastname <<<>>> Student Classroom<<<>>>>Student Number");
		System.out.println("===============================================================");
		for (int i = 0; i < super.nameList.size(); i++) {
			if (this.studentNum.get(i).equalsIgnoreCase(studentNum)) {
				System.out.println((super.nameList.get(i)) + "------------" + (super.classroom.get(i)) + "------------"
						+ (super.studentNum.get(i)));
			}
		}
		System.out.println("=========================== End ===============================");
	}

	public void findStudentByFullNameOldVersion() { // Bu bir metoddur.
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter student full name who you are looking for : ");
		String studentNum = scan.nextLine();
		System.out.println("==================== Student Information ======================");
		System.out.println("Name and Lastname <<<>>> Student Classroom<<<>>>>Student Number");
		System.out.println("===============================================================");
		for (int i = 0; i < super.nameList.size(); i++) {
			if (super.nameList.get(i).equalsIgnoreCase(studentNum)) {
				System.out.println((super.nameList.get(i)) + "------------" + (super.classroom.get(i)) + "------------"
						+ (super.studentNum.get(i)));
			}
		}
		System.out.println("============================= End =============================");
	}

}
