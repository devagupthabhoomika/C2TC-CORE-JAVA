package com.tnsif.daysix.singleInheritence;

public class Student  extends Citizen 
{
	private int rollNo;
	private String collegeName;
	
	
	
	
	public Student(String name, String aadharNo, String address, long phonenumber) {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String aadharNo, String address, long phonenumber, int rollNo, String collegeName) {
		super(name, aadharNo, address, phonenumber);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ",Name = "+getName()+",AadharNo ="+getAadharNo()+",Address="+getAddress()+",Phonenumber="+getPhonenumber()+"];
		
		
	}
	
	
	
	

}
