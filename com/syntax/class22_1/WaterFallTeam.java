package com.syntax.class22_1;

import com.syntax.class22.Employee;

public class WaterFallTeam extends Employee{
	public void slowWork(){
		
	}
	
	
	public static void main(String[] args) {
		
		WaterFallTeam wt = new WaterFallTeam();
		WaterFallTeam.company = "Facebook";
		wt.fullName = "John Snow";// protected variable is accessible due to inheritance
		System.out.println(wt.fullName);
		
	}

}
