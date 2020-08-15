package com.syntax.class32_HWCW;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	
	public static void main(String[] args) {
		
//		Create a Map that will store Employee name and salary. 
//		Write a logic to retrieve an employee who gets the highest salary. 
//		Output should be in the below format
//		John Smith=$100000
		
		Map<String, Double> employee = new LinkedHashMap<>();
		employee.put("James", 120000.0 );
		employee.put("Carl", 90000.0 );
		employee.put("Beth", 180000.0 );
		employee.put("Karen", 95000.0 );
		employee.put("Blake", 100000.0 );
		
		Set<Entry<String, Double>> emp = employee.entrySet();
		
		Double max = 0.0;
		String name = "";
		
		for(String names: employee.keySet()) {
			double salary = employee.get(names);
			if(salary > max) {
				name = names;
				max = salary;
			}
		}
		
		System.out.println(name + " =$" + max);
		
		
	}

}
