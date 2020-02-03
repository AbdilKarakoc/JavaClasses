package com.class32;

public class Person {
	
	private String firstname;
	private String lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;
	
	public String getfirstname(String firstname) {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname=firstname;
	}
	
	
	public String getlastname(String lastname) {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname=lastname;
	}
	
	
	public String getbirthmonth(String birthmonth) {
		return birthmonth;
	}
	public void setbirthmonth(int birthmonth) {
		this.birthmonth=birthmonth;
	}
	
	
	public int getbirthday(int birthday) {
		return birthday;
	}
	public void setbirthday(int birthday) {
		this.birthday=birthday;
	}
	
	
	public int getbirthyear(int birtyear) {
		return birthyear;
	}
	public void setbirhyear(int birthyear) {
		this.birthyear=birthyear;
	}
	
	
	public String getssn(String ssn) {
		return ssn;
	}
	public void setssn(String ssn) {
		this.ssn=ssn;
	}
	
	public java.lang.String formatBirthday(String birthmonth,String birthday,String birthyear) {
		return toString();
	}
}
