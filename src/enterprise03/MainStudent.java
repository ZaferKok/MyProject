package enterprise03;

import java.util.Scanner;

public class MainStudent extends DataEntry {
	public void studentDataEntry() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter student name and lastname : ");
		super.nameList.add(scan.nextLine());
		System.out.println(nameList);
		System.out.print("Enter classroom : ");
		super.className.add(scan.nextLine());
		System.out.println(className);
		System.out.print("Enter student number : ");
		super.studentNum.add(scan.nextLine());
		System.out.println(studentNum);
		System.out.print("Enter student department: ");
		super.department.add(scan.nextLine());
		System.out.println(department);
	}

	public void findStudentByNumber() { // Bu bir metoddur.
		System.out.println("Kod buraya kadar calisiyor");
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter student number who you are looking for : ");
		String studentNum1 = scan.next();
		System.out.println("==================== Student Information ======================");
		System.out.println("Name and Lastname <<<>>> Student Classroom<<<>>>>Student Number");
		System.out.println("===============================================================");
		for (int i = 0; i < nameList.size(); i++) {
			if (studentNum.get(i).equalsIgnoreCase(studentNum1)) {
				System.out.println((super.nameList.get(i)) + "------------" + (super.className.get(i)) + "------------"
						+ (super.studentNum.get(i)) + "------------" + (super.department.get(i)));
			}
		}
		System.out.println("============================ End ==============================");
	}
}
