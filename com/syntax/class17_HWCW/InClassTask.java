package com.syntax.class17_HWCW;

public class InClassTask {
	//Create a method createEmail(). Based on values of users name, lastName and email type,
	//your method should return complete email Address. 
	//Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
	
	String createmail(String name, String lastName,String emailType) {
		String mail = name + lastName + "@" + emailType + ".com";
		return mail.toLowerCase();
	}
	
	
	
	// Write a method to return whether given number is prime or not?
			boolean isPrime (int a) {
				boolean prime = true;
				if (a>1) {
					for (int i = 2; i <= a/i; i++ ) {
						if (a % i == 0) {
							prime = false;
							break;
						}
					}
				}else {
					prime=false;
				}
			return prime;
			}
	
	

}
