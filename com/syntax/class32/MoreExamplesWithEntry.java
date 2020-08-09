package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MoreExamplesWithEntry {
	
	public static void main(String[] args) {
		
		Map<String, String> movies = new TreeMap<>();
		
		movies.put("Comedy", "Grown ups");
		movies.put("Horror", "The Exorcist");
		movies.put("Fiction", "Avenger");
		movies.put("Action", "Fast and Furious");
		movies.put("Romance", "Dear John");
		
		
		System.out.println(movies);
		
		
		Set<Entry<String,String>> allEntries = movies.entrySet();
		
		Iterator<Entry<String, String>> it = allEntries.iterator();
		
		while(it.hasNext()) {
			Entry<String,String> ent = it.next();
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println(key + " === " + value);
			
			
		}
		
		System.out.println("----------For Loop----------");
		
		for(Entry<String,String> entry: allEntries) {
			String pair = entry.getKey() + " --- " +entry.getValue();
			System.out.println(pair);
		}
		
		
		
		
		
	}

}
