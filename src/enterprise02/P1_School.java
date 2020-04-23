package enterprise02;

public class P1_School {
	
	public static void main(String[] args) {
//===============Welcome BugShooters School=============
//============This is manager suite====================
//==========You can add student by using student object=====
//==========You can search for a student by his/her number using findStudent object=======
//==========You can reach classroom information by using classroom object===========
		P7_ClassroomEntry classroom = new P7_ClassroomEntry();
		P7_ClassroomEntry student = new P7_ClassroomEntry();
		P8_FindStudent findStudent = new P8_FindStudent();

		student.studentDataEntryOldVersion();
		classroom.classroomInfosOldVersion();
		findStudent.findStudentByNumberOldVersion();
		findStudent.findStudentByFullNameOldVersion();
		student.studentDataEntryOldVersion();

	}
}
