package com.hack.bean;


public class EmploymentBean {

	private  boolean employmentStatus;
	private  byte[] employmentLetter;
	private String employer;
	private String salary;
	public boolean isEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(boolean employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public byte[] getEmploymentLetter() {
		return employmentLetter;
	}
	public void setEmploymentLetter(byte[] employmentLetter) {
		this.employmentLetter = employmentLetter;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
