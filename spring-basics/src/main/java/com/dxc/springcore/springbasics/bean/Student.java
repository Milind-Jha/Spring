package com.dxc.springcore.springbasics.bean;

public class Student {
	private int studentID;
	private String studentName;
	private String studentAddress;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentID, String studentName, String studentAddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public int getStudentID() {
		return studentID;
	}
	@Override
	public String toString() {
		return "studentID : "+ studentID +" studentName : "+studentName+" studentAddress : "+studentAddress;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getstudentAddress() {
		return studentAddress;
	}
	public void setstudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
}
