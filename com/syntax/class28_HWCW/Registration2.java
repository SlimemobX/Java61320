package com.syntax.class28_HWCW;

public class Registration2 {

	private String email, userName, password;

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		if (email.contains("yahoo")) {
			this.email = email;
		} else {
			System.out.println("Please use yahoo");
		}

	}

	public void setUserName(String userName) {
		if (userName.length() > 0 && userName.length() > 6) {
			this.userName = userName;

		}
	}

	public void setPassword(String password) {
		if (password.length() > 0 && password.length() > 6) {
			this.password = password;
		}

		if (!password.contains(userName)) {

		} else {
			System.out.println("Password cannot contain username");
		}

	}
}
