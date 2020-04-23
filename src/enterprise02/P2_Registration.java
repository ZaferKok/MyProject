package enterprise02;

public class P2_Registration {

	String name;
	String classroom;
	int studentNum;
	
	public P2_Registration() {

	}
	public P2_Registration(String name, String classroom, int studentNum) {
		this.name=name;
		this.classroom=classroom;
		this.studentNum=studentNum;
	}
	public void studentInfosSecond() { // This is a method
		
		System.out.println("Information of the student...");
		System.out.println("Name and lastname : " + this.name);
		System.out.println("Classroom : " + this.classroom);
		System.out.println("Student number : " + this.studentNum);
		System.out.println("The student has been successfully registrated");
		
	}
}
