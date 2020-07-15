package com.syntax.class21;

public class TeacherTest {
	public static void main(String[] args) {
		
		Teacher_HW t = new Teacher_HW();
		t.teaches();
		t.support();
		
		System.out.println("--------Chemistry Teacher-------");
		ChemistryTeacher ct = new ChemistryTeacher();
		ct.name = "Jane";
		ct.lastName = "Smith";
		ct.experience = 7;
		ct.enjoy = true;
		ct.coolTeacher = true;
		
		ct.diplayInfo();
		ct.teaches();
		ct.support();
		ct.chem();
		
		System.out.println("--------Math Teacher-------");
		MathTeacher mt = new MathTeacher();
		
		mt.name = "Becca";
		mt.lastName = "Jones";
		mt.experience = 15;
		mt.enjoy = true;
		mt.allowsCalculator= true;
		
		mt.diplayInfo();
		mt.teaches();
		mt.support();
		mt.math();
		
		System.out.println("--------Piano Teacher-------");
		PianoTeacher pt = new PianoTeacher();
		pt.name = "Robert";
	    pt.lastName = "Grimes";
		pt.experience = 2;
		pt.enjoy = true;
		pt.tough = true;
		
		pt.diplayInfo();
		pt.teaches();
		pt.support();
		pt.music();
		
		
	}
}
