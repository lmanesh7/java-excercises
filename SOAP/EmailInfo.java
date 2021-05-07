package com.soap.net;

public class EmailInfo {
	private String name;
	private String emailid;
	private int PhoneNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	
		public EmailInfo(String name, String emailid, int phoneNo) {
			super();
			this.name = name;
			this.emailid = emailid;
			PhoneNo = phoneNo;
		}
		public EmailInfo() {
			super();
			// TODO Auto-generated constructor stub
		}
	
}
