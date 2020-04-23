package enterprise03;

import java.util.Scanner;

public class MainRunner {

	static boolean isFinished = false;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option = 0;
		while (option < 1 || option > 3) {
			System.out.println("Please enter the option what you want to do ");
			System.out.println("1-Registiration");
			System.out.println("2-Get class info");
			System.out.println("3-Find student");
			option = scan.nextInt();
		}
		options(option);
		while (!isFinished) {
			int yesOrNo = 0;
			continueOption(yesOrNo);
		}
	}

	public static void continueOption(int yesOrNo) {
		Scanner scan = new Scanner(System.in);
		while (yesOrNo < 1 || yesOrNo > 2) {
			System.out.println("For continue, push ==> 1");
			System.out.println("For exit, push ======> 2");
			yesOrNo = scan.nextInt();
		}
		switch (yesOrNo) {
		case 1:
			int option = 0;
			while (option < 1 || option > 3) {
				System.out.println("Please enter the option what you want to do ");
				System.out.println("1-Registiration");
				System.out.println("2-Get class info");
				System.out.println("3-Find student");
				option = scan.nextInt();
			}
			options(option);
			break;
		case 2:
			System.out.println("Thank you");
			isFinished = true;
			break;
		}
	}

	public static void options(int option) {
		MainStudent std = new MainStudent();
		Classes cls = new Classes();
		switch (option) {
		case 1:
			std.studentDataEntry();
			break;
		case 2:
			cls.classroomInfos();
			break;
		case 3:
			std.findStudentByNumber();
			break;
		}
	}
}
