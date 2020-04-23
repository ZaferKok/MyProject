package enterprise02;

import java.util.Scanner;

public class P4_AutoSecretReg {
	private String name = "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";
	private String classroom;
	private int studentNum;
	
	public P4_AutoSecretReg() {

	}
	public P4_AutoSecretReg(String name, String classroom, int studentNum) {
		this.name=name;
		this.classroom=classroom;
		this.studentNum=studentNum;
	}
	public void studentDataEntrySecond() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student name and lastname : ");
		String name = scan.nextLine();
		setName(name);
		System.out.println("Enter classroom : ");
        String classroom = scan.nextLine();
        setClassroom(classroom);
		System.out.println("Enter student number : ");
        int studentNum = scan.nextInt();
        setStudentNum(studentNum);
	}
	public void studentInfosSecond() { // This is a method
		
		System.out.println("Information of the student...");
		System.out.println("Name and lastname : " + getName());
		System.out.println("Classroom : " + classroom);
		System.out.println("Student number : " + this.studentNum);
		System.out.println("The student has been successfully registrated");
		
	}
	//=====================================================================
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//=====================================================================
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	//=====================================================================
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	//=====================================================================
}
