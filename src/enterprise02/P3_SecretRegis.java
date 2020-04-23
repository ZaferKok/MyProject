package enterprise02;

public class P3_SecretRegis {
	
	private String name = "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";
	private String classroom;
	private int studentNum;
	
	public P3_SecretRegis() {

	}
	public P3_SecretRegis(String name, String classroom, int studentNum) {
		this.name=name;
		this.classroom=classroom;
		this.studentNum=studentNum;
	}
	public void studentInfos() { // This is a method
		
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

