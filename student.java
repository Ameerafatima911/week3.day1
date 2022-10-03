package week3.day1;


public class student extends department {
	public void studentName() {
		System.out.println("Student Name from Student");
	}
	public void studentDept() {
		System.out.println("Student Dept from Student");
	}
	public void studentId() {
		System.out.println("Student ID from Student");
	}
	public static void main(String[] args) {
		
		student objstudent = new student();
		objstudent.studentName();
		objstudent.studentDept();
		objstudent.studentId();
		
		objstudent.deptName();
		
		objstudent.collegeCode();
		objstudent.collegeName();
		objstudent.collegeRank();
}
}
