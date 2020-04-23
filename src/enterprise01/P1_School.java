package enterprise01;

public class P1_School {

	public static void main(String[] args) {
		P2_Registration student1 = new P2_Registration("zafer","xa",111);
		
		
		P2_Registration student0 = new P2_Registration("Ali", "1A", 1111);
		student0.StudentInfosFirst();

		P3_SecretRegis student2 = new P3_SecretRegis(); // Default Constructor works. Result no name.
		System.out.println(student2.getName());
		System.out.println(student2.getClassroom());
		System.out.println(student2.getStudentNum());

		P3_SecretRegis student3 = new P3_SecretRegis("A","u2",220);
		System.out.println("============================");
		student3.setName("Baris");
		System.out.println(student3.getName());
		System.out.println("============================");
		System.out.println(student3.getName());
		System.out.println(student3.getClassroom());
		System.out.println(student3.getStudentNum());
		student3.StudentInfosFirst();

		P3_SecretRegis student4 = new P3_SecretRegis();
		student4.setName("Baris Var");
		student4.setClassroom("4D");
		student4.setStudentNum(4444);
		System.out.println(student4.getName());
		System.out.println(student4.getClassroom());
		System.out.println(student4.getStudentNum());
		student4.StudentInfosFirst();

		P4_AutoSecretReg student = new P4_AutoSecretReg();
		student.StudentDataEntryFirst();
		student.StudentInfosFirst();

		P7_ClassroomEntry classroom = new P7_ClassroomEntry();
		classroom.ClassroomDataEntryFirst();
		classroom.ClassroomInfosFirst("1B");

		P8_FindFromDynamicList findingStu = new P8_FindFromDynamicList();
		findingStu.FindStudentFromDynamicList("123");

		P6_FindStudent findStudent = new P6_FindStudent(1001);
		findStudent.findStudent();

	}
}

//Registration student = new Registration("Ali", "2A", 1001); 