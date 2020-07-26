package com.syntax.class28_HWCW;

public class Registration {
	// Create Registration Class in which you would have variables as email,
	// userName and password that have an access scope only within its own class.
	// After creating an object of the class user should be able to call methods and
	// in each method separately pass values to set users email, username and
	// password.
	// Requirements:
	// Valid email consider to be only yahoo
	// Valid userName and password cannot be empty and should be of length larger
	// than 6 characters. Also valid password cannot contain userName.

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
		if (userName.isEmpty()) {
			System.out.println("Username cannot be empty");
			
		} else {
			if (userName.length() > 6) {
			this.userName = userName;	
			} else {
				System.out.println("username is too short");

			}
		}
	}

	public void setPassword(String password) {
		if (userName.isEmpty()) {
			System.out.println("password cannot be empty");
		} else {
			if (password.length() > 6) {
				this.password = password;
				if (!password.contains(userName)) {

				} else {
					System.out.println("Password cannot contain username");
				}
			} else {
				System.out.println("Password is too short");
			}

		}

	}

}
