package enterprise03;

import java.util.Scanner;

public class Classes extends DataEntry {
	int classSize;
	String className222;

	public void classroomInfos() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter classroom which you want its information");
		className222 = scan.next();
		System.out.println("============= The list of " + className222 + " classroom =============");
		System.out.println("Name and Lastname <<<<>>>> Student Classroom <<<>>>> Student Number");
		System.out.println("===================================================================");

		for (int i = 0; i < nameList.size(); i++) {
			if (super.className.get(i).equalsIgnoreCase(className222)) {
				System.out.println((super.nameList.get(i)) + "--------------------" + (super.className.get(i))
						+ "-----------------" + (super.studentNum.get(i)) + "------------" + (super.department.get(i)));
			}
		}
		System.out.println("========================= End =====================================");
	}

	public void findsizeofClass() {
		classSize = super.className.size();
	}
}
