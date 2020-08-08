package com.syntax.class31_HWCW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Students {

	public static void main(String[] args) {

		// Create a Set collection that will hold Objects of Student Type.
		// In this set we do not care about the insertion order.
		// Each student object should have name and studentID. Display name of each
		// student.

		Set<String> students = new HashSet<>();
		students.add("Jake 439594");
		students.add("Paul 049043");
		students.add("Clair 034304");
		students.add("April 847348");
		students.add("Bailey 847823");

		System.out.println(students);

		Iterator<String> stu = students.iterator();
		while (stu.hasNext()) {
			String obj = stu.next();
			System.out.println(obj);
		}

	}

}
