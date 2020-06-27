package com.syntax.class14;

import java.util.Scanner;

public class kseniiaWay {

	public static void main(String[] args) {
		 //  Accept username, password and confirm password from a user and check following requirements:

			//	  Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
			//	  Password should be minimum 8 characters, if less → message=“Password is too short”.
			//	  Password cannot contain username if so, → message=“Password cannot contain username”.
			//	  Password should match confirmed password, if not  → message=“Passwords do not match”.

			//	  Only after all requirements met → message “Your username and password has been created”
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter Username");
			String username = scan.nextLine();
			System.out.println("Please enter Password");
			String password = scan.nextLine();
			
			
		
			if (username.isEmpty() || password.isEmpty()) {
				System.out.println("Username and Password cannot be empty");		
			}else if (password.length() < 8) {
				System.out.println("Passwrod is too short");
			}else if (password.contains(username)) {
				System.out.println("Password cannot contain username");
				
			}else {
				System.out.println("Please confrim Password");
				String confirmPW = scan.nextLine();
				
				 if (!password.equals(confirmPW)) {
						System.out.println("Password does not match");
					}else {
						System.out.println("Your username and password has been created");
					}
			}

	}

}
