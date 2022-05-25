package ktra;

import java.io.Serializable;
import java.util.Date;

public final class Student extends Person implements Serializable, Comparable{
	private
		String studentID;
		String major;
		Date enrolledDate;
	//constructor
	Student(){}
	Student(String studentID, String major, Date enrolledDate){
		super();
		setStudentID(studentID);
		setMajor(major);
		setEnrolledDate(enrolledDate);
	}
	Student(String studentID, String major, Date enrolledDate, String name, Date birthday, byte gender){
		super(name, birthday, gender);
		setStudentID(studentID);
		setMajor(major);
		setEnrolledDate(enrolledDate);
	}
	//getter and setter
	public String getStudentID() {
			return studentID;
	}

	public void setStudentID(String studentID) {
			this.studentID = studentID;
	}

	public String getMajor() {
			return major;
	}

	public void setMajor(String major) {
			this.major = major;
	}

	public Date getEnrolledDate() {
			return enrolledDate;
	}

	public void setEnrolledDate(Date enrolledDate) {
			this.enrolledDate = enrolledDate;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}