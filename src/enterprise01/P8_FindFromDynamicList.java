package enterprise01;

import java.util.Scanner;

public class P8_FindFromDynamicList extends P7_ClassroomEntry {

	public void FindStudentFromDynamicList(String studentNum) { // Bu bir metoddur.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter student number who you are looking for : ");
//		int studentNum = scan.nextInt();

		System.out.println("============= The list of 1A classroom =============");
		System.out.println("Name and Lastname <<<>>> Student Numbers");
		System.out.println("====================================================");
		for (int i = 0; i < super.nameList.size(); i++) {
			if (super.studentNum.get(i).equals(studentNum)) {
				System.out.println((super.nameList.get(i)) + "--------" + (super.classroom.get(i)) + "--------"
						+ (super.studentNum.get(i)));
			}
		}
		System.out.println("======================== End =======================");
	}
}
