package com.training.bean;

public class UserBean {
	private String userEName;
	private String userEmail;
	private String userSubject;
	private String userMsg;

	public UserBean() {
	}

	public UserBean(String userEName, String userEmail, String userSubject, String userMsg) {
		super();
		this.userEName = userEName;
		this.userEmail = userEmail;
		this.userSubject = userSubject;
		this.userMsg = userMsg;
		
	}

	public String getUserEName() {
		return userEName;
	}

	public void setUserEName(String userEName) {
		this.userEName = userEName;
	}

	public String getEmail() {
		return userEmail;
	}

	public void setEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getSubject() {
		return userSubject;
	}

	public void setSubject(String userSubject) {
		this.userSubject = userSubject;
	}
	public String getuserMsg() {
		return userMsg;
	}

	public void setuserMsg(String userMsg) {
		this.userMsg = userMsg;
	}
//
//	@Override
//	public String toString() {
//		return "LoginBean [userName=" + userName + ", password=" + password + "]";
//	}

}
