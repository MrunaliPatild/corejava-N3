package org.tnsif.singlelevelinheritance;

public class Student extends Citizen {
	//private data members
	private int rollno;
	private String studentname;
	//getters and setters
	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getStudentname() {
		return studentname;
	}


	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}


	public Student() {
		super();
	}


	public Student(String name,String adharno,String city,long mobno,int rollno, String studentname) {
		super(name,adharno,city,mobno);
		this.rollno = rollno;
		this.studentname = studentname;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studentname=" + studentname + ", getRollno()=" + getRollno()
				+ ", getStudentname()=" + getStudentname() + ", getName()=" + getName() + ", getAdharno()="
				+ getAdharno() + ", getCity()=" + getCity() + ", getMobno()=" + getMobno() + "]";
	}
	
		
}
	


