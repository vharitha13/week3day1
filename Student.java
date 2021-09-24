package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("****Student Details*****");
		System.out.println("Haritha");
	}
	public void studentDept() {
		System.out.println("IT");
	}
	public void studentID() {
		System.out.println("1031");
	}
	public static void main(String[] args) {
		Student stud=new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.departmentName();
		stud.studentName();
		stud.studentDept();
		stud.studentID();
	}
}
