package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("studentName");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("studentDept");
	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("studentId");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}

}
