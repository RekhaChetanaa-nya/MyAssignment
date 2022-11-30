package org.overloading;

public class Students {
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
	}
	public void getStudentInfo(int id,String name) {
		// TODO Auto-generated method stub
		System.out.println("The student id is--"+id+"--and name is-"+name);
	}
	public void getStudentInfo(String email,long mobilenumber)
	{
		System.out.println("Student's mail id--"+email+"--mobile number is"+mobilenumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		s.getStudentInfo(1234);
		s.getStudentInfo(1234, "Rekha");
		s.getStudentInfo("rekha@gmail.com", 1234567890);
	}

}
