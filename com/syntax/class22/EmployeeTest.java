package com.syntax.class22;

public class EmployeeTest {
	public static void main(String[] args) {
		
		System.out.println("----ScrumTeam-----");
		ScrumTeam st = new ScrumTeam();
		ScrumTeam.company = "Google";
		st.salary = 150000;
		st.ceremonies = "Daily Standup";
		
		st.work();
		st.getPaid();
		st.attendsMeeting();
		st.workOnBuildingSoftware();
		
		System.out.println("-----Product Owner-------");
		ProductOwner po = new ProductOwner();
		// ProductOwner.company have an access too
		po.salary = 200000;
		po.fullName = "John Doe";
		// po.ssn ---> not visible
		
		po.work();
		po.getPaid();
		po.communicate();
		po.prioritizePb();
		
		System.out.println("--------Scrum Master----");
		ScrumMaster sm = new ScrumMaster();
		sm.salary = 180000;
		
		sm.work();
		sm.getPaid();
		sm.shieldTeam();
		sm.doMeetings();
		
		System.out.println("-------Developer-----");
		Developer dev = new Developer();
		dev.salary = 160000;
		
		dev.work();
		dev.getPaid();
		dev.code();
		
		System.out.println("---------Tester---------");
		Tester test = new Tester();
		test.salary = 120000;
		
		test.work();
		test.getPaid();
		test.test();
		
		System.out.println("--------Business Analyst-----");
		BusinessAnalyst ba = new BusinessAnalyst();
				
		ba.salary = 190000;
		
		ba.work();
		ba.getPaid();
		ba.gatherRequirements();
		
	}

}
