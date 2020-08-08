package com.syntax.class31_HWCW;

import java.util.HashMap;
import java.util.Map;

public class MapOfBuliding {
	
	public static void main(String[] args) {
		
		
//		Create a map of a building. 
//		Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). 
//		Insert 7 entries with duplicate keys and values. 
//		Check how many entries you have?
//		Update company on a 4th floor 
//		Remove company on the 7th floor
//		Print your map
		
		
		Map<Integer,String> building = new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Facebook");
		building.put(3, "Yahoo");
		building.put(4, "MySpace");
		building.put(5, "Snapchat");
		building.put(6, "TikTok");
		building.put(7, "Twitter");
		building.put(1, "Google");
		
		System.out.println(building);
		System.out.println(building.size());
		
		System.out.println("-------Update Company on 4th floor---------");
		building.put(4, "Instagram");
		
		System.out.println(building);
		
		
		System.out.println("-------Removing Company on 7th floor---------");
		building.remove(7);
		System.out.println(building);
		
		
		
		
	}

}
