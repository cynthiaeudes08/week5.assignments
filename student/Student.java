package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("STUDENT NAME: RIYA");
	}
	public void studentDept() {
		System.out.println("STUDENT DEPARTMENT: ECE");
	}
	public void studentId() {
		System.out.println("STUDENT ID: 111");
	}
public static void main(String[] args) {
	Student std=new Student();
	std.collegeName();
	std.collegeCode();
	std.collegeRank();
	std.deptName();
	std.studentName();
	std.studentDept();
	std.studentId();
}



}
