package com.users;

public class Users {
	private String firstName;
	private String lastName;
	private String userName;
	private String pass;
	private String city;
	private String email;
	private long moNum;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMoNum() {
		return moNum;
	}

	public void setMoNum(long moNum) {
		this.moNum = moNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "First Name = " + firstName + "\n Last Name = " + lastName + "\n User Name = " + userName + "\n pass = "
				+ pass + "\n City = " + city + "\n Email Id = " + email + "\n Mobile Number = " + moNum;
	}

}
