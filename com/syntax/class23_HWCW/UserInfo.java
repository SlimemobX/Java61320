package com.syntax.class23_HWCW;

public class UserInfo extends UserClass{
	
	String address;
	
	public UserInfo(String name,String mobileNumber, String address) {
		super(name,mobileNumber);
		this.address = address;
	}
	
	void UserDetails() {
		System.out.println("The name is " + name + " their number is " 
				+ mobileNumber + " and lives at "+ address);
	}

}
